package com.vittech.testbase;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.vittech.pages.LoginPage;
import com.vittech.playwright_factory.PlaywrightFactory;
import com.vittech.utility.ExcelDataProvider;

public class TestBase {
	
	
	protected LoginPage lp;
	public Page page;
	PlaywrightFactory pf;
	protected Properties prop;
	protected ExcelDataProvider excelDataProvider;
	
	
	@BeforeSuite
	 public void init()
	 {
		excelDataProvider=new ExcelDataProvider("testdata","Sheet2");
	 }
	
	@BeforeTest
	public void setup()
	{
		PlaywrightFactory pf= new PlaywrightFactory();
		page = pf.browserFactory("firefox");
		 
		prop=pf.getProperties();
		
		lp=new LoginPage(page);
		
		
	}
	
	
	@AfterTest
	public void teardown()
	{
		page.close();
	}

}

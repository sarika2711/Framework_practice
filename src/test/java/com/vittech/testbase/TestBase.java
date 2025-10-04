package com.vittech.testbase;

import org.testng.annotations.BeforeTest;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.vittech.pages.LoginPage;
import com.vittech.playwright_factory.PlaywrightFactory;

public class TestBase {
	
	Browser browser;
	BrowserContext context;
	LoginPage lp;
	public Page page;
	PlaywrightFactory pf;
	
	@BeforeTest
	public void setup()
	{
		PlaywrightFactory pf= new PlaywrightFactory();
		page=pf.browserFactory("CHROMIUM");
		
		 lp=new LoginPage(page);
		 
		 
		
	}
	
	
	public void teardown()
	{
		browser.close();
		context.close();
		page.close();
	}

}

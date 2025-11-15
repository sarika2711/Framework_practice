package com.vittech.testcase;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.ReporterConfig.Property;

import com.microsoft.playwright.Page;
import com.vittech.pages.LoginPage;
import com.vittech.testbase.TestBase;
import com.vittech.utility.ExcelDataProvider;

public class LoginPageTC2 extends TestBase {
	
	
@Test
	public void loginTest() throws InterruptedException
	{
	
	lp.SetUsername(excelDataProvider.getStringCellData(1, 0));
	lp.SetPassword(excelDataProvider.getStringCellData(1, 1));
	
	lp.ClickLogin();
	
	Thread.sleep(3000);
	
	System.out.println(page.title()+  "  "+ page.url());
	
	}
	

@Test(dataProvider="getTestData")
public void loginTest(String username, String password)
{
	System.out.println("Username is "+username);
	System.out.println("Password is "+password);
}


@DataProvider
public String[][] getTestData()
{
	return excelDataProvider.getTestData();
	
}

}

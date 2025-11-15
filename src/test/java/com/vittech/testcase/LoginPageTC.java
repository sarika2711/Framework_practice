package com.vittech.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.ReporterConfig.Property;

import com.microsoft.playwright.Page;
import com.vittech.pages.HomePage;
import com.vittech.pages.LoginPage;
import com.vittech.testbase.TestBase;

public class LoginPageTC extends TestBase {
	
	
	
	// Page page;
@Test(priority=1)
	public void VerifyLogoVisible()
	{
	   lp = new LoginPage(page);
		boolean status=lp.VerifyLogo();
		Assert.assertTrue(status);
	}
	
@Test(priority=2)
public void verifyOrangeHRMLoginTest() {

	//lp.LoginPageTitle();
	//lp.LoginPageUrl();
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
	
	lp.SetUsername(prop.getProperty("username"));
	lp.SetPassword(prop.getProperty("password"));
	
    lp.ClickLogin();
}




}

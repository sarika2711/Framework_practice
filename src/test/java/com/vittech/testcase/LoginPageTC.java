package com.vittech.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.ReporterConfig.Property;

import com.microsoft.playwright.Page;
import com.vittech.pages.LoginPage;
import com.vittech.testbase.TestBase;

public class LoginPageTC extends TestBase {
	
	LoginPage lp;
	// Page page;
@Test
	public void VerifyLogoVisible()
	{
	   lp = new LoginPage(page);
		boolean status=lp.VerifyLogo();
		Assert.assertTrue(status);
	}
	
@Test
public void verifyOrangeHRMLoginTest() {

	lp.LoginPageTitle();
	lp.LoginPageUrl();
	lp.SetUsername(prop.getProperty("username"));
	lp.SetPassword(prop.getProperty("password"));
	
	lp.ClickLogin();
}
}

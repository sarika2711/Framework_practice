package com.vittech.testcase;

import org.testng.annotations.Test;

import com.vittech.pages.HomePage;
import com.vittech.testbase.TestBase;

public class HomePageTC extends TestBase
{
	
private HomePage hm;
	
	@Test(priority = 1)
	public void verifyOrangeHRMLoginTest()
	{
		lp.SetUsername(prop.getProperty("username"));
		lp.SetPassword(prop.getProperty("password"));
		hm = lp.ClickLogin();
	}
	
	@Test(priority = 2)
	public void navigateToAdminPageTest() 
	{	
		hm.NavigateToAdmin();
	}
	
	@Test(priority = 3)
	public void navigateToDashboardTest() 
	{		
		hm.NavigateToDashboard();
	}

}

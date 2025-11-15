package com.vittech.pages;

import com.microsoft.playwright.Page;
import com.vittech.testbase.TestBase;

public class HomePage{
  
	private Page page;
	
	private static String hm_Link="//span[text()='Dashboard']";
	private static String admin_Link="//span[text()='Admin']";

	public HomePage(Page page) 
	{
		this.page=page;
	}

	
	public boolean loginStatus()
	{
		try {
			return page.isVisible(hm_Link);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
	}
	
	
	public AdminPage NavigateToAdmin()
	{
		try {
			page.locator(admin_Link).click();
			return new AdminPage(page);
		} 
		
		catch (Exception e) {
		     e.printStackTrace();
			return null;
		}
	}
	
   public DashboardPage NavigateToDashboard()
   {
	   try {
		page.locator(hm_Link).click();
		   return new DashboardPage(page);
	} 
	   
	   catch (Exception e) {
		
		e.printStackTrace();
		return null;
	}
	
   }



	
}

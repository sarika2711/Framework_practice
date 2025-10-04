package com.vittech.pages;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	Page page;
	
	private String logo="//img[@alt='company-branding']";
	private String username_txt="//input[@name='username']";
	private String password_txt="//input[@name='password']";
	private String button="//button[@type='submit']";
		
		public LoginPage(Page page)
		{
			this.page=page;
		}
		
		
		
		public boolean VerifyLogo()
		{
			return page.locator(logo).isVisible();
		}
		
		public String LoginPageTitle()
		{
			String title=page.title();
			System.out.println(title);
			return title;
		}
		
		
		public String LoginPageUrl()
		{
			String url=page.url();
			System.out.println(url);
			return url;
		}
		
		
	public void SetUsername(String username)
	{
		try
		{
			page.locator(username_txt).fill(username);
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void SetPassword(String password)
	{
		try
		{
			page.locator(password_txt).fill(password);
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void ClickLogin()
	{
		try
		{
			page.locator(button).click();
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

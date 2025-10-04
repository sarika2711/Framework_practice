package com.vittech.playwright_factory;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
	Browser browser;
	Page page;
	
	public Page browserFactory(String browserName)
	{
		browserName.trim().toLowerCase();
		
		switch(browserName)
		{
		case "chromium":
	            browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	            break;
		
		case "forefox":
			browser = Playwright.create().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
		   
		case "webkit":
			browser = Playwright.create().webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
			break;
			
		default:
			
			 browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
			 break;
		
		}
		
		 page = browser.newPage();
		 page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 return page;
	}

}

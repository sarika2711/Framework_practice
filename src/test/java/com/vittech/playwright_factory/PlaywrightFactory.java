package com.vittech.playwright_factory;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightFactory {
	Browser browser;
	Page page;
	Properties prop;
	
	public Page browserFactory(String browserName)
	{
		browserName.trim().toLowerCase();
		
		switch(browserName)
		{
		case "chromium":
	            browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
	            break;
		
		case "forefox":
			    browser = Playwright.create().firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
			    break;
		   
		case "webkit":
			    browser = Playwright.create().webkit().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
			    break;
			
		default:
			
			    browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000));
			    break;
		
		}
		
		 page = browser.newPage();
		 page.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 return page;
	}
	
	
	public Properties getProperties() {

		try {
			File fs = new File("./src/test/resources/config/prop.properties");
			FileInputStream fins = new FileInputStream(fs);
			prop = new Properties();
			prop.load(fins);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return prop;
	}

}

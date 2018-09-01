package com.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LandingPage;

public class TestBase {

	public WebDriver driver;
	
	public WebDriver launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\LatestChrome\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public LandingPage enterURL(String url) {
		System.out.println("Driver ::: "+driver);
		driver.get(url);
		
		return new LandingPage(driver);
	}
}

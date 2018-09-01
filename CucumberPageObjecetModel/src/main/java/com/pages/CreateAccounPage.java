package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.CreateAccountProperties;
import com.util.WebDriverUtils;

public class CreateAccounPage extends WebDriverUtils implements CreateAccountProperties{

	WebDriver driver;
	
	public CreateAccounPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	
	public void enterFirstName(String testData) {
		enterText(FIRSTNAME_LOCATOR, testData);
	}
}

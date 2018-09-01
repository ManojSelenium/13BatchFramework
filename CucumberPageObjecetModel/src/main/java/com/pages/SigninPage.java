package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.SigninPageProeprties;
import com.util.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SigninPageProeprties {

	
	WebDriver driver;
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public boolean emialAddressDisplayed() {

		return isElementPresent(emailAddressLocator);
	}
	
	public CreateAccounPage clickCreateAnAccountButton() {
		click(CreateAccountButtonLocator);
		return new CreateAccounPage(driver);
	}
	
	public void enterEmailAddress(String testData) {
		enterText(emailAddressLocator, testData);
	}
}

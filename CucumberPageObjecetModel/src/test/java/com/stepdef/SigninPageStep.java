package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.SigninPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class SigninPageStep {

	WebDriver driver;
	
	Steps steps;
	public SigninPageStep(Steps steps) {
		this.steps=steps;
	}
	
	@Then("^user should see signinpage displayed$")
	public void signinPageDisplayed() {
		Assert.assertTrue(steps.signinPage.emialAddressDisplayed());
	
	}
	
	@And("^user email address \"([^\"]*)\"$")
	public void userEnteredEmailAddress(String emailAddress) {
		steps.signinPage.enterEmailAddress(emailAddress);
	}
	
	@And("^user click on create an acccount button$")
	public void clickOnCreateAnAccountButton() {
		steps.createAccounPage=steps.signinPage.clickCreateAnAccountButton();
	}
}


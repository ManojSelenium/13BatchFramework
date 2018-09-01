package com.stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.LandingPage;
import com.pages.SigninPage;
import com.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LandingPageStep {

	WebDriver driver;
	Steps steps;
	
	public LandingPageStep(Steps steps) {
		this.steps=steps;
	}
	
	@Given("^user launch browser$")
	public void user_Launch_Browser() {
		steps.testBase=new TestBase();
		driver=steps.testBase.launchBrowser();
		//driver=new TestBase().launchBrowser();
	}
	
	@When("^user enter url \"([^\"]*)\"$")
	public void enterURL(String url) {
		steps.landingPage=steps.testBase.enterURL(url);
	}
	
	@And("^user click on signin option$")
	public void clickSigninOption() {
		
		steps.signinPage=steps.landingPage.clickSignin();
	}
	

}

package com.stepdef;

import cucumber.api.java.en.And;

public class CreateAccountPageStep {

	Steps steps;
	public CreateAccountPageStep(Steps steps) {
		this.steps=steps;
	}
	
	@And("^user enter firstName \"([^\"]*)\"$")
	public void enterFirstName(String firstName) {
		steps.createAccounPage.enterFirstName(firstName);
	}
}

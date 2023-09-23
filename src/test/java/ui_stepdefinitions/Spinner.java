package ui_stepdefinitions;

import utilities.PageManager;

import io.cucumber.java.en.*;

public class Spinner {
	private PageManager pages = PageManager.getInstance();


	@When("User clicks on Spinner")
	public void user_clicks_on_spinner() {
		pages.homePage().clickOnSpinner();
		pages.SpinnerPage().validatePageload();
		

	}

	@Then("User should select a value of {string}")
	public void user_should_select_a_value_of(String string) {
		pages.SpinnerPage().selectValue();

	}

	@Then("User should click on every button")
	public void user_should_click_on_every_button() {
		pages.SpinnerPage().selectDE();
		pages.SpinnerPage().unselectDE();
		pages.SpinnerPage().selectWidget();
		pages.SpinnerPage().unselectWidget();
		pages.SpinnerPage().getValue();
		pages.SpinnerPage().popUpMessage();
		pages.SpinnerPage().setValue5();
		pages.SpinnerPage().validateValue5();

	}

}

package ui_stepdefinitions;

import io.cucumber.java.en.*;
import utilities.Keywords;
import utilities.PageManager;

public class ButtonPageSteps {
	
	PageManager pages = PageManager.getInstance();
	
	
	@When("user click <Button> button")
	public void user_click_button_button() {
	   pages.homePage().clickOnButton();
	}

	@Then("user is loaded on Button page")
	public void user_is_loaded_on_button_page() {
	   pages.buttonPage().validatePageload();
	}

	@Then("user can click all the buttons")
	public void user_can_click_all_the_buttons() throws InterruptedException {
		
		
	    pages.buttonPage().clickAButtonElement1();
	    pages.buttonPage().clickASubmitButton1();
	    pages.buttonPage().clickAnAnchor1();
	    pages.buttonPage().clickAButtonElement2();
	    pages.buttonPage().clickASubmitButton2();
	    pages.buttonPage().clickAnAnchor2();
	}
}

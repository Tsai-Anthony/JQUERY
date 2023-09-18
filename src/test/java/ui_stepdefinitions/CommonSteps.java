package ui_stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.PageManager;

public class CommonSteps {

private PageManager pages = PageManager.getInstance();
	
	@Given("user is on Jquery homepage")
	public void user_is_on_jquery_homepage() {
	    pages.homePage().navigate();
	    pages.homePage().validatePageload();
	}

	
}

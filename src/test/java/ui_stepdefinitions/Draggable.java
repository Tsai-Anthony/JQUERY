package ui_stepdefinitions;

import io.cucumber.java.en.*;

import utilities.PageManager;

public class Draggable {

	private PageManager pages = PageManager.getInstance();

	@Given("Users goes to jQuery.com")
	public void users_goes_to_j_query_com() {
		pages.jQuery().navigate();
		// this is to navigate to the website
		pages.jQuery().validateHomePage();
		// this is to validate that the website we navigate is correct
	}

	@When("User clicks on Draggable")
	public void user_clicks_on_draggable() {
		pages.DraggablePage().draggableTab();
		// this clicks on the tab to go to the draggable page
		pages.DraggablePage().validatePageload();
		// this validates if we are on draggable page

	}

	@Then("User should click and drag the box")
	public void user_should_click_and_drag_the_box() {
		pages.DroppablePage().moveBox();
		// this performs the action of moving the box
		pages.DraggablePage().isElementAtPosition(168, 113);
		// validates if the box is in the correct position

	}

}
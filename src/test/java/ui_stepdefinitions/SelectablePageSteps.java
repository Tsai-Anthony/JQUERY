package ui_stepdefinitions;

import io.cucumber.java.en.*;
import utilities.Keywords;
import utilities.PageManager;

public class SelectablePageSteps {

	private PageManager pages = PageManager.getInstance();



	@When("user click <Selectable> button")
	public void user_click_selectable_button() {
		pages.homePage().SelectablePage();
		
	}

	@Then("user goes in to the frame")
	public void user_goes_in_to_the_frame() {
		pages.SelectablePage().getIntoFrame();
		
	}
	

	@Then("user can clicks Item1 button")
	public void user_can_clicks_item1_button() {
		pages.SelectablePage().clickItem1();
	}

	@Then("user can clicks Item2 button")
	public void user_can_clicks_item2_button() {
		pages.SelectablePage().clickItem2();
	}

	@Then("user can clicks Item3 button")
	public void user_can_clicks_item3_button() {
		pages.SelectablePage().clickItem3();
	}

	@Then("user can clicks Item4 button")
	public void user_can_clicks_item4_button() {
		pages.SelectablePage().clickItem4();
	}

	@Then("user can clicks Item5 button")
	public void user_can_clicks_item5_button() {
		pages.SelectablePage().clickItem5();
	}

	@Then("user can clicks Item6 button")
	public void user_can_clicks_item6_button() {
		pages.SelectablePage().clickItem6();
	}

	@Then("user can clicks Item7 button")
	public void user_can_clicks_item7_button() {
		pages.SelectablePage().clickItem7();
	}

}

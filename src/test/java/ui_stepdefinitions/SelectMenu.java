package ui_stepdefinitions;

import utilities.PageManager;

import io.cucumber.java.en.*;

public class SelectMenu {
	private PageManager pages = PageManager.getInstance();

	@When("User clicks on Selectmenu")
	public void user_clicks_on_selectmenu() {
		pages.homePage().clickOnSelectmenu();
		pages.SelectMenuPage().validatePageload();

	}

	@Then("User should click on every option in each menu drop down")
	public void user_should_click_on_every_option_in_each_menu_drop_down() {
		pages.SelectMenuPage().clickOnSpeedItems();
		pages.SelectMenuPage().clickOnFileItems();
		pages.SelectMenuPage().clickOnNumberItems();
		pages.SelectMenuPage().clickOnTitleItems();
	}

}
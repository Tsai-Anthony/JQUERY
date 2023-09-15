package ui_stepdefinitions;

import io.cucumber.java.en.*;
import utilities.PageManager;

public class AutocompletePageSteps {

	private PageManager pages = PageManager.getInstance();
	
	@When("user click <Autocomplete> button")
	public void user_click_autocomplete_button() {
	    pages.homePage().clickOnAutocomplete();
	}

	@Then("user is loaded on Autocomplete page")
	public void user_is_loaded_on_autocomplete_page() {
	    pages.autocompletePage().validatePageload();
	}

	@When("user enters {string} in the <Tags> frame")
	public void user_enters_in_the_tags_frame(String string) {
	    pages.autocompletePage().enterTagsInput(string);
	}

	@Then("user can see a list of tags and find searchedTag - {string} and click it")
	public void user_can_see_a_list_of_tags_and_find_searched_tag_and_click_it(String string) {
	    pages.autocompletePage().searchExpectedTag(string);
	}



}

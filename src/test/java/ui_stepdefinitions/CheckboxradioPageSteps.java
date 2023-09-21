package ui_stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import utilities.PageManager;

public class CheckboxradioPageSteps {

	PageManager pages = PageManager.getInstance();
	
	@When("user click <Checkboxradio> button")
	public void user_click_checkboxradio_button() {
	    pages.homePage().clickOnCheckboxradio();
	}

	@Then("user is loaded on Checkboxradio page")
	public void user_is_loaded_on_checkboxradio_page() {
	   pages.checkboxradioPage().validatePageload();
	}
	
	@Then("user can select their requirments")
	public void user_can_select_their_requirments(DataTable dataTable) {
	    Map<String, String> data = dataTable.asMap();
	    if(data.get("Location").equals("New York")) {
	    	pages.checkboxradioPage().clickNewYor();
	    }else if(data.get("Location").equals("Paris")) {
	    	pages.checkboxradioPage().clickParis();
	    }else if(data.get("Location").equals("London")) {
	    	pages.checkboxradioPage().clickLondon();
	    }
	    if(data.get("Hotel Ratings").equals("2 Star")) {
	    	pages.checkboxradioPage().clickStar2();
	    }else if(data.get("Hotel Ratings").equals("3 Star")) {
	    	pages.checkboxradioPage().clickStar3();
	    }else if(data.get("Hotel Ratings").equals("4 Star")) {
	    	pages.checkboxradioPage().clickStar4();
	    }else if(data.get("Hotel Ratings").equals("5 Star")) {
	    	pages.checkboxradioPage().clickStar5();
	    }
	    if(data.get("Bed Type").equals("2 Double")) {
	    	pages.checkboxradioPage().clickDouble2();
	    }else if(data.get("Bed Type").equals("2 Queen")) {
	    	pages.checkboxradioPage().clickQueen2();
	    }else if(data.get("Bed Type").equals("1 Queen")) {
	    	pages.checkboxradioPage().clickQueen1();
	    }else if(data.get("Bed Type").equals("1 King")) {
	    	pages.checkboxradioPage().clickKing1();
	    }
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	

	
package ui_stepdefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import utilities.PageManager;

public class ControlgroupPageSteps {

	PageManager pages = PageManager.getInstance();

	@When("user click <Controlgroup> button")
	public void user_click_controlgroup_button() {
		pages.homePage().clickOnControlgroup();
	}

	@Then("user is loaded on Controlgroup page")
	public void user_is_loaded_on_controlgroup_page() {
		pages.controlgroupPage().validatePageload();
	}

	@Then("user can select their rental car1")
	public void user_can_select_their_rental_car1(DataTable dataTable) {
		Map<String, String> data = dataTable.asMap();
		// ControlGroup one
		pages.controlgroupPage().selectCarType1(data.get("TypeOfCar1"));
		if (data.get("Standard1").equals("True")) {
			pages.controlgroupPage().selectStandard1();
		} else {
			pages.controlgroupPage().selectAutomatic1();
		}
		if (data.get("Insurance1").equals("True")) {
			pages.controlgroupPage().selectInsurance1();
		}
		pages.controlgroupPage().chooseNumOfCar1(Integer.valueOf(data.get("Number of cars1")));

		pages.controlgroupPage().clickBookNowButton1();

	}

	@Then("user can select their rental car2")
	public void user_can_select_their_rental_car2(DataTable dataTable2) {

		Map<String, String> data2 = dataTable2.asMap();

		// ControlGroup two
		pages.controlgroupPage().selectCarType2(data2.get("TypeOfCar2"));
		if (data2.get("Standard2").equals("True")) {
			pages.controlgroupPage().selectStandard2();
		} else {
			pages.controlgroupPage().selectAutomatic2();
		}
		if (data2.get("Insurance2").equals("True")) {
			pages.controlgroupPage().selectInsurance1();
		}

		pages.controlgroupPage().chooseNumOfCar2(Integer.valueOf(data2.get("Number of cars2")));

		pages.controlgroupPage().clickBookNowButton2();

	}
}

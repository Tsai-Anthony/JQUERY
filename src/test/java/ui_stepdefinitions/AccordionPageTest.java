package ui_stepdefinitions;

import io.cucumber.java.en.*;
import utilities.PageManager;

public class AccordionPageTest {

	private PageManager pages = PageManager.getInstance();
	
	@Given("user is on Jquery homepage")
	public void user_is_on_jquery_homepage() {
	    pages.homePage().navigate();
	    pages.homePage().validatePageload();
	}

	@When("user click <Accordion> button")
	public void user_click_button() {
	    pages.homePage().clickOnAccordion();
	   
	}

	@Then("user is loaded on Accordion page")
	public void user_is_loaded_on_accordion_page() {
		pages.accordionPage().validatePageload();
	}

	@Then("user can click Section1 button and validate its content")
	public void user_can_click_section1_button_and_validate_its_content() {
	    pages.accordionPage().clickOnSection1();
	    pages.accordionPage().validateSection1Content();
	   
	}

	@Then("user can click Section2 button and validate its content")
	public void user_can_click_section2_button_and_validate_its_content() {
	    pages.accordionPage().clickOnSection2();
	    pages.accordionPage().validateSection2Content();
	}
	@Then("user can click Section3 button and validate its content")
	public void user_can_click_section3_button_and_validate_its_content() {
	   pages.accordionPage().clickOnSection3();
	   pages.accordionPage().validateSection3Content();
	}
	
	@Then("user can click Section4 button and validate its content")
	public void user_can_click_section4_button_and_validate_its_content() {
		pages.accordionPage().clickOnSection4();
		   pages.accordionPage().validateSection4Content();
	}
	



}

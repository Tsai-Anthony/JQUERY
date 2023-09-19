package ui_stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import page_objects.ResizablePage;
import utilities.DriverManager;

public class Resizable {
	
	private WebDriver driver = DriverManager.getInstance();
	private ResizablePage page = new ResizablePage(driver);

	@When("User clicks on resizable")
	public void user_clicks_on_resizable() throws InterruptedException {
		page.resizeTab();
		page.ResizablePageVali();
	}

	@Then("User should be able to resize the box")
	public void user_should_be_able_to_resize_the_box() throws InterruptedException {
		page.resize();
	}

}

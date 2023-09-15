package ui_stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverManager;
import utilities.PageManager;

public class Hooks {

	@Before("@UI or @ui  or @E2E or @e2e")
	public void setup() {
		DriverManager.getInstance();
		PageManager.getInstance();
	}

	@After("@UI or @ui  or @E2E or @e2e")
	public void cleanup() {
		DriverManager.teardown();
		PageManager.cleanup();
	}

}


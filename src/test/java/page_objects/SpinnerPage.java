package page_objects;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.*;

public class SpinnerPage {

	// Local Variables
	private WebDriver driver;
	private WebDriverWait wait;
	final String URL = "https://jqueryui.com/spinner/";
	private final String TITLE_TEXT = "Spinner";

	// Elements
	@FindBy(xpath = "//*[@class='entry-title']")
	private WebElement titleText;

	@FindBy(xpath = "//*[@id='spinner']")
	private WebElement spinnerValue;

	@FindBy(xpath = "//*[@id='disable']")
	private WebElement toggleDEbutton;

	@FindBy(xpath = "//*[@id='destroy']")
	private WebElement toggleWidgetButton;

	@FindBy(xpath = "//*[@id='getvalue']")
	private WebElement getValueButton;

	@FindBy(xpath = "//*[@id='setvalue']")
	private WebElement setValueButton;

	@FindBy(xpath = "/html/body/p[1]/span/a[1]")
	private WebElement UpDownArrows;

	int value = 3;

	// Constructor
	public SpinnerPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	public void validatePageload() {
		assertEquals(URL, driver.getCurrentUrl());
		assertEquals(TITLE_TEXT, titleText.getText());
	}

	public void selectValue() {
		Keywords.enterIntoIframe(driver);
		spinnerValue.click();
		spinnerValue.sendKeys(String.valueOf(value));
	}

	private boolean isElementNotClickable(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return false;
		} catch (Exception e) {
			return true;
		}
	}

	public void selectDE() {
		toggleDEbutton.click();
	}

	// validation for DE
	public void unselectDE() {
//		boolean isNotClickable = isElementNotClickable(UpDownArrows);
//
//	    if (isNotClickable) {
	        toggleDEbutton.click();
//	    } else {
//	        System.out.println("The element is clickable. Cannot proceed.");
//	    }
	}
	public void selectWidget() {
		toggleWidgetButton.click();
	}

	// validation for widget
	public void unselectWidget() {

//		boolean isNotClickable = isElementNotClickable(UpDownArrows);
//
//		if (isNotClickable) {
			toggleWidgetButton.click();
//		} else {
//			System.out.println("The element is clickable. Cannot proceed.");
//		}
	}

	public void getValue() {
		getValueButton.click();

	}

	public void popUpMessage() {

//		$("#getvalue").on("click", function(){
//		alert(spinner.spinner("value"));
//		

		// switch to alert window
		Alert alert = driver.switchTo().alert();
		// accepts the ok button
		alert.accept();

	}

	public void setValue5() {
		//Keywords.enterIntoIframe(driver);
		setValueButton.click();
	}

	public void validateValue5() {
		String expected = "5";
		String checking = spinnerValue.getText();
		if (checking.equals(expected)) {
			System.out.println("Test passed! Matched");

		} else {
			System.out.println("Failed. Did not set value to 5");
		}
	}
}
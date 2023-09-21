package page_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Keywords;

public class ButtonPage {

	// Local Variables
			private WebDriver driver;
			private final String TITLE_TEXT = "Button";
			
			@FindBy(xpath = "//h1[@class='entry-title']")
			private WebElement titleText;
			
			@FindBy(xpath = "//button[@class='ui-button ui-corner-all ui-widget']")
			private WebElement aButtonElement1;
			
			@FindBy(xpath = "//input[@class='ui-button ui-corner-all ui-widget']")
			private WebElement aSubmitButton1;
			
			@FindBy(xpath = "//a[@class='ui-button ui-corner-all ui-widget']")
			private WebElement anAnchor1;
			
			@FindBy(xpath = "//button[@class='ui-button ui-widget ui-corner-all']")
			private WebElement aButtonElement2;
			
			@FindBy(xpath = "//input[@class='ui-button ui-widget ui-corner-all']")
			private WebElement aSubmitButton2;
			
			@FindBy(xpath = "//a[@class='ui-button ui-widget ui-corner-all']")
			private WebElement anAnchor2;
			 
			
			// Constructor
			public ButtonPage(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);

			}
			
			//Actions
			public void validatePageload() {
				assertEquals(TITLE_TEXT, titleText.getText());
		
			}
			
			public void getIntoFrame() {
				Keywords.enterIntoIframe(driver);
			}
			
			public void clickAButtonElement1() throws InterruptedException {
				
				Keywords.highlight(aButtonElement1);
			}
			
			public void clickASubmitButton1() {
				aSubmitButton1.click();
			}
			public void clickAnAnchor1() {
				anAnchor1.click();
			}
			public void clickAButtonElement2() {
				aButtonElement2.click();
			}
			
			public void clickASubmitButton2() {
				aSubmitButton2.click();
			}
			public void clickAnAnchor2() {
				anAnchor2.click();
			}
}

package page_objects;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class DroppablePage {

	// Local Variables
	private WebDriver driver;
	private WebDriverWait wait;
	private final String URL = "https://jqueryui.com/droppable/";
	private final String TITLE_TEXT = "Droppable";

	// Elements
	@FindBy(xpath = "//*[@class='entry-title']")
	private WebElement titleText;

	@FindBy(xpath = "//*[@id='draggable']")
	private WebElement dragBoxInput;

	@FindBy(xpath = "//*[@id='content']/iframe")
	private WebElement iframeElement;

	@FindBy(xpath = "//*[@href='https://jqueryui.com/droppable/']")
	private WebElement droppableButton;

	@FindBy(xpath = "//*[@id='droppable']/p")
	private WebElement droppedMessage;

	// Constructor
	public DroppablePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void droppableTab() {
		droppableButton.click();
	}

	public void validatePageload() {
		assertEquals(URL, driver.getCurrentUrl());
		assertEquals(TITLE_TEXT, titleText.getText());
	}

	public void switchToIframe() {
		driver.switchTo().frame(iframeElement);
	}

	public void switchOutofIframe() {
		driver.switchTo().defaultContent();
	}

	public void moveBox() {
		switchToIframe();
		// switch to iframe
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement draggableElement = wait.until(ExpectedConditions.elementToBeClickable(dragBoxInput));

		Actions actions = new Actions(driver);
		actions.moveToElement(draggableElement).perform();
		actions.clickAndHold(draggableElement).moveByOffset(160, 105);
		actions.release().perform();

		switchOutofIframe();
		// switch back to default content
	}

	public void validateDroppedMessage() {
		switchToIframe();
		String actualMessage = droppedMessage.getText();

		String expectedMessage = "Dropped!";

		assertEquals(expectedMessage, actualMessage, "The dropped message does not match the expected message.");
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("TEST PASSED. You dropped the box in the correct area!");
			switchOutofIframe();

		}
	}
}

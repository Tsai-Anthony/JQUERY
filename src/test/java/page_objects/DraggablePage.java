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
import utilities.*;

public class DraggablePage {

	// Local Variables
	private WebDriver driver;
	private WebDriverWait wait;
	private final String URL = "https://jqueryui.com/draggable/";
	private final String TITLE_TEXT = "Draggable";

	// Elements
	@FindBy(xpath = "//*[@class='entry-title']")
	private WebElement titleText;

	@FindBy(xpath = "//*[@id='draggable']")
	private WebElement dragBoxInput;

	@FindBy(xpath = "//*[@id='content']/iframe")
	private WebElement iframeElement;

	@FindBy(xpath = "//*[@href='https://jqueryui.com/draggable/']")
	private WebElement draggableButton;

	// Constructor
	public DraggablePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void draggableTab() {
		draggableButton.click();
	}

	public void moveBox() {
		Keywords.enterIntoIframe(driver);
		// switch to iframe
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement draggableElement = wait.until(ExpectedConditions.elementToBeClickable(dragBoxInput));

		Actions actions = new Actions(driver);
		actions.moveToElement(draggableElement).perform();
		actions.clickAndHold(draggableElement).moveByOffset(225, 135);
		actions.release().perform();

		Keywords.switchOutofIframe(driver);;
		// switch back to default content
	}

	public void validatePageload() {
		assertEquals(URL, driver.getCurrentUrl());
		assertEquals(TITLE_TEXT, titleText.getText());
	}

//	public void switchToIframe() {
//		driver.switchTo().frame(iframeElement);
//	}

//	public void switchOutofIframe() {
//		driver.switchTo().defaultContent();
//}
	

	public boolean isElementAtPosition(int expectedX, int expectedY) {
		Keywords.enterIntoIframe(driver);; 
		// switch to the iframe
		WebElement draggableElement = wait.until(ExpectedConditions.elementToBeClickable(dragBoxInput));
		int currentX = draggableElement.getLocation().getX();
		int currentY = draggableElement.getLocation().getY();
		Keywords.switchOutofIframe(driver); 
		// switch back to default content

		boolean isAtPosition = (currentX == expectedX) && (currentY == expectedY);

		if (isAtPosition) {
			System.out.println("TEST PASSED. The Box is at the expected position: X=" + currentX + ", Y=" + currentY);
		} else {
			System.out.println("FAILED!!! The box is not at the expected position. Current position: X=" + currentX
					+ ", Y=" + currentY);
		}

		return isAtPosition;
	}
}
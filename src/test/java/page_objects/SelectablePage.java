package page_objects;

import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.*;

public class SelectablePage {

	// Local Variables
	private WebDriver driver;
	private final String URL = "https://jqueryui.com/selectable/";
	private final String TITLE_TEXT = "Selectable";

	
	
	// Elements
	@FindBy(xpath = "//*[@class='entry-title']")
	private WebElement titleText;

	@FindBy(xpath = "//*[@href='https://jqueryui.com/selectable/']")
	private WebElement selectableInput;

	@FindBy(xpath = "//li[@class='ui-widget-content ui-selectee'][1]")
	private WebElement item1Box;

	@FindBy(xpath = "//li[@class='ui-widget-content ui-selectee'][2]")
	private WebElement item2Box;

	@FindBy(xpath = "//li[@class='ui-widget-content ui-selectee'][3]")
	private WebElement item3Box;

	@FindBy(xpath = "//li[@class='ui-widget-content ui-selectee'][4]")
	private WebElement item4Box;

	@FindBy(xpath = "//li[@class='ui-widget-content ui-selectee'][5]")
	private WebElement item5Box;

	@FindBy(xpath = "//li[@class='ui-widget-content ui-selectee'][6]")
	private WebElement item6Box;

	@FindBy(xpath = "//li[@class='ui-widget-content ui-selectee'][7]")
	private WebElement item7Box;

	// Constructor
	public SelectablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void validatePageload() {
		assertEquals(TITLE_TEXT, titleText.getText());
	}

	public void getIntoFrame() {
		Keywords.enterIntoIframe(driver);
	}

	public void clickItem1() {
		item1Box.click();
	}

	public void clickItem2() {
		item2Box.click();
	}

	public void clickItem3() {
		item3Box.click();
	}

	public void clickItem4() {
		item4Box.click();
	}

	public void clickItem5() {
		item5Box.click();
	}

	public void clickItem6() {
		item6Box.click();
	}

	public void clickItem7() {
		item7Box.click();
	}

	public void getOutOfFrame() {
		driver.switchTo().defaultContent();
	}

}
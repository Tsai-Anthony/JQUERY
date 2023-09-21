package page_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Keywords;

public class CheckboxradioPage {

	// Local Variables
	private WebDriver driver;
	private final String TITLE_TEXT = "Checkboxradio";

	@FindBy(xpath = "//h1[@class='entry-title']")
	private WebElement titleText;

	@FindBy(xpath = "//label[@for='radio-1']")
	private WebElement newYork;

	@FindBy(xpath = "//label[@for='radio-2']")
	private WebElement paris;

	@FindBy(xpath = "//label[@for='radio-3']")
	private WebElement london;

	@FindBy(xpath = "//label[@for='checkbox-1']")
	private WebElement star2;

	@FindBy(xpath = "//label[@for='checkbox-2']")
	private WebElement star3;

	@FindBy(xpath = "//label[@for='checkbox-3']")
	private WebElement star4;

	@FindBy(xpath = "//label[@for='checkbox-4']")
	private WebElement star5;

	@FindBy(xpath = "//label[@for='checkbox-nested-1']")
	private WebElement double2;

	@FindBy(xpath = "//label[@for='checkbox-nested-2']")
	private WebElement queen2;

	@FindBy(xpath = "//label[@for='checkbox-nested-3']")
	private WebElement queen1;

	@FindBy(xpath = "//label[@for='checkbox-nested-4']")
	private WebElement king1;

	// Constructor
	public CheckboxradioPage(WebDriver driver) {
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
	public void clickNewYor() {
		newYork.click();
	}
	public void clickParis() {
		paris.click();
	}
	public void clickLondon() {
		london.click();
	}
	public void clickStar2() {
		star2.click();
	}
	public void clickStar3() {
		star3.click();
	}
	public void clickStar4() {
		star4.click();
	}
	public void clickStar5() {
		star5.click();
	}
	public void clickDouble2() {
		double2.click();
	}
	public void clickQueen2() {
		queen2.click();
	}
	public void clickQueen1() {
		queen1.click();
	}
	public void clickKing1() {
		king1.click();
	}
	
}

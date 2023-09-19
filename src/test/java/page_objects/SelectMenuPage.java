package page_objects;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.*;

public class SelectMenuPage {

	// Local Variables
	private WebDriver driver;
	private WebDriverWait wait;
	final String URL = "https://jqueryui.com/selectmenu/";
	private final String TITLE_TEXT = "Selectmenu";

	// Elements
	@FindBy(xpath = "//*[@class='entry-title']")
	private WebElement titleText;

	@FindBy(xpath = "//*[@id='speed-button']")
	private WebElement selectSpeedInput;

	@FindBy(xpath = "//*[@id='ui-id-1']")
	private WebElement slowerInput;

	@FindBy(xpath = "//*[@id='ui-id-2']")
	private WebElement slowInput;

	@FindBy(xpath = "//*[@id='ui-id-3']")
	private WebElement mediumInput;

	@FindBy(xpath = "//*[@id='ui-id-4']")
	private WebElement fastInput;

	@FindBy(xpath = "//*[@id='ui-id-5']")
	private WebElement fasterInput;

	@FindBy(xpath = "//*[@id='files-button']")
	private WebElement selectFileInput;

	@FindBy(xpath = "//*[@id='ui-id-6']")
	private WebElement jQueryInput;

	@FindBy(xpath = "//*[@id='ui-id-7']")
	private WebElement ui_jQueryInput;

	@FindBy(xpath = "//*[@id='ui-id-8']")
	private WebElement unknownFileInput;

	@FindBy(xpath = "//*[@id='ui-id-9']")
	private WebElement otherFileInput;

	@FindBy(xpath = "//*[@id='number-button']")
	private WebElement selectNumberInput;

	@FindBy(xpath = "//*[@id='ui-id-16']")
	private WebElement oneInput;

	@FindBy(xpath = "//*[@id='ui-id-17']")
	private WebElement twoInput;

	@FindBy(xpath = "//*[@id='ui-id-18']")
	private WebElement threeInput;

	@FindBy(xpath = "//*[@id='ui-id-19']")
	private WebElement fourInput;

	@FindBy(xpath = "//*[@id='ui-id-20']")
	private WebElement fiveInput;

	@FindBy(xpath = "//*[@id='ui-id-21']")
	private WebElement sixInput;

	@FindBy(xpath = "//*[@id='ui-id-22']")
	private WebElement sevenInput;

	@FindBy(xpath = "//*[@id='ui-id-23']")
	private WebElement eightInput;

	@FindBy(xpath = "//*[@id='ui-id-24']")
	private WebElement nineInput;

	@FindBy(xpath = "//*[@id='ui-id-25']")
	private WebElement tenInput;

	@FindBy(xpath = "//*[@id='ui-id-26']")
	private WebElement elevenInput;

	@FindBy(xpath = "//*[@id='ui-id-27']")
	private WebElement twelveInput;

	@FindBy(xpath = "//*[@id='ui-id-28']")
	private WebElement thirteenInput;

	@FindBy(xpath = "//*[@id='ui-id-29']")
	private WebElement fourteenInput;

	@FindBy(xpath = "//*[@id='ui-id-30']")
	private WebElement fivteenInput;

	@FindBy(xpath = "//*[@id='ui-id-31']")
	private WebElement sixteenInput;

	@FindBy(xpath = "//*[@id='ui-id-32']")
	private WebElement seventeenInput;

	@FindBy(xpath = "//*[@id='ui-id-33']")
	private WebElement eighteenInput;

	@FindBy(xpath = "//*[@id='ui-id-34']")
	private WebElement nineteenInput;

	@FindBy(xpath = "//*[@id='salutation-button']")
	private WebElement selectTitleInput;

	@FindBy(xpath = "//*[@id='ui-id-11'")
	private WebElement mrInput;

	@FindBy(xpath = "//*[@id='ui-id-12'")
	private WebElement mrsInput;

	@FindBy(xpath = "//*[@id='ui-id-13'")
	private WebElement drInput;

	@FindBy(xpath = "//*[@id='ui-id-14'")
	private WebElement profInput;

	@FindBy(xpath = "//*[@id='ui-id-15'")
	private WebElement otherInput;

	@FindBy(xpath = "//*[@id='content']/iframe")
	private WebElement iFrame;

	// Constructor
	public SelectMenuPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void validatePageload() {
		assertEquals(URL, driver.getCurrentUrl());
		assertEquals(TITLE_TEXT, titleText.getText());
	}

	public void clickOnSpeedItems() {
		WebDriverWait iframeWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		iframeWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));

		//Keywords.enterIntoIframe(driver);
		selectSpeedInput.click();

		List<WebElement> dropdownItems = Arrays.asList(slowerInput, slowInput, mediumInput, fastInput, fasterInput);
		Actions actions = new Actions(driver);

		int itemCount = dropdownItems.size();
		for (int i = 0; i < itemCount; i++) {
			WebElement item = dropdownItems.get(i);
			wait.until(ExpectedConditions.elementToBeClickable(item));
			actions.moveToElement(item).perform();
			item.click();

			if (i < itemCount - 1) {
				wait.until(ExpectedConditions.elementToBeClickable(selectSpeedInput));
				selectSpeedInput.click();
			}
		}
	}

	public void clickOnFileItems() {
		Keywords.switchOutofIframe(driver);

		WebDriverWait iframeWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		iframeWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));

//		Keywords.switchOutofIframe(driver);
//		Keywords.enterIntoIframe(driver);
		selectFileInput.click();

		List<WebElement> dropdownItems = Arrays.asList(jQueryInput, ui_jQueryInput, unknownFileInput, otherFileInput);
		Actions actions = new Actions(driver);

		int itemCount = dropdownItems.size();
		for (int i = 0; i < itemCount; i++) {
			WebElement item = dropdownItems.get(i);
			wait.until(ExpectedConditions.elementToBeClickable(item));
			actions.moveToElement(item).perform();
			item.click();

			if (i < itemCount - 1) {
				wait.until(ExpectedConditions.elementToBeClickable(selectFileInput));
				selectFileInput.click();
			}
		}
	}

	public void clickOnNumberItems() {
		Keywords.switchOutofIframe(driver);

		WebDriverWait iframeWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		iframeWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));

//		Keywords.switchOutofIframe(driver);
//
//		Keywords.enterIntoIframe(driver);
		selectNumberInput.click();

		List<WebElement> numberItems = Arrays.asList(oneInput, twoInput, threeInput, fourInput, fiveInput, sixInput,
				sevenInput, eightInput, nineInput, tenInput, elevenInput, twelveInput, thirteenInput, fourteenInput,
				fivteenInput, sixteenInput, seventeenInput, eighteenInput, nineteenInput);
		Actions actions = new Actions(driver);

		int itemCount = numberItems.size();
		for (int i = 0; i < itemCount; i++) {
			WebElement item = numberItems.get(i);
			wait.until(ExpectedConditions.elementToBeClickable(item));
			actions.moveToElement(item).perform();
			item.click();

			if (i < itemCount - 1) {
				wait.until(ExpectedConditions.elementToBeClickable(selectNumberInput));
				selectNumberInput.click();
			}
		}

		//Keywords.switchOutofIframe(driver);
	}

	public void clickOnTitleItems() {
		Keywords.switchOutofIframe(driver);

		WebDriverWait iframeWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		iframeWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrame));
		

//		Keywords.switchOutofIframe(driver);
//
//		Keywords.enterIntoIframe(driver);
		selectTitleInput.click();

		List<WebElement> titleItems = Arrays.asList(mrInput, mrsInput, drInput, profInput, otherInput);
		Actions actions = new Actions(driver);

		int itemCount = titleItems.size();
		for (int i = 0; i < itemCount; i++) {
			WebElement item = titleItems.get(i);
			wait.until(ExpectedConditions.elementToBeClickable(item));
			actions.moveToElement(item).perform();
			item.click();

			if (i < itemCount - 1) {
				wait.until(ExpectedConditions.elementToBeClickable(selectTitleInput));
				selectTitleInput.click();
			}
		}

		//Keywords.switchOutofIframe(driver);
	}
}

package page_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// Local Variables
	private WebDriver driver;
	private final String URL = "https://jqueryui.com/";
	private final String TITLE_TEXT = "jQuery UI";

	@FindBy(xpath = "//h2/a[@title='jQuery UI']")
	private WebElement titleText;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/accordion/']")
	private WebElement accordionButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/autocomplete/']")
	private WebElement autocompleteButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/button/']")
	private WebElement button_Button;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/checkboxradio/']")
	private WebElement checkboxradioButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/controlgroup/']")
	private WebElement controlgroupButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/datepicker/']")
	private WebElement datepickerButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/dialog/']")
	private WebElement dialogButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/menu/']")
	private WebElement menuButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/progressbar/']")
	private WebElement progressbarButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/selectmenu/']")
	private WebElement selectmenuButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/slider/']")
	private WebElement slideroButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/spinner/']")
	private WebElement spinnerButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/tabs/']")
	private WebElement tabsButton;

	@FindBy(xpath = "//a[@href='https://jqueryui.com/tooltip/']")
	private WebElement tooltipButton;

	// Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	// Actions
	public void navigate() {
		driver.navigate().to(URL);
	}

	public void validatePageload() {
		assertEquals(TITLE_TEXT, titleText.getText());
	}

	public void clickOnAccordion() {
		accordionButton.click();
	}

	public void clickOnAutocomplete() {
		autocompleteButton.click();
	}

	public void clickOnButton() {
		button_Button.click();
	}

	public void clickOnCheckboxradio() {
		checkboxradioButton.click();
	}

	public void clickOnControlgroup() {
		controlgroupButton.click();
	}

	public void clickOnDatepicker() {
		datepickerButton.click();
	}

	public void clickOnDialog() {
		dialogButton.click();
	}

	public void clickOnMenu() {
		menuButton.click();
	}

	public void clickOnProgressbar() {
		progressbarButton.click();
	}

	public void clickOnSelectmenu() {
		selectmenuButton.click();
	}

	public void clickOnSlider() {
		slideroButton.click();
	}

	public void clickOnSpinner() {
		spinnerButton.click();
	}

	public void clickOnTabs() {
		tabsButton.click();
	}

	public void clickOnTooltip() {
		tooltipButton.click();
	}

}

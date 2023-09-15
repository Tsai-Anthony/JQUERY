package page_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class jQuery {

	// Local Variables
	private WebDriver driver;
	private final String URL = "https://jqueryui.com/";
	private final String TITLE_TEXT = "jQuery UI";

	// Elements
	@FindBy(xpath = "//*[@id='logo-events']/h2/a")
	private WebElement titleText;

	// Constructor
	public jQuery(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions
	public void navigate() {
		driver.navigate().to(URL);
	}

	public void validateHomePage() {
		assertEquals(TITLE_TEXT, titleText.getText());
	}
}
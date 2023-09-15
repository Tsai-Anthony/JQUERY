package page_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Keywords;

public class AccordionPage {

	// Local Variables
	private WebDriver driver;
	private final String URL = "https://jqueryui.com/accordion/";
	private final String TITLE_TEXT = "Accordion";

	private final String SECTION1CONTENT = "Mauris mauris ante, blandit et, ultrices a, suscipit eget, quam. Integer ut neque. Vivamus nisi metus,"
			+ " molestie vel, gravida in, condimentum sit amet, nunc. Nam a nibh. Donec suscipit eros. Nam mi. Proin viverra leo ut odio. Curabitur"
			+ " malesuada. Vestibulum a velit eu ante scelerisque vulputate.";
	private final String SECTION2CONTENT = "Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum sit amet purus. Vivamus hendrerit, "
			+ "dolor at aliquet laoreet, mauris turpis porttitor velit, faucibus interdum tellus libero ac justo. Vivamus non quam. In suscipit "
			+ "faucibus urna.";

	private final String SECTION3CONTENT = "Nam enim risus, molestie et, porta ac, aliquam ac, risus. Quisque lobortis. Phasellus pellentesque purus"
			+ " in massa. Aenean in pede. Phasellus ac libero ac tellus pellentesque semper. Sed ac felis. Sed commodo, magna quis lacinia ornare, quam ante "
			+ "aliquam nisi, eu iaculis leo purus venenatis dui.";
	private final String SECTION4CONTENT = "Cras dictum. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum "
			+ "ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Aenean lacinia mauris vel est.\n"
			+ "Suspendisse eu nisl. Nullam ut libero. Integer dignissim consequat lectus. Class aptent taciti sociosqu ad litora torquent per conubia nostra, "
			+ "per inceptos himenaeos.";

	@FindBy(xpath = "//h1[@class='entry-title']")
	private WebElement titleText;

	@FindBy(xpath = "//div//h3[@aria-controls='ui-id-2']")
	private WebElement section1Button;

	@FindBy(xpath = "//div[@aria-labelledby='ui-id-1']")
	private WebElement section1Content;

	@FindBy(xpath = "//div//h3[@aria-controls='ui-id-4']")
	private WebElement section2Button;

	@FindBy(xpath = "//div[@aria-labelledby='ui-id-3']")
	private WebElement section2Content;

	@FindBy(xpath = "//div//h3[@aria-controls='ui-id-6']")
	private WebElement section3Button;

	@FindBy(xpath = "//div[@aria-labelledby='ui-id-5']/p")
	private WebElement section3Content;

	@FindBy(xpath = "//div//h3[@aria-controls='ui-id-8']")
	private WebElement section4Button;

	@FindBy(xpath = "//div[@aria-labelledby='ui-id-7']")
	private WebElement section4Content;

	// Constructor
	public AccordionPage(WebDriver driver) {
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

	public void clickOnSection1() {
		Keywords.enterIntoIframe(driver);
		section1Button.click();
	}

	public void validateSection1Content() {
		Keywords.waitUntilElementIsPresent(section1Content, driver);
		assertEquals(SECTION1CONTENT, section1Content.getText());
	}

	public void clickOnSection2() {
		section2Button.click();
	}

	public void validateSection2Content() {
		Keywords.waitUntilElementIsPresent(section2Content, driver);
		assertEquals(SECTION2CONTENT, section2Content.getText());
	}

	public void clickOnSection3() {
		section3Button.click();
	}

	public void validateSection3Content() {
		Keywords.waitUntilElementIsPresent(section3Content, driver);
		System.out.println(section3Content.getText());
		assertEquals(SECTION3CONTENT, section3Content.getText());
	}

	public void clickOnSection4() {
		section4Button.click();
	}

	public void validateSection4Content() {
		Keywords.waitUntilElementIsPresent(section4Content, driver);
		System.out.println(section4Content.getText());
		assertEquals(SECTION4CONTENT, section4Content.getText());
	}
}

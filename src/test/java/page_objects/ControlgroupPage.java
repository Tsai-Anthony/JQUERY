package page_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Keywords;

public class ControlgroupPage {

	private WebDriver driver;
	private final String TITLE_TEXT = "Controlgroup";

	@FindBy(xpath = "//h1[@class='entry-title']")
	private WebElement titleText;

	@FindBy(xpath = "//span[@id='car-type-button']")
	private WebElement carTypeButton1;
	
	
	
	@FindBy(xpath = "//label[@for='transmission-standard']")
	private WebElement standard1;
	
	@FindBy(xpath = "//label[@for='transmission-automatic']")
	private WebElement automatic1;
	
	@FindBy(xpath = "//label[@for='insurance']")
	private WebElement insurance1;
	
	@FindBy(xpath = "(//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n'])[1]")
	private WebElement numOfCar1;
	
	@FindBy(xpath = "//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right']")
	private WebElement bookNowButton1;
	
	@FindBy(xpath = "(//span[@class='ui-selectmenu-text'])[2]")
	private WebElement carTypeButton2;
	
	@FindBy(xpath = "//label[@for='transmission-standard-v']")
	private WebElement standard2;
	
	@FindBy(xpath = "//label[@for='transmission-automatic-v']")
	private WebElement automatic2;
	
	@FindBy(xpath = "//label[@for='insurance-v']")
	private WebElement insurance2;
	@FindBy(xpath = "(//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-n'])[2]")
	private WebElement numOfCar2;
	
	@FindBy(xpath = "//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-bottom']")
	private WebElement bookNowButton2;
	

	// Constructor
		public ControlgroupPage(WebDriver driver) {
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
		
		public void selectCarType1() {
			carTypeButton1.click();
			List<WebElement> car1Types = driver.findElements(By.xpath("//div[@role='option']"));
			for (WebElement car1Type : car1Types) {
				if(car1Type.equals())
			}
		}
		public void selectStandard1() {
			standard1.click();
		}
		public void selectAutomatic1() {
			automatic1.click();
		}
		public void selectInsurance1() {
			insurance1.click();
		}
		public void chooseNumOfCar1() {
			for(int i=0; i<numOfCar1; i<0) {
				numOfCar1.click();
			}
		}
		public void clickBookNowButton1() {
			bookNowButton1.click();
		}
		
		public void selectCarType2() {
			carTypeButton1.click();
			List<WebElement> car2Types = driver.findElements(By.xpath("(//span[@class='ui-selectmenu-text'])[2]"));
			for (WebElement car2Type : car2Types) {
				if(car2Type.equals())
			}
		}
		public void selectStandard2() {
			standard2.click();
		}
		public void selectAutomatic2() {
			automatic2.click();
		}
		public void selectInsurance2() {
			insurance2.click();
		}
		public void chooseNumOfCar2() {
			for(int i=0; i<numOfCar2; i<0) {
				numOfCar2.click();
			}
		}
		public void clickBookNowButton2() {
			bookNowButton2.click();
		}
}

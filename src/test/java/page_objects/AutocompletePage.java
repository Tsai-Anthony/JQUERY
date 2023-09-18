package page_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Keywords;

public class AutocompletePage {
	
	// Local Variables
		private WebDriver driver;
		private final String TITLE_TEXT = "Autocomplete";
		private String searchLetter = "c";
		private String expectedTag = "C++";

		@FindBy(xpath = "//h1[@class='entry-title']")
		private WebElement titleText;
		
		@FindBy(xpath = "//input[@id='tags']")
		private WebElement tagsInput;
		
		@FindBy(xpath = "//li[@class='ui-menu-item']")
		private List<WebElement> tagList;
		
		// Constructor
		public AutocompletePage(WebDriver driver) {
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
		public void enterTagsInput(String string) {
			tagsInput.sendKeys(searchLetter);
		}
		public void searchExpectedTag(String string) {
			
			for (WebElement tag : tagList) {
//				System.out.println(tag.getText());
				if(tag.getText().equals(expectedTag)) {
					tag.click();
				}
			}
		}

}

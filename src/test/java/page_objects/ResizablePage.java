package page_objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Keywords;

public class ResizablePage {
	private WebDriver driver;
	private Actions ac;
	private final String URL = "https://jqueryui.com/resizable/";

	@FindBy(linkText = "Resizable")
	private WebElement resizePage;

	@FindBy(xpath = "//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")
	private WebElement dragSign;

	public ResizablePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void resizeTab() throws InterruptedException {
		highlight(resizePage);
		resizePage.click();
	}

	public void resize() throws InterruptedException {
		Keywords.enterIntoIframe(driver);
		ac = new Actions(driver);
		highlight(dragSign);
		ac.dragAndDropBy(dragSign, 100, 100).build().perform();

	}

	public void ResizablePageVali() {
		assertEquals(URL, driver.getCurrentUrl());

	}

	public void highlight(WebElement locator) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i < 2; i++) {
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", locator,
					"color: red; border: 2px solid red;");

			Keywords.wait(1);

			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", locator, "");
			Keywords.wait(1);

		}

	}

}
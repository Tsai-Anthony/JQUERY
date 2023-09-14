package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords {

	private static WebDriverWait wait;
	public static void enterIntoIframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public static void waitUntilElementIsPresent(WebElement element, WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}

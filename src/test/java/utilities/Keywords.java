package utilities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords {
	static WebDriver driver;
	

	public static void wait(int second) throws InterruptedException {
		Thread.sleep(second * 1000);
	}

	public static String getTimeStamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp.getTime() + "";
	}

	

	public static void highlight(WebElement element) throws InterruptedException {

	
		JavascriptExecutor js = (JavascriptExecutor) driver;

		for (int i = 0; i < 2; i++) {
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
					"color: red; border: 2px solid yellow;");
			wait(1);
			js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "");
			wait(1);
		}
	}

	public static String formatInputDate(String inputDateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date = LocalDate.parse(inputDateString, formatter);
		return date.toString();
	}



	public static void enterIntoIframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}

	public static void switchOutofIframe(WebDriver driver) {
		driver.switchTo().defaultContent();

	}

	

	public static void waitUntilElementIsPresent(WebElement element, WebDriver driver) {
		WebDriverWait wait;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}

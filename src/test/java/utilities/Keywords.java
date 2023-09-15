package utilities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Keywords {
	public static void wait(int second) throws InterruptedException {
		Thread.sleep(second * 1000);
	}

	public static String getTimeStamp() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		return timestamp.getTime() + "";
	}

	public static String formatInputDate(String inputDateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date = LocalDate.parse(inputDateString, formatter);
		return date.toString();
	}

	private static WebDriverWait wait;

	public static void enterIntoIframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}

	public static void switchOutofIframe(WebDriver driver) {
		driver.switchTo().defaultContent();

	}

	public static void waitUntilElementIsPresent(WebElement element, WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}

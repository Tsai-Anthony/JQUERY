package utilities;

import org.openqa.selenium.WebDriver;


public class PageManager {

	private static PageManager pageManager = null;
	private WebDriver driver;
	


	public static void cleanup() {
		pageManager = null;
	}




}

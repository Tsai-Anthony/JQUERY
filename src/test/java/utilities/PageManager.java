package utilities;

import org.openqa.selenium.WebDriver;

import page_objects.*;

public class PageManager {

	private static PageManager pageManager = null;
	private WebDriver driver;

	private jQuery jQuery;
	private DraggablePage DraggablePage;
	private DroppablePage DroppablePage;

	private PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public static PageManager getInstance() {
		if (pageManager == null) {
			pageManager = new PageManager(DriverManager.getInstance());
		}
		return pageManager;
	}

	public static void cleanup() {
		pageManager = null;
	}

	public jQuery jQuery() {
		if (jQuery == null) {
			jQuery = new jQuery(driver);
		}
		return jQuery;
	}

	public DraggablePage DraggablePage() {
		if (DraggablePage == null) {
			DraggablePage = new DraggablePage(driver);
		}
		return DraggablePage;
	}

	public DroppablePage DroppablePage() {
		if (DroppablePage == null) {
			DroppablePage = new DroppablePage(driver);
		}
		return DroppablePage;
	}
}
package utilities;

import org.openqa.selenium.WebDriver;

import page_objects.AccordionPage;
import page_objects.AutocompletePage;
import page_objects.HomePage;


public class PageManager {
	private static ThreadLocal<PageManager> threadLocalPageManager = null;

	private WebDriver driver;
	private HomePage homePage;
	private AccordionPage accordionPage;
	private AutocompletePage autocompletePage;

	private PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public static PageManager getInstance() {
		if (threadLocalPageManager == null) {
			threadLocalPageManager = new ThreadLocal<PageManager>();
		}
		if (threadLocalPageManager.get() == null) {
			PageManager pageManager = new PageManager(DriverManager.getInstance());
			threadLocalPageManager.set(pageManager);
		}
		return threadLocalPageManager.get();
	}

	public static void cleanup() {
		threadLocalPageManager = null;
	}

	public HomePage homePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}


	public AccordionPage accordionPage() {
		if(accordionPage == null) {
			accordionPage = new AccordionPage(driver);
		}
		return accordionPage;
	}

	public AutocompletePage autocompletePage() {
		if(autocompletePage == null) {
			autocompletePage = new AutocompletePage(driver);
		}
		return autocompletePage;
	}
	
}

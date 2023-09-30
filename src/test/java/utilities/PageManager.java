package utilities;

import org.openqa.selenium.WebDriver;

import page_objects.AccordionPage;
import page_objects.AutocompletePage;

import page_objects.*;

import page_objects.HomePage;

public class PageManager {

	private static ThreadLocal<PageManager> threadLocalPageManager = new ThreadLocal<>();
	private WebDriver driver;

	private HomePage homePage;
	private jQuery jQuery;
	private DraggablePage DraggablePage;
	private AccordionPage accordionPage;
	private AutocompletePage autocompletePage;
	private DroppablePage DroppablePage;
	private ButtonPage buttonPage;
	private CheckboxradioPage checkboxradioPage;
	private ControlgroupPage controlgroupPage;

	private PageManager(WebDriver driver) {
		this.driver = driver;
	}

	public static PageManager getInstance() {
		if (threadLocalPageManager.get() == null) {
			PageManager pageManager = new PageManager(DriverManager.getInstance());
			threadLocalPageManager.set(pageManager);
		}
		return threadLocalPageManager.get();
	}

	public static void cleanup() {
		threadLocalPageManager.remove();
	}

	public HomePage homePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
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

	public AccordionPage accordionPage() {
		if (accordionPage == null) {
			accordionPage = new AccordionPage(driver);
		}
		return accordionPage;
	}

	public AutocompletePage autocompletePage() {
		if (autocompletePage == null) {
			autocompletePage = new AutocompletePage(driver);
		}
		return autocompletePage;
	}

	public DroppablePage DroppablePage() {
		if (DroppablePage == null) {
			DroppablePage = new DroppablePage(driver);
		}
		return DroppablePage;
	}
	
	public ButtonPage buttonPage() {
		
		if (buttonPage == null) {
			buttonPage = new ButtonPage(driver);
		}
		return buttonPage;
	}
	
	public CheckboxradioPage checkboxradioPage() {
		
		if(checkboxradioPage == null) {
			checkboxradioPage = new CheckboxradioPage(driver);
		}
		return checkboxradioPage;
	}
	public ControlgroupPage controlgroupPage() {
		if(controlgroupPage == null) {
			controlgroupPage = new ControlgroupPage(driver);
		}
		return controlgroupPage;
	}
}

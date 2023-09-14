package ui_stepdefinitions;
import utilities.PageManager;
import io.cucumber.java.en.*;

public class Droppable {
	private PageManager pages = PageManager.getInstance();

	@When("User clicks on Droppable")
	public void user_clicks_on_droppable() {
		pages.DroppablePage().droppableTab();
		pages.DroppablePage().validatePageload();

	}

	@Then("User should click and drag the box to the desire location")
	public void user_should_click_and_drag_the_box_to_the_desire_location() {
		pages.DroppablePage().moveBox();
		pages.DroppablePage().validateDroppedMessage();

}
}

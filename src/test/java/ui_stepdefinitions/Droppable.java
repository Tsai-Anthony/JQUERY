package ui_stepdefinitions;
import utilities.PageManager;
import io.cucumber.java.en.*;

public class Droppable {
	private PageManager pages = PageManager.getInstance();

	@When("User clicks on Droppable")
	public void user_clicks_on_droppable() {
		pages.DroppablePage().droppableTab();
		//this goes to the droppable tab
		pages.DroppablePage().validatePageload();
		//this validates that we are on the droppable page

	}

	@Then("User should click and drag the box to the desire location")
	public void user_should_click_and_drag_the_box_to_the_desire_location() {
		pages.DroppablePage().moveBox();
		// this moves the box to the x/y location given
		pages.DroppablePage().validateDroppedMessage();
		// this validates if the message "Dropped!" appears when box is successfully dropped in the correct locaiton

}
}

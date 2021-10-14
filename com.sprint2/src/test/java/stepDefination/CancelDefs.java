
package stepDefination;

import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelDefs extends Browser {
@Given("user in on the cancellation page of redbus.in")
public void user_in_on_the_cancellation_page_of_redbus_in() throws Exception {
	
	browser.Browser.setDriver();
	browser.Browser.getUrl(readData.ReadLocators.getData("url"));
	pages.RedBus_Home.clickManageBooking();
	pages.RedBus_Home.clickCancel();
}

@And("user should have  ticket detail for cancellation")
public void user_should_have_ticket_detail_for_cancellation() throws Exception {
	pages.RedBus_CancelTicket.enterTicketNo();
	Thread.sleep(2000);
	pages.RedBus_CancelTicket.enterEmail();
}

@When("user enters accurate details")
public void user_enters_accurate_details() {
    
}

@And("Clicks Cancel Ticket")
public void clicks_cancel_ticket() throws Exception {
	Thread.sleep(2000);
	pages.RedBus_CancelTicket.clickSelectPassengers();
}

@Then("user is navigated to the ticket cancellation page")
public void user_is_navigated_to_the_ticket_cancellation_page() {
    
}

@And("page displays ticket cancelled successfully.")
public void page_displays_ticket_cancelled_successfully() {
   
} 
}
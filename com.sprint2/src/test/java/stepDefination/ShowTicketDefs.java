package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShowTicketDefs  {
	@Given("User in on the print ticket page of redbus.in")
	public void user_in_on_the_print_ticket_page_of_redbus_in() throws Exception {
		browser.Browser.setDriver();
		browser.Browser.getUrl(readData.ReadLocators.getData("url"));
		pages.RedBus_Home.clickManageBooking();
		pages.RedBus_Home.clickShowMyTicket();
	}

	@And("User Enters valid Detail")
	public void user_enters_valid_detail() throws Exception {
		
		pages.RedBus_ShowMyTicket.enterTicketNo();
		Thread.sleep(2000);
		pages.RedBus_ShowMyTicket.enterEmail(); 
	    
	}

	@When("Clicks on Submit Details")
	public void clicks_on_submit_details() {
		pages.RedBus_ShowMyTicket.clickSubmit();
	     
	}

	@Then("User is navigated to the specified journey information page")
	public void user_is_navigated_to_the_specified_journey_information_page() {
	     
	}
	
	
}

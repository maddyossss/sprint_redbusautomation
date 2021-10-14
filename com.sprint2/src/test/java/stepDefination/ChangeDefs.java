package stepDefination;

import browser.Browser; 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeDefs extends Browser {
	
	@Given("user in on the reschedule page of redbus.in")
	public void user_in_on_the_reschedule_page_of_redbus_in() throws Exception {
		
		
		browser.Browser.setDriver();
		browser.Browser.getUrl(readData.ReadLocators.getData("url"));
		pages.RedBus_Home.clickManageBooking();
		pages.RedBus_Home.clickChangeTravelDate();
	   
	}

	@When("user enters ticket details")
	public void user_enters_ticket_details() throws Exception {
		
		pages.RedBus_ChangeTravelDate.enterTicketNo();
		Thread.sleep(2000);
		pages.RedBus_ChangeTravelDate.enterEmail();
		 
	}

	@And("Clicks confirm details")
	public void clicks_confirm_details() throws Exception   {
		
		Thread.sleep(2000);
		pages.RedBus_ChangeTravelDate.clickSearch();
	    
	}

	@Then("user is navigated to the ticket updation page")
	public void user_is_navigated_to_the_ticket_updation_page() {
	    
	}

	@And("page displays journey date updated successfully.")
	public void page_displays_journey_date_updated_successfully() {
	   
	}
	
}

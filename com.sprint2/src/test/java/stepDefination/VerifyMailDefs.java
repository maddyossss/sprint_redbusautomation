package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyMailDefs {

	@Given("user in on the email\\/sms page of redbus.in")
	public void user_in_on_the_email_sms_page_of_redbus_in() throws Exception {
		
		browser.Browser.setDriver();
		browser.Browser.getUrl("https://www.redbus.in/");
		pages.RedBus_Home.clickManageBooking();
		pages.RedBus_Home.clickEmailSms();
		}

	@When("user enters valid details")
	public void user_enters_valid_details() throws Exception {
		
		
		pages.RedBus_VerifyEmail.enterTicketNo();
		Thread.sleep(2000);
		pages.RedBus_VerifyEmail.enterEmail();	 
	}

	@And("Clicks send email\\/sms")
	public void clicks_send_email_sms() throws Exception {
		Thread.sleep(2000);
		pages.RedBus_VerifyEmail.clickSubmit();
	}

	@Then("the user receives ticket on specified email")
	public void the_user_receives_ticket_on_specified_email() {
	     
	}

}

package performer;

import pages.RedBus_CancelTicket;
import pages.RedBus_Home;

public class DryRun {
public static void main(String[] args) {
	browser.Browser.setDriver();
	browser.Browser.getUrl("http://www.redbus.in/");
	RedBus_Home home = new RedBus_Home();
	  
	 home.clickManageBooking();
	 
	 home.clickCancel();
	 RedBus_CancelTicket cancelticket = new RedBus_CancelTicket();
	 cancelticket.enterEmail();
	 cancelticket.enterTicketNo();
	 cancelticket.clickSelectPassengers();
	 
  
//   home.clickChangeTravelDate();
// 	 home.clickEmailSms();
//	 home.clickShowMyTicket();
	
	
	
}
}

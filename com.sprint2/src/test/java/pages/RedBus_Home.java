package pages;

 
import java.io.IOException;

import org.openqa.selenium.WebElement;

import browser.Browser;
import io.cucumber.java.tlh.vaj;
import locators.Locators;

public class RedBus_Home extends Browser
{
	
	public static void clickManageBooking()
	{
		Locators.homeManageBookingButton().click(); 
		  
	}
	
	public static void clickCancel() throws Exception 
	{    
		 
		
		 Locators.homeCancel().click();
		  
	}
	
	public static void clickChangeTravelDate()
	{
		  
		 Locators.homeChangeTravelDate().click();
	}
	
	public static void clickShowMyTicket()
	{
		  
		 Locators.homeShowMyTicket().click();
	}
	
	public static  void clickEmailSms()
	{
		 Locators.homeEmailSms().click();
		 
	}
	
	 
     
     
}

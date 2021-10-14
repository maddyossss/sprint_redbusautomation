package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;
import locators.Locators;

public class RedBus_VerifyEmail extends Browser {

	public static void enterTicketNo() throws Exception
	{
		 Locators.verifyEnterTicketNo().sendKeys(readData.ReadExcel.readExcel(0, 0)); 
	}
	
	public static void enterEmail() throws Exception
	{
		 Locators.verifyEnterEmail().sendKeys(readData.ReadExcel.readExcel(0, 1));
	}
	
	public static void  clickSubmit()
	{
		 Locators.verifySubmitButton().click();  
	}
}

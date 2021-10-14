package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;
import locators.Locators;

public class RedBus_ChangeTravelDate extends Browser {
	
	public static void enterTicketNo() throws Exception
	{
		  Locators.changeEnterTicketNo().sendKeys(readData.ReadExcel.readExcel(0, 0));  
	}
	
	public static void enterEmail() throws Exception
	{
	        Locators.changeEnterEmail(). sendKeys(readData.ReadExcel.readExcel(0, 0));
	}
	
	public static void clickSearch()
	{
		 Locators.changeSearchButton().click(); 
	}

}

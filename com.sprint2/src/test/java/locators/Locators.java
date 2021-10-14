package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;
import net.bytebuddy.asm.Advice.Return;

public class Locators extends Browser{
   public static WebElement homeManageBookingButton()
   {
	  WebElement managebooking_button =  driver.findElement(By.xpath("//div[@class='icon-down icon ich dib mbh']"));
			 return managebooking_button;
   }
   
   public static WebElement homeCancel ()
   {
	   WebElement cancel_button =  driver.findElement(By.xpath("/html/body/section/header/div/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li[2]"));
			 return cancel_button;                                             
   }
   
   public static WebElement homeChangeTravelDate ()
   {
	   WebElement  changetraveldate_button =  driver.findElement(By.xpath("/html/body/section/header/div/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li[3]/span/span"));	
			 return changetraveldate_button;
			 
   }
   
   public static WebElement  homeShowMyTicket()
   {
	   WebElement  showmyticket_button =  driver.findElement(By.xpath("//li[@data-label='Show My Ticket']"));	
			 return showmyticket_button;
   }
   public static WebElement homeEmailSms()
   {
	   WebElement emailsms_button =  driver.findElement(By.xpath("//li[@data-busmb='/Home/SmsAndEmailTicket']"));	
			 return emailsms_button;
   }
   public static WebElement cancelEnterTicketNo()
   {
	   WebElement enterticketno_textbox  =  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[1]/div/input"));
			 return enterticketno_textbox;                               
   }
   public static WebElement cancelEnterEmail()
   {
	   WebElement enteremail_textbox =  driver.findElement(By.xpath("/html/body/section/div[2]/div/div/div[2]/div[1]/div[2]/input"));
			 return enteremail_textbox;                               
   }
   
   
   
   public static WebElement cancelSelectPassengers ()
   {
	   WebElement  selectpassengers_button =  driver.findElement(By.xpath("/html/body/section/div[2]/div/div/div[2]/div[2]/div"));
			 return selectpassengers_button;
   } 
   
   
   public static WebElement changeEnterTicketNo()
   {
	   WebElement enterticketno_textbox  =  driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[2]/div[1]/div[2]/div/input"));
			 return enterticketno_textbox;
   }
   
   public static WebElement changeEnterEmail()
   {
	   WebElement enteremail_textbox =  driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[2]/div[2]/div[2]/div/input"));
			 return enteremail_textbox;
   }
   public static WebElement changeSearchButton()
   {
	   WebElement  search_button =  driver.findElement(By.xpath("/html/body/section/div[2]/div[2]/div[2]/div[3]/input"));
			 return search_button;
   }
   public static WebElement showMyTicketEnterTicket ()
   {
	   WebElement enterticketno_textbox  =  driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/form/div/div[1]/div[2]/div/input"));
			 return enterticketno_textbox;                              
   }
   public static WebElement showMyTicketEnterEmail()
   {
	   WebElement enteremail_textbox =  driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/form/div/div[2]/div[2]/div/input"));
			 return enteremail_textbox;
   }
   public static WebElement showMyTicketSubmitButton()
   {
	   WebElement  submit_button =  driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/form/div/div[3]/input"));
			 return submit_button;
   }
   public static WebElement verifyEnterTicketNo()
   {
	   WebElement enterticketno_textbox  =  driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/form/div/div[1]/div[2]/div/input"));
			 return enterticketno_textbox;
   }
   public static WebElement verifyEnterEmail()
   {
	   WebElement enteremail_textbox =  driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/form/div/div[2]/div[2]/div/input"));
			 return enteremail_textbox;
   }
   public static WebElement verifySubmitButton()
   {
	   WebElement  submit_button =  driver.findElement(By.xpath("/html/body/section/div[2]/div[1]/form/div/div[3]/input"));
			 return submit_button;
   }
   
}

package browser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser {
	public static WebDriver driver;
	public static Actions act;
	public static WebDriverWait wait;
	
	//Chrome WebDriver Setup
		public static WebDriver setDriver() throws Exception
		{   
			String driverPath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			act = new Actions(driver);
			return driver;
		}
		
		//Url Setup Method
		public static void getUrl(String url)
		{
			driver.get(url);
			driver.manage().window().maximize();
		 	driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}
		
		//Driver CLose Method
		public static void closeBrowser()
		{
			driver.close();
		}

}

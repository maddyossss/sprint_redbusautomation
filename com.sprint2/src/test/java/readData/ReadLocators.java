package readData;

import java.io.FileInputStream;
import java.util.Properties;

import browser.Browser;

public class ReadLocators extends Browser{
	
	public static String getData(String Name) throws Exception
	{
		 
        FileInputStream fis = new FileInputStream("C:\\Users\\MAYADUBE\\eclipse-workspace\\com.sprint2\\Application_Configuaration\\locators.properties");
        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(Name);
	}
}
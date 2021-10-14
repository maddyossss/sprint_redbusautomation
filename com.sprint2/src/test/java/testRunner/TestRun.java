package testRunner;

import org.junit.runner.RunWith;

//import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\MAYADUBE\\eclipse-workspace\\com.sprint2\\src\\test\\resources\\Features\\Cancel.feature"
,glue= {"stepDefination"},monochrome=true,
plugin = {"pretty","html:target/HtmlReports", "junit:target/JUnitReports/report.xml",
"json:target/JSONReports/report.json"} )		
 

 


public class TestRun {

}

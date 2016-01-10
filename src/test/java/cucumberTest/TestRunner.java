package cucumberTest;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Feature/" 
		,format={ "html:target/cucumber", "json:target/cucumber.json", "junit:junit/cucumber.xml", "pretty" }
		,glue={"amazon_cucumber_test"}
		,monochrome = true
		,strict = true		
		) 
public class TestRunner {
 
}

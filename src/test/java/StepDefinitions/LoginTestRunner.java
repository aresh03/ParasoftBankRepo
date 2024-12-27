package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/login.feature",
glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty", "html:target/HtmlReports/login_report.html",
		"json:target/JsonReports/login_report.json",
		"junit:target/JunitReports/login_report.xml"})
public class LoginTestRunner 
{

}

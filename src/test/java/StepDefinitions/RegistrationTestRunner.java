package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/registration.feature",
glue= {"StepDefinitions"},
monochrome=true,
plugin= {"pretty", "html:target/HtmlReports/registration_report.html",
		"json:target/JsonReports/registration_report.json",
		"junit:target/JunitReports/registration_report.xml"})
public class RegistrationTestRunner 
{

}

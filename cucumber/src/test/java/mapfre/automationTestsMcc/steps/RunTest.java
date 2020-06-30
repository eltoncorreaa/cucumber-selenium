package mapfre.automationTestsMcc.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "mapfre.automationTestsMcc.config",
        "mapfre.automationTestsMcc.steps", "mapfre.automationTestsMcc.utils" }, format = { "pretty",
                "json:target/cucumber.json",
"html:target/automationTestsMcc-html-reports" }, tags = { "@MB012_AUTO" })
public class RunTest {

}

package seleniumtestingtoolscookbook.fundtransfer.cucumberoptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:target/cucumber-html-report"},
        features = "src/test/java/seleniumtestingtoolscookbook/fundtransfer/features",
        glue = "stepdefinitions",
        monochrome = true)

public class RunCukesTest {
}

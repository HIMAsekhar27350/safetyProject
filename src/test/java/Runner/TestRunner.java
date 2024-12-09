package Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\Features\\safety.feature"},
        glue = {"StepDefinitions"}, plugin = {"pretty", "html:target/Reports/htmlreport.html"}, monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests {
}

package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/Login.feature","src/test/resources/features/AppTest.feature"},
        glue = {"StepDefinations","Hooks"},
        plugin = {
                "pretty",
                "html:target/cucumber.html"}
)
public class TestRunner {



}

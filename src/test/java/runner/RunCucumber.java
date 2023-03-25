package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/reports/cucumberTests.json", "html:target/reports/cucumberTests.html"},
        features = "src/test/resources/features",
        glue = {"steps"},
        tags = "@login"
)
public class RunCucumber extends RunBase{

    @AfterClass
    public static void stop(){
        getDriver().quit();
    }

}

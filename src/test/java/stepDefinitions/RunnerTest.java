package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;//with junit runner we won't be able to execute scenarios in parallel



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",//there are 2 files in that package
        glue={"stepDefinitions"},
        monochrome = true,
        publish=true,
        //tags="@SanityFlow or @RegressionFlow",//to run both
        //tags="@SanityFlow and @RegressionFlow",//to run the one with @SanityFlow@RegressionFlow
       // tags="not @SmokeTest",//except smoke test all other tests will be executed
        tags="@RegressionFlow",
        plugin={"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt"})

public class RunnerTest {
   
}
//file-new-project from version control-paste url
//




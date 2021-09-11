package stepDefinitions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/resources/features",
        glue={"stepDefinitions"},
        monochrome = true,
        publish=true,
        tags="@RegressionFlow",
        plugin={"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json", "junit:target/cucumber.xml", "rerun:target/rerun.txt"})
public class parallelRunnerTest extends AbstractTestNGCucumberTests {//to run scenarios in parallel
    @Override
    @DataProvider(parallel = true)//by default it will be false
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
//return the scenaios to dataprovider object,which we are overriding with new testng class
//when you run parallel runner test all the scenarios will be executed in parallel


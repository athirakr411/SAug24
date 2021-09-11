package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonHPF;

import java.util.concurrent.TimeUnit;


public class AmazonSearchStepDefinitions {
    WebDriver driver = null;
    AmazonHPF amazonHPF=null;


    @Before(value="@RegressionFlow")
    public void cucumberSetup(){
        String ProjDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
       //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        System.out.println("this is first Before tag");
    }

    @Before("@SanityFlow")
    public void aSetup1(){
        System.out.println("this is second Before tag");
    }

    @After
    public void tearDown(){
        driver.close();
        System.out.println("this is @After");
    }

    @BeforeStep
    public void beforestep(){
        System.out.println("this is @BeforeStep");
    }

    @AfterStep
    public void afterstep(){
        System.out.println("this is @AfterStep");
    }
    @Given("amazon webpage is launched")
    public void amazon_webpage_is_launched() {

        driver.get("https://www.amazon.in/");
        amazonHPF =new AmazonHPF(driver);
    }

    @When("user enters a product name")
    public void userEntersAName(DataTable productName) {

        amazonHPF.enterTextInSearchBox(productName.cell(0,0));
        System.out.println(productName.cell(0,0));
        System.out.println(productName.cell(1,1));
    }

    @And("clicks on search button")
    public void clicksOnSearchButton() {
        amazonHPF.clickOnSearchBtn();
    }

    @Then("search results should be displayed")
    public void searchResultsShouldBeDisplayed() {
        //driver.close();
        System.out.println("test using page factory is successful");
    }

    @When("user enters a {string} in the search box")
    public void userEntersAInTheSearchBox(String arg0) {
        amazonHPF.enterTextInSearchBox(arg0);
    }
}

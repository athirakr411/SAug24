package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AmazonHPF;

//cucumber model
public class AmazonSearchStepDefinitions {
    WebDriver driver = null;
    AmazonHPF amazonHPF=null;

    @Given("amazon webpage is launched")//when this tag is called from cucumber below method needs to be run
    public void amazon_webpage_is_launched() {
        String ProjDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", ProjDir+"/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        amazonHPF =new AmazonHPF(driver);
    }

    @When("user enters a product name")
    public void userEntersAName() {
        amazonHPF.enterTextInSearchBox("grooming");
    }

    @And("clicks on search button")
    public void clicksOnSearchButton() {
        amazonHPF.clickOnSearchBtn();
    }

    @Then("search results should be displayed")
    public void searchResultsShouldBeDisplayed() {
        driver.close();
        System.out.println("test using page factory is successful");
    }

    @When("user enters a {string} in the search box")
    public void userEntersAInTheSearchBox(String arg0) {
        amazonHPF.enterTextInSearchBox(arg0);
    }
}

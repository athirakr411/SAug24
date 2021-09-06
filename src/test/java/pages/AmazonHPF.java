package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHPF {

    @FindBy(id="twotabsearchtextbox")
    WebElement txt_seachbox;


    @FindBy(id="nav-search-submit-button")
    WebElement btn_searchbtn;

    WebDriver driver = null;

    public AmazonHPF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void enterTextInSearchBox(String text){
        txt_seachbox.clear();//clear it before entering text
        txt_seachbox.sendKeys(text);//driver.findelement is not required
    }

    public void clickOnSearchBtn(){
        btn_searchbtn.click();
    }

}


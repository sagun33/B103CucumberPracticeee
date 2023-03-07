package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DqaPage {
    public DqaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//span[normalize-space()='Alerts']")
    public WebElement alert;
    @FindBy (xpath = "//button[@id='timerAlertButton']")
    public WebElement onButtonClick;

}

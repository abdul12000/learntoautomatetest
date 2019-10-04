package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOnPage extends BasePage{
    public SignOnPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "SIGN-ON")
    private WebElement signOnLinkLocator;

    @FindBy(xpath = "//input[@name='userName']")
    private WebElement userNameLocator;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordLocator;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement submitButtonLocator;


    public void clickOnSignOnLink(){
    click(signOnLinkLocator);
    }
    public void enterUsername(String uName){
        sendKeys(userNameLocator, uName);
    }
    public void enterPassowrd(String pWord){
        sendKeys(passwordLocator, pWord);
    }
    public void clickOnSubmitButton(){
        click(submitButtonLocator);
    }

}

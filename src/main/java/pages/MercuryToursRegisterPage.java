package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MercuryToursRegisterPage extends BasePage {
    public MercuryToursRegisterPage(WebDriver driver){
        super(driver);
    }

    //Using xpath
    @FindBy(xpath = "//a[contains(text(),'REGISTER')]")
            private WebElement registerLinkLocator;

    @FindBy(xpath = "//input[@name='firstName']")
    private WebElement firstNameLocator;

    @FindBy(xpath = "//input[@name='lastName']")
    private WebElement lastNameLocator;

    @FindBy(xpath = "//input[@name='phone']")
    private WebElement phoneLocator;

    @FindBy(xpath = "//select[@name='country']")
    private WebElement countryLocator;

    @FindBy(xpath = "//input[@name='address1']")
    private WebElement address1Locator;

    @FindBy(xpath = "//input[@id='userName']")
    private WebElement emailLocator;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement userNameLocator;



    //Using CSS selector
    @FindBy(css = "input[name='password']")
    private WebElement passwordLocator;

    @FindBy(css = "input[name='confirmPassword']")
    private WebElement confirmPasswordLocator;

    @FindBy(css = "input[name='register']")
    private WebElement submitButtonLocator;


    public void clickOnRegisterLink(){
        registerLinkLocator.click();
    }

    public void enterFirstName(String firstname){
        firstNameLocator.sendKeys(firstname);
    }
    public void enterLastName(String laststname){
        lastNameLocator.sendKeys(laststname);
    }
    public void enterEmailAddress(String emailAddress){
        emailLocator.sendKeys(emailAddress);
    }
    public void selectCountry(){
//        Select country = new Select(countryLocator);
//        country.selectByVisibleText("UNITED KINGDOM");
        selectFromDropDownUsingVisibleText(countryLocator,"UNITED KINGDOM");

    }

    public void enterUsername(String uName){
        userNameLocator.sendKeys(uName);
    }
    public void enterPassword(String password){
        passwordLocator.sendKeys(password);
    }
    public void enterConfirmPassword(String password){
        confirmPasswordLocator.sendKeys(password);
    }

    public void clickOnSubmitButton(){
        submitButtonLocator.click();
    }

}

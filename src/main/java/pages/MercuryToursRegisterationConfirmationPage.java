package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryToursRegisterationConfirmationPage extends BasePage {
    public MercuryToursRegisterationConfirmationPage(WebDriver driver) {
        super(driver);
    }

    //Using xpath
    @FindBy(xpath = "*//td/p[1]/font/b")
    private WebElement dearLocator;
    @FindBy(xpath = "*//p/a[1]/font/b")
    private WebElement noteLocator;

    public String getdearTexts(){
        return dearLocator.getText();
    }
    public String getNoteTexts(){
        return noteLocator.getText();
    }

}

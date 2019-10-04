package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MortgageCalculatorPage extends BasePage implements MortgageCalcInterface {
    public MortgageCalculatorPage(WebDriver driver){
        super(driver);
    }

    //Using xpath
    @FindBy(css = "input#homeval")
            private WebElement homeValueLocator;

    @FindBy(css = "input#downpayment")
    private WebElement downPaymentLocator;

    @FindBy(css = "input#loanamt")
    private WebElement loanAmountLocator;

    @FindBy(css = "input#intrstsrate")
    private WebElement interestRateLocator;

    @FindBy(css = "input#loanterm")
    private WebElement iloanTermLocator;

    @FindBy(css = "input#start_year")
    private WebElement startYearLocator;

    @FindBy(css ="input[type='submit']")
    private WebElement submitButtonLocator;

    @FindBy(xpath = "//div[@class='repayment-block']/div[1]/div[1]/h3")
    private WebElement monthlyPaymentLocator;
    @FindBy(xpath = "//div[@class='repayment-block']/div[2]/div[1]/h3")
    private WebElement downPayment_Locator;
    @FindBy(xpath = "//div[@class='repayment-block']/div[5]/div[1]/h3")
    private WebElement monthlyTax_Locator;
    @FindBy(xpath = "//div[@class='repayment-block']/div[6]/div[1]/h3")
    private WebElement monthlyHomeInsurance_Locator;

    public void enterHomeValue(String hValue){
        sendKeys(homeValueLocator, hValue);
    }
    public void enterDownPaymentAmount(String dPaymentAmount){
        sendKeys(downPaymentLocator, dPaymentAmount);
    }
    public void enterLoanAmount(String lAmount){
        sendKeys(loanAmountLocator, lAmount);
    }
    public void enterInterestRate(String intRate){
        sendKeys(interestRateLocator, intRate);
    }
    public void enterLoanTerm(String lTerm){
        sendKeys(iloanTermLocator, lTerm);
    }

    public void clickOnSubmitButton(){
        click(submitButtonLocator);
    }
    public void enterStartYear(String sYear){
        sendKeys(startYearLocator, sYear);
    }

    public String getMonthlyPaymentAmount(){
        return monthlyPaymentLocator.getText();
    }
    public String getDownPaymentAmount(){
        return downPayment_Locator.getText();
    }
    public String getMonthlyTaxAmount(){ return monthlyTax_Locator.getText();
    }
    public String getMonthlyHomeInsuranceAmount(){
        return monthlyHomeInsurance_Locator.getText();
    }


}

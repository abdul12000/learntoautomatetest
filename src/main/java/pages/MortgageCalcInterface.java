package pages;

public interface MortgageCalcInterface {

    public void enterHomeValue(String hValue);
    public void enterDownPaymentAmount(String dPaymentAmount);
    public void enterLoanAmount(String lAmount);
    public void enterInterestRate(String intRate);
    public void enterLoanTerm(String lTerm);
    public void clickOnSubmitButton();
    public void enterStartYear(String sYear);
    public String getMonthlyPaymentAmount();
    public String getDownPaymentAmount();
    public String getMonthlyTaxAmount();
    public String getMonthlyHomeInsuranceAmount();
}


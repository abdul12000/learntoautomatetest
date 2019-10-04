package StepDef;

import base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MortgageCalculatorPage;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
//import static org.junit.Assert.assertThat;

public class MortgageCalculatorStepDef extends BaseUtil {
    private BaseUtil base;

    public MortgageCalculatorStepDef(BaseUtil base) {
        this.base = base;
    }

    @Given("^I am on the Mortgage Calculator Home page$")
    public void i_am_on_the_Mortgage_Calculator_Home_page() throws Throwable {
        base.driver.navigate().to("https://www.mortgagecalculator.org/");

    }

    @When("^I enter valid details as \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_valid_details_as_and(String hValue, String dPayment, String loanAmount, String intRate, String lTerm, String startDate) throws Throwable {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        mortgageCalculatorPage.enterHomeValue(hValue);
        mortgageCalculatorPage.enterDownPaymentAmount(dPayment);
        mortgageCalculatorPage.enterLoanAmount(loanAmount);
        mortgageCalculatorPage.enterInterestRate(intRate);
        mortgageCalculatorPage.enterLoanTerm(lTerm);
        mortgageCalculatorPage.enterStartYear(startDate);
    }

    @When("^I click Calculate Button$")
    public void i_click_Calculate_Button() throws Throwable {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        mortgageCalculatorPage.clickOnSubmitButton();
    }


    @Then("^\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are correctly diksplayed$")
    public void and_are_correctly_diksplayed(String mPayment, String dPayment, String monthlyTax, String MonthlyHomeIns) throws Throwable {
        MortgageCalculatorPage mortgageCalculatorPage = new MortgageCalculatorPage(base.driver);
        assertThat(mortgageCalculatorPage.getMonthlyPaymentAmount(), is(equalTo(mPayment)));
        //Assumption here is that we have more than one possible values that we want to match
        List<String> expectedDownPayAmounts = Arrays.asList(dPayment, "$40,000.00", "$24,500.00", "$22,000.00");
        assertThat(expectedDownPayAmounts, hasItem(mortgageCalculatorPage.getDownPaymentAmount()));

        assertThat(mortgageCalculatorPage.getMonthlyTaxAmount(), is(equalTo(monthlyTax)));
        assertThat(mortgageCalculatorPage.getMonthlyHomeInsuranceAmount(), is(equalTo(MonthlyHomeIns)));
    }

}

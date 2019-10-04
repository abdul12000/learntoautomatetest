package StepDef;

import base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import pages.MercuryToursRegisterPage;
import pages.MercuryToursRegisterationConfirmationPage;
import pages.SignOnPage;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class MercurySignOnStep extends BaseUtil {
    private BaseUtil base;

    public MercurySignOnStep(BaseUtil base) {
        this.base = base;
    }


    @When("^i enter  valid username and password as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterValidUsernameAndPasswordAsAnd(String uName, String pWord) throws Throwable {
        SignOnPage signOnPage = new SignOnPage(base.driver);
        signOnPage.enterUsername(uName);
        signOnPage.enterPassowrd(pWord);
    }

    @Then("^I should be signed in$")
    public void iShouldBeSignedIn() throws Throwable {
        SignOnPage signOnPage = new SignOnPage(base.driver);
        assertThat(base.driver.getTitle(), is(equalTo("Find a Flight: Mercury Tours:")));
        System.out.println("THE PAGE TTLE IS ----- " + base.driver.getTitle());
    }

    @And("^i click on the Sign-up link$")
    public void iClickOnTheSignUpLink() throws Throwable {
        SignOnPage signOnPage = new SignOnPage(base.driver);
        signOnPage.clickOnSignOnLink();
    }

    @And("^i click on submit button$")
    public void iClickOnSubmitButton() throws Throwable {
        SignOnPage signOnPage = new SignOnPage(base.driver);
        signOnPage.clickOnSubmitButton();
    }

    @When("^i enter  invalid username and password as \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterInvalidUsernameAndPasswordAsAnd(String uName, String pWord) throws Throwable {
        base.driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(uName);
        base.driver.findElement(By.cssSelector("input[name='password']")).sendKeys(pWord);
    }

    @Then("^I should NOT be signed in$")
    public void iShouldNOTBeSignedIn() throws Throwable {
        SignOnPage signOnPage = new SignOnPage(base.driver);
        assertThat(base.driver.getTitle(), is(equalTo("Sign-on: Mercury Tours")));
        System.out.println("THE PAGE TTLE IS ----- " + base.driver.getTitle());
    }
}

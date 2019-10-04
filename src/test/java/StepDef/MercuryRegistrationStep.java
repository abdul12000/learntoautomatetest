package StepDef;

import base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MercuryToursRegisterPage;
import pages.MercuryToursRegisterationConfirmationPage;
import pages.Utilities.Utility;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

public class MercuryRegistrationStep extends BaseUtil {
    private BaseUtil base;
    private String fNumbers;

    public MercuryRegistrationStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^I am on the Mercury website$")
    public void i_am_on_the_Mercury_website() throws Throwable {
        base.driver.navigate().to("http://newtours.demoaut.com/");
    }

    @When("^I click on the Register button$")
    public void i_click_on_the_Register_button() throws Throwable {
        MercuryToursRegisterPage mercuryToursRegisterPage = new MercuryToursRegisterPage(base.driver);
        mercuryToursRegisterPage.clickOnRegisterLink();

    }

    @When("^enter details as follows firstname \"([^\"]*)\", Lastname as \"([^\"]*)\", emails as \"([^\"]*)\", username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void enter_details_as_follows_firstname_Lastname_as_emails_as_username_as_and_password_as(String fName, String lName, String mail, String uName, String pWord) throws Throwable {
        MercuryToursRegisterPage mercuryToursRegisterPage = new MercuryToursRegisterPage(base.driver);
        mercuryToursRegisterPage.enterFirstName(fName);
        mercuryToursRegisterPage.enterLastName(lName);
        mercuryToursRegisterPage.enterEmailAddress(mail);
        mercuryToursRegisterPage.enterUsername(uName);
        mercuryToursRegisterPage.enterPassword(pWord);
        mercuryToursRegisterPage.enterConfirmPassword(pWord);

    }

    @When("^click Submit$")
    public void click_Submit() throws Throwable {
        MercuryToursRegisterPage mercuryToursRegisterPage = new MercuryToursRegisterPage(base.driver);
        mercuryToursRegisterPage.clickOnSubmitButton();

    }

    @Then("^\"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\" are displayed$")
    public void and_are_displayed(String fName, String lName, String userName) throws Throwable {
        MercuryToursRegisterationConfirmationPage mercuryToursRegisterationConfirmationPage = new MercuryToursRegisterationConfirmationPage(base.driver);
        assertThat(mercuryToursRegisterationConfirmationPage.getdearTexts(), is(equalTo("Dear " + fName + " " + lName + ",")));
        assertThat(mercuryToursRegisterationConfirmationPage.getNoteTexts(), is(equalTo("Note: Your user name is " + Utility.getRandomAmount() + userName + ".")));

    }

    @And("^enter details as follows \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", and \"([^\"]*)\"$")
    public void enterDetailsAsFollowsAnd(String fName, String lName, String emailAddress, String userName, String pWord) throws Throwable {
        MercuryToursRegisterPage mercuryToursRegisterPage = new MercuryToursRegisterPage(base.driver);
        Utility.setRandomAmount(String.valueOf(get4RandomNumbers()));
        mercuryToursRegisterPage.enterFirstName(fName);
        mercuryToursRegisterPage.enterLastName(lName);
        mercuryToursRegisterPage.enterUsername(Utility.getRandomAmount() + userName);
        System.out.println("RANDOM AMOUNT IS " + Utility.getRandomAmount());
        mercuryToursRegisterPage.selectCountry();
        mercuryToursRegisterPage.enterEmailAddress(Utility.getRandomAmount() + emailAddress);
        mercuryToursRegisterPage.enterPassword(pWord);
        mercuryToursRegisterPage.enterConfirmPassword(pWord);
    }

    private int get4RandomNumbers() {
        Random rand = new Random();
        int fouNumbers = rand.nextInt(9999);
        return fouNumbers;
    }
}

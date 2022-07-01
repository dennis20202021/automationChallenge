package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.steps.SignupUserAccountSteps;

public class SignupUserAccountStepDefinitions {

    @Steps
    SignupUserAccountSteps signupUser;

    @Given("User is navigating to Advantage Shopping page")
    public void isNavigatingToAdvantageShoppingPage() {
        this.signupUser.navigateToHomePage();
    }

    @And("User performs click on login button")
    public void heOrShePerformsClickOnLoginButton() {
        this.signupUser.clickOnLoginButton();
    }

    @When("User performs click on {string}")
    public void userPerformsClickOnCREATENEWACCOUNT(String link) {
        this.signupUser.clickOnCreateNewAccount(link);
    }

    @And("User types in new {int}")
    public void userTypesInNewUsername(Integer username) {
        this.signupUser.enterNewUsername(username);
    }

    @And("User types in {int}")
    public void userTypesInEmail(Integer email) {
        this.signupUser.enterNewEmail(email);
    }

    @And("User types in new {int} with at least one upper case, one digit, one special character")
    public void userTypesInNewPassword(Integer password) {
        this.signupUser.enterNewPassword(password);
    }

    @And("User types in password {int}")
    public void userTypesInPasswordConfirmation(Integer confirmation) {
        this.signupUser.enterPasswordConfirmation(confirmation);
    }

    @And("User performs click on checkbox {string}")
    public void userPerformsClickOnCheckboxIAgree(String conditions) {
        this.signupUser.clickOnCheckBox(conditions);
    }

    @And("user performs click on register button")
    public void userPerformsClickOnRegisterButton() {
        this.signupUser.clickOnRegisterButton();
    }

    @Then("User validates user logged in")
    public void userValidatesUserLoggedIn() {
        this.signupUser.validateUserLoggedIn();
    }
}

package starter.steps;

import net.thucydides.core.annotations.Step;
import starter.pages.AdvantageShoppingHomePage;
import starter.pages.FormPage;

public class SignupUserAccountSteps {

    AdvantageShoppingHomePage homePage;
    FormPage formPage;

    @Step("Open website")
    public void navigateToHomePage() {
        this.homePage.openWebsite();
    }

    @Step("Click on 'Login' button")
    public void clickOnLoginButton() {
        this.homePage.performsClickOnLoginButton();
    }

    @Step("Click on 'CREATE NEW ACCOUNT' link")
    public void clickOnCreateNewAccount(String link) {
        this.homePage.performsClickOnCreateNewAccount(link);
    }

    @Step("Enter new username")
    public void enterNewUsername(Integer username) {
        this.formPage.fillInUsernameField(username);
    }

    @Step("Enter new email")
    public void enterNewEmail(Integer email) {
        this.formPage.fillInEmailField(email);
    }

    @Step("Enter new password")
    public void enterNewPassword(Integer password) {
        this.formPage.fillInPasswordField(password);
    }

    @Step("Enter password confirmation")
    public void enterPasswordConfirmation(Integer confirmation) {
        this.formPage.fillInConfirmPasswordField(confirmation);
    }

    @Step("Click on checkbox 'I agree with conditions of use and privacy notice'")
    public void clickOnCheckBox(String conditions) {
        this.formPage.clickOnIAgreeCheckBox(conditions);
    }

    @Step("Click on register button")
    public void clickOnRegisterButton() {
        this.formPage.submitForm();
    }

    @Step("Validate user logged in")
    public void validateUserLoggedIn() {
        this.formPage.validateUser();
    }

}

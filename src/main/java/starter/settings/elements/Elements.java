package starter.settings.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {

    final WebDriver driver;

    public Elements(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "hrefUserIcon")
    WebElement loginButton;

    @FindBy(linkText = "CREATE NEW ACCOUNT")
    WebElement createNewAccountLink;

    @FindBy(name = "usernameRegisterPage")
    WebElement usernameRegisterPage;

    @FindBy(name = "emailRegisterPage")
    WebElement emailRegisterPage;

    @FindBy(name = "passwordRegisterPage")
    WebElement passwordRegisterPage;

    @FindBy(name = "confirm_passwordRegisterPage")
    WebElement confirmPasswordRegisterPage;

    @FindBy(name = "i_agree")
    WebElement iAgreeCheckBox;

    @FindBy(id = "register_btnundefined")
    WebElement registerButton;

    @FindBy(xpath = "//*[contains(@id, 'menuUserLink')]/span")
    WebElement userLoggedIn;

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getCreateNewAccountLink() {
        return createNewAccountLink;
    }

    public WebElement getUsernameRegisterPage() {
        return usernameRegisterPage;
    }

    public WebElement getEmailRegisterPage() {
        return emailRegisterPage;
    }

    public WebElement getPasswordRegisterPage() {
        return passwordRegisterPage;
    }

    public WebElement getConfirmPasswordRegisterPage() {
        return confirmPasswordRegisterPage;
    }

    public WebElement getIAgreeCheckBox() {
        return iAgreeCheckBox;
    }

    public WebElement getRegisterButton() {
        return registerButton;
    }

    public WebElement getUserLoggedIn() {
        return userLoggedIn;
    }
}

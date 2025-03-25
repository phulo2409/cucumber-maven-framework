package pageObjects.users.login;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageObjects.users.dashboard.UserHomePO;
import pageUIs.users.login.UserLoginPUI;

public class UserLoginPO extends BasePage {
    private WebDriver driver;

    public UserLoginPO(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Enter to Email textbox with {0}")
    public void enterToEmailTextbox(String value) {
        waitForElementVisible(driver, UserLoginPUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, UserLoginPUI.EMAIL_TEXTBOX, value);
    }

    @Step("Enter to Password textbox with {0}")
    public void enterToPasswordTextbox(String value) {
        waitForElementVisible(driver, UserLoginPUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, UserLoginPUI.PASSWORD_TEXTBOX, value);
    }

    @Step("Verify: Get error message of Email validation")
    public String getEmailValidation() {
        waitForElementVisible(driver, UserLoginPUI.EMAIL_VALIDATION);
        return getTextElement(driver, UserLoginPUI.EMAIL_VALIDATION);
    }

    @Step("Verify: Get error message of Login validation")
    public String getLoginValidation() {
        waitForElementVisible(driver, UserLoginPUI.LOGIN_VALIDATION);
        return getTextElement(driver, UserLoginPUI.LOGIN_VALIDATION);
    }

    @Step("Click to Login button")
    public UserHomePO clickTheLogInButton() {
        waitForElementClickable(driver, UserLoginPUI.LOGIN_BUTTON);
        clickToElement(driver, UserLoginPUI.LOGIN_BUTTON);
        return PageGenerator.getPageGenerator().getUserHomePage(driver);
    }

    @Step("Login to User Account")
    public UserHomePO loginUserAccount(String email, String password){
        waitForElementVisible(driver, UserLoginPUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, UserLoginPUI.EMAIL_TEXTBOX, email);
        sendkeyToElement(driver, UserLoginPUI.PASSWORD_TEXTBOX, password);
        clickToElement(driver, UserLoginPUI.LOGIN_BUTTON);
        return PageGenerator.getPageGenerator().getUserHomePage(driver);
    }

}

package pageObjects.users.login;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageObjects.users.dashboard.UserHomePO;
import pageUIs.users.dashboard.BasePageUI;
import pageUIs.users.login.UserRegisterPUI;

public class UserRegisterPO extends BasePage {
    private WebDriver driver;

    public UserRegisterPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Enter to First Name textbox with value: {0}")
    public void enterToFirstNameTextbox(String value) {
        waitForElementVisible(driver, UserRegisterPUI.FIRST_NAME_TEXTBOX);
        sendkeyToElement(driver, UserRegisterPUI.FIRST_NAME_TEXTBOX, value);
    }

    @Step("Enter to Last Name textbox with value: {0}")
    public void enterToLastNameTextbox(String value) {
        waitForElementVisible(driver, UserRegisterPUI.LAST_NAME_TEXTBOX);
        sendkeyToElement(driver, UserRegisterPUI.LAST_NAME_TEXTBOX, value);
    }

    @Step("Enter to Email textbox with value: {0}")
    public void enterToEmailTextbox(String value) {
        waitForElementVisible(driver, UserRegisterPUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, UserRegisterPUI.EMAIL_TEXTBOX, value);
    }

    @Step("Enter to Company textbox with value: {0}")
    public void enterToCompanyTextbox(String value) {
        waitForElementVisible(driver, UserRegisterPUI.COMPANY_NAME_TEXTBOX);
        sendkeyToElement(driver, UserRegisterPUI.COMPANY_NAME_TEXTBOX, value);
    }

    @Step("Enter to Password textbox with value: {0}")
    public void enterToPasswordTextbox(String value) {
        waitForElementVisible(driver, UserRegisterPUI.PASSWORD_TEXTBOX);
        sendkeyToElement(driver, UserRegisterPUI.PASSWORD_TEXTBOX, value);
    }

    @Step("Enter to Confirm Password textbox with value: {0}")
    public void enterToConfirmPasswordTextbox(String value) {
        waitForElementVisible(driver, UserRegisterPUI.CONFIRM_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, UserRegisterPUI.CONFIRM_PASSWORD_TEXTBOX, value);
    }

    @Step("Click to Logout link")
    public UserHomePO clickToLogoutLink(){
        waitForElementClickable(driver, BasePageUI.LOGOUT_LINK);
        clickToElement(driver, BasePageUI.LOGOUT_LINK);
        return PageGenerator.getPageGenerator().getUserHomePage(driver);
    }

    @Step("Verify: Get Register success message")
    public String getRegisterSuccessMessage() {
        waitForElementVisible(driver, UserRegisterPUI.SUCCESS_MESSAGE);
        return getTextElement(driver, UserRegisterPUI.SUCCESS_MESSAGE);
    }

    @Step("Verify: Get Register error message")
    public String getRegisterErrorMessage(){
        waitForElementVisible(driver,UserRegisterPUI.REGISTER_ERROR_MESSAGE);
        return getTextElement(driver, UserRegisterPUI.REGISTER_ERROR_MESSAGE);
    }

    @Step("Verify: Get First Name Validation Message")
    public String getFirstNameValidationMessage() {
        waitForElementVisible(driver, UserRegisterPUI.FIRST_NAME_VALIDATION);
        return getTextElement(driver, UserRegisterPUI.FIRST_NAME_VALIDATION);
    }

    @Step("Verify: Get Last Name Validation Message")
    public String getLastNameValidationMessage() {
        waitForElementVisible(driver, UserRegisterPUI.LAST_NAME_VALIDATION);
        return getTextElement(driver, UserRegisterPUI.LAST_NAME_VALIDATION);
    }

    @Step("Verify: Get Email Validation Message")
    public String getEmailValidationMessage() {
        waitForElementVisible(driver, UserRegisterPUI.EMAIL_VALIDATION);
        return getTextElement(driver, UserRegisterPUI.EMAIL_VALIDATION);
    }

    @Step("Verify: Get Password Validation Message")
    public String getPasswordValidationMessage() {
        waitForElementVisible(driver, UserRegisterPUI.PASSWORD_VALIDATION);
        return getTextElement(driver, UserRegisterPUI.PASSWORD_VALIDATION);
    }

    @Step("Verify: Get Confirm Password Validation Message")
    public String getConfirmPasswordValidationMessage() {
        waitForElementVisible(driver, UserRegisterPUI.CONFIRM_PASSWORD_VALIDATION);
        return getTextElement(driver, UserRegisterPUI.CONFIRM_PASSWORD_VALIDATION);
    }

    @Step("Click the Register button")
    public void clickTheRegisterButton() {
        waitForElementClickable(driver, UserRegisterPUI.REGISTER_BUTTON);
        clickToElement(driver, UserRegisterPUI.REGISTER_BUTTON);
    }

    @Step("Create an account")
    public void createAnAccount(String firstName, String lastName, String email, String company, String password){
        enterToFirstNameTextbox(firstName);
        enterToLastNameTextbox(lastName);
        enterToEmailTextbox(email);
        enterToCompanyTextbox(company);
        enterToPasswordTextbox(password);
        enterToConfirmPasswordTextbox(password);
        clickTheRegisterButton();
    }
}

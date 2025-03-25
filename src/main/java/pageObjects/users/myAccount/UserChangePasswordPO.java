package pageObjects.users.myAccount;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.users.myAccount.UserChangePasswordPUI;

public class UserChangePasswordPO extends UserSideBarPO {
    private WebDriver driver;

    public UserChangePasswordPO(WebDriver driver){
        super(driver);
        this.driver = driver;
    }

    @Step("Enter to Old Password textbox with {0}")
    public void enterToOldPassword(String value) {
        waitForElementVisible(driver, UserChangePasswordPUI.OLD_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, UserChangePasswordPUI.OLD_PASSWORD_TEXTBOX, value);
    }

    @Step("Enter to New Password textbox with {0}")
    public void enterToNewPassword(String value) {
        waitForElementVisible(driver, UserChangePasswordPUI.NEW_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, UserChangePasswordPUI.NEW_PASSWORD_TEXTBOX, value);
    }

    @Step("Enter to Confirm Password textbox with {0}")
    public void enterToConfirmPassword(String value) {
        waitForElementVisible(driver, UserChangePasswordPUI.CONFIRM_PASSWORD_TEXTBOX);
        sendkeyToElement(driver, UserChangePasswordPUI.CONFIRM_PASSWORD_TEXTBOX, value);
    }

    @Step("Click the Change Password button")
    public void clickTheChangePasswordButton() {
        waitForElementClickable(driver, UserChangePasswordPUI.CHANGE_PASSWORD_BUTTON);
        clickToElement(driver, UserChangePasswordPUI.CHANGE_PASSWORD_BUTTON);
    }

    @Step("Change Password in My Account")
    public void changePassword(String oldPass, String newPass){
        enterToOldPassword(oldPass);
        enterToNewPassword(newPass);
        enterToConfirmPassword(newPass);
        clickTheChangePasswordButton();
    }
}

package pageObjects.users.myAccount;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.users.myAccount.UserCustomerInfoPUI;

public class UserCustomerInfoPO extends UserSideBarPO {
    private WebDriver driver;

    public UserCustomerInfoPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Check on Male radiobutton")
    public void checkOnMaleRadio(String gender) {
        if (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")) {
            throw new IllegalArgumentException("Gender must be either 'Male' or 'Female'.");
        }
        waitForElementClickable(driver, UserCustomerInfoPUI.GENDER_RADIO, gender);
        checkToRadioButton(driver, UserCustomerInfoPUI.GENDER_RADIO, gender);
    }

    @Step("Enter to First Name textbox with {0}")
    public void enterToFirstNameTextbox(String value) {
        waitForElementVisible(driver, UserCustomerInfoPUI.FIRST_NAME_TEXTBOX);
        sendkeyToElement(driver, UserCustomerInfoPUI.FIRST_NAME_TEXTBOX, value);
    }

    @Step("Enter to Last Name textbox with {0}")
    public void enterToLastNameTextbox(String value) {
        waitForElementVisible(driver, UserCustomerInfoPUI.LAST_NAME_TEXTBOX);
        sendkeyToElement(driver, UserCustomerInfoPUI.LAST_NAME_TEXTBOX, value);

    }

    @Step("Enter to Email Name textbox with {0}")
    public void enterToEmailTextbox(String value) {
        waitForElementVisible(driver, UserCustomerInfoPUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, UserCustomerInfoPUI.EMAIL_TEXTBOX, value);
    }

    @Step("Enter to Comapny Name textbox with {0}")
    public void enterToCompanyTextbox(String value) {
        waitForElementVisible(driver, UserCustomerInfoPUI.COMPANY_TEXTBOX);
        sendkeyToElement(driver, UserCustomerInfoPUI.COMPANY_TEXTBOX, value);
    }

    @Step("Click the Save button")
    public void clickTheSaveButton() {
        waitForElementClickable(driver, UserCustomerInfoPUI.SAVE_BUTTON);
        clickToElement(driver, UserCustomerInfoPUI.SAVE_BUTTON);
    }

    @Step("Verify: Male radiobutton is selected")
    public boolean isGenderRadioSelected(String gender) {
        waitForElementSelected(driver, UserCustomerInfoPUI.GENDER_RADIO, gender);
        return isElementSelected(driver, UserCustomerInfoPUI.GENDER_RADIO, gender);
    }

    @Step("Verify: Get value of First Name textbox")
    public String getValueFirstNameTextbox() {
        waitForElementVisible(driver, UserCustomerInfoPUI.FIRST_NAME_TEXTBOX);
        return getTextboxValue(driver, UserCustomerInfoPUI.FIRST_NAME_TEXTBOX);
    }

    @Step("Verify: Get value of Last Name textbox")
    public String getValueLastNameTextbox() {
        waitForElementVisible(driver, UserCustomerInfoPUI.LAST_NAME_TEXTBOX);
        return getTextboxValue(driver, UserCustomerInfoPUI.LAST_NAME_TEXTBOX);
    }

    @Step("Verify: Get value of Email textbox")
    public String getValueEmailTextbox() {
        waitForElementVisible(driver, UserCustomerInfoPUI.EMAIL_TEXTBOX);
        return getTextboxValue(driver, UserCustomerInfoPUI.EMAIL_TEXTBOX);
    }

    @Step("Verify: Get value of Company textbox")
    public String getValueCompanyTextbox() {
        waitForElementVisible(driver, UserCustomerInfoPUI.COMPANY_TEXTBOX);
        return getTextboxValue(driver, UserCustomerInfoPUI.COMPANY_TEXTBOX);
    }

    @Step("Update Information in My Account")
    public void updateAccoutInfomation(String gender, String firstName, String lastName, String email, String company){
        checkOnMaleRadio(gender);
        enterToFirstNameTextbox(firstName);
        enterToLastNameTextbox(lastName);
        enterToEmailTextbox(email);
        enterToCompanyTextbox(company);
        clickTheSaveButton();
    }

}

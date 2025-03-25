package pageObjects.users.myAccount;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.users.myAccount.UserAddressPUI;

public class UserAddressPO extends UserSideBarPO {
    private WebDriver driver;

    public UserAddressPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Step("Click to Add New button")
    public void clickTheAddNewButton(){
        waitForElementClickable(driver, UserAddressPUI.ADD_NEW_ADDRESS_BUTTON);
        clickToElement(driver, UserAddressPUI.ADD_NEW_ADDRESS_BUTTON);
    }

    @Step("Enter to First Name textbox with {0}")
    public void enterToFirstNameTextbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.FIRST_NAME_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.FIRST_NAME_TEXTBOX, value);
    }

    @Step("Enter to Last Name textbox with {0}")
    public void enterToLastNameTextbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.LAST_NAME_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.LAST_NAME_TEXTBOX, value);
    }

    @Step("Enter to Email textbox with {0}")
    public void enterToEmailTextbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.EMAIL_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.EMAIL_TEXTBOX, value);
    }

    @Step("Enter to Company textbox with {0}")
    public void enterToCompanyTextbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.COMPANY_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.COMPANY_TEXTBOX, value);
    }

    @Step("Select {0} in Country dropdown")
    public void selectCountryDropdown(String item) {
        waitForElementClickable(driver, UserAddressPUI.COUNTRY_DROPDOWN);
        selectItemInDropdown(driver, UserAddressPUI.COUNTRY_DROPDOWN, item);
    }

    @Step("Select {0} in State dropdown")
    public void selectStateDropdown(String item) {
        waitForElementClickable(driver, UserAddressPUI.STATE_DROPDOWN);
        selectItemInDropdown(driver, UserAddressPUI.STATE_DROPDOWN, item);
    }

    @Step("Enter to City textbox with {0}")
    public void enterToCityTextbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.CITY_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.CITY_TEXTBOX, value);
    }

    @Step("Enter to Address 1 textbox with {0}")
    public void enterToAddress1Textbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.ADDRESS_1_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.ADDRESS_1_TEXTBOX, value);
    }

    @Step("Enter to Address 2 textbox with {0}")
    public void enterToAddress2Textbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.ADDRESS_2_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.ADDRESS_2_TEXTBOX, value);
    }

    @Step("Enter to Zip textbox with {0}")
    public void enterToZipTextbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.ZIP_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.ZIP_TEXTBOX, value);
    }

    @Step("Enter to Phone Number textbox with {0}")
    public void enterToPhoneNumberTextbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.PHONE_NUMBER_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.PHONE_NUMBER_TEXTBOX, value);
    }

    @Step("Enter to Fax Number textbox with {0}")
    public void enterToFaxNumberTextbox(String value) {
        waitForElementVisible(driver, UserAddressPUI.FAX_NUMBER_TEXTBOX);
        sendkeyToElement(driver, UserAddressPUI.FAX_NUMBER_TEXTBOX, value);
    }

    @Step("Verify: Get value of First Name textbox")
    public String getValueFirstNameTextbox() {
        waitForElementVisible(driver, UserAddressPUI.FIRST_NAME_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.FIRST_NAME_TEXTBOX);
    }

    @Step("Verify: Get value of Last Name textbox")
    public String getValueLastNameTextbox() {
        waitForElementVisible(driver, UserAddressPUI.LAST_NAME_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.LAST_NAME_TEXTBOX);
    }

    @Step("Verify: Get value of Email textbox")
    public String getValueEmailTextbox() {
        waitForElementVisible(driver, UserAddressPUI.EMAIL_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.EMAIL_TEXTBOX);
    }

    @Step("Verify: Get value of Company textbox")
    public String getValueCompanyTextbox() {
        waitForElementVisible(driver, UserAddressPUI.COMPANY_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.COMPANY_TEXTBOX);
    }

    @Step("Verify: Get value of City textbox")
    public String getValueCityTextbox() {
        waitForElementVisible(driver, UserAddressPUI.CITY_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.CITY_TEXTBOX);
    }

    @Step("Verify: Get value of Address 1 textbox")
    public String getValueAddress1Textbox() {
        waitForElementVisible(driver, UserAddressPUI.ADDRESS_1_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.ADDRESS_1_TEXTBOX);
    }

    @Step("Verify: Get value of Address 2 textbox")
    public String getValueAddress2Textbox() {
        waitForElementVisible(driver, UserAddressPUI.ADDRESS_2_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.ADDRESS_2_TEXTBOX);
    }

    @Step("Verify: Get value of Zip textbox")
    public String getValueZipTextbox() {
        waitForElementVisible(driver, UserAddressPUI.ZIP_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.ZIP_TEXTBOX);
    }

    @Step("Verify: Get value of Phone Number textbox")
    public String getValuePhoneNumberTextbox() {
        waitForElementVisible(driver, UserAddressPUI.PHONE_NUMBER_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.PHONE_NUMBER_TEXTBOX);
    }

    @Step("Verify: Get value of Fax Number textbox")
    public String getValueFaxNumberTextbox() {
        waitForElementVisible(driver, UserAddressPUI.FAX_NUMBER_TEXTBOX);
        return getTextboxValue(driver, UserAddressPUI.FAX_NUMBER_TEXTBOX);
    }

    @Step("Verify: Get selected item in Country dropdown")
    public String getSelectedItemCountryDropdown() {
        waitForElementVisible(driver, UserAddressPUI.COUNTRY_DROPDOWN);
        return getSelectedItemInDropdown(driver, UserAddressPUI.COUNTRY_DROPDOWN);
    }

    @Step("Verify: Get selected item in State dropdown")
    public String getSelectedItemStateDropdown() {
        waitForElementVisible(driver, UserAddressPUI.STATE_DROPDOWN);
        return getSelectedItemInDropdown(driver, UserAddressPUI.STATE_DROPDOWN);
    }

    @Step("Click the Save button")
    public void clickTheSaveButton(){
        waitForElementClickable(driver, UserAddressPUI.SAVE_BUTTON);
        clickToElement(driver, UserAddressPUI.SAVE_BUTTON);
    }

    @Step("Click the Edit button")
    public void clickTheEditButton() {
        waitForElementClickable(driver, UserAddressPUI.EDIT_BUTTON);
        clickToElement(driver, UserAddressPUI.EDIT_BUTTON);
    }

    @Step("Add new Address")
    public void addNewAddress(String firstName, String lastName, String email, String company, String country, 
                              String state, String cityName, String address, String zipcode, String phoneNumber){
        clickTheAddNewButton();
        enterToFirstNameTextbox(firstName);
        enterToLastNameTextbox(lastName);
        enterToEmailTextbox(email);
        enterToCompanyTextbox(company);
        selectCountryDropdown(country);
        selectStateDropdown(state);
        enterToCityTextbox(cityName);
        enterToAddress1Textbox(address);
        enterToAddress2Textbox(address);
        enterToZipTextbox(zipcode);
        enterToPhoneNumberTextbox(phoneNumber);
        enterToFaxNumberTextbox(phoneNumber);
        clickTheSaveButton();
    }
}

    

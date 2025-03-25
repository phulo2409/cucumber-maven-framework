package pageObjects.users.shoppingCart;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.users.shoppingCart.UserCheckOutPUI;

public class UserCheckOutPO extends BasePage {
    private WebDriver driver;

    public UserCheckOutPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Uncheck on Ship On Same Address checkbox")
    public void uncheckOnShipOnSameAddressCheckbox() {
        waitForElementClickable(driver, UserCheckOutPUI.SHIPPING_SAME_ADDRESS_CHECKBOX);
        uncheckToCheckbox(driver, UserCheckOutPUI.SHIPPING_SAME_ADDRESS_CHECKBOX);
    }

    @Step("Add an new Billing Address")
    public void addNewAddressBilling(String firstName, String lastName, String email, String company, String country,
                                     String state, String city, String address1, String address2, String zip, String phoneNumber, String faxNumber) {
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_FIRST_NAME_TEXTBOX);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_FIRST_NAME_TEXTBOX, firstName);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_LAST_NAME_TEXTBOX, lastName);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_EMAIL_TEXTBOX, email);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_COMPANY_TEXTBOX, company);
        selectItemInDropdown(driver, UserCheckOutPUI.BILLING_COUNTRY_TEXTBOX, country);
        selectItemInDropdown(driver, UserCheckOutPUI.BILLING_STATE_TEXTBOX, state);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_CITY_TEXTBOX, city);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_ADDRESS1_TEXTBOX, address1);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_ADDRESS2_TEXTBOX, address2);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_ZIP_TEXTBOX, zip);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_PHONE_NUMBER_TEXTBOX, phoneNumber);
        sendkeyToElement(driver, UserCheckOutPUI.BILLING_FAX_NUMBER_TEXTBOX, faxNumber);
        clickToElement(driver, UserCheckOutPUI.BILLING_CONTINUE_BUTTON);
    }

    @Step("Add an new Shipping Address")
    public void addNewAddressShipping(String firstName, String lastName, String email, String company, String country,
                                     String state, String city, String address1, String address2, String zip, String phoneNumber, String faxNumber) {
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_FIRST_NAME_TEXTBOX);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_FIRST_NAME_TEXTBOX, firstName);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_LAST_NAME_TEXTBOX, lastName);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_EMAIL_TEXTBOX, email);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_COMPANY_TEXTBOX, company);
        selectItemInDropdown(driver, UserCheckOutPUI.SHIPPING_COUNTRY_TEXTBOX, country);
        selectItemInDropdown(driver, UserCheckOutPUI.SHIPPING_STATE_TEXTBOX, state);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_CITY_TEXTBOX, city);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_ADDRESS1_TEXTBOX, address1);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_ADDRESS2_TEXTBOX, address2);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_ZIP_TEXTBOX, zip);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_PHONE_NUMBER_TEXTBOX, phoneNumber);
        sendkeyToElement(driver, UserCheckOutPUI.SHIPPING_FAX_NUMBER_TEXTBOX, faxNumber);
        clickToElement(driver, UserCheckOutPUI.SHIPPING_CONTINUE_BUTTON);
    }

    @Step("Select {0} item in Shipping Address dropdown ")
    public void selectShippingAddressDropdown(String value) {
        waitForElementClickable(driver, UserCheckOutPUI.SHIPPING_ADDRESS_DROPDOWN);
        selectItemInDropdown(driver, UserCheckOutPUI.SHIPPING_ADDRESS_DROPDOWN, value);
    }

    @Step("Select {0} radiobutton in Shipping Method ")
    public void selectShippingMethod(String method) {
        waitForElementClickable(driver, UserCheckOutPUI.DYNAMIC_SHIPPING_METHOD_NAME, method);
        checkToRadioButton(driver, UserCheckOutPUI.DYNAMIC_SHIPPING_METHOD_NAME, method);
        clickToElement(driver, UserCheckOutPUI.SHIPPING_METHOD_CONTINUE_BUTTON);
    }

    @Step("Select {0} radiobutton in Payment Method")
    public void selectPaymentMethod(String method) {
        waitForElementClickable(driver, UserCheckOutPUI.DYNAMIC_PAYMENT_METHOD_NAME, method);
        checkToRadioButton(driver, UserCheckOutPUI.DYNAMIC_PAYMENT_METHOD_NAME, method);
        clickToElement(driver, UserCheckOutPUI.PAYMENT_METHOD_CONTINUE_BUTTON);
    }

    @Step("Verify: Get text of Payment information")
    public String getPaymentInformation() {
        waitForElementVisible(driver, UserCheckOutPUI.PAYMENT_INFORMATION_TEXT);
        return getTextElement(driver, UserCheckOutPUI.PAYMENT_INFORMATION_TEXT);
    }

    @Step("Click Continue button in Payment Information tab")
    public void clickContinueButtonInPaymentInformation() {
        waitForElementClickable(driver, UserCheckOutPUI.PAYMENT_INFORMATION_CONTINUE_BUTTON);
        clickToElement(driver, UserCheckOutPUI.PAYMENT_INFORMATION_CONTINUE_BUTTON);
    }

    @Step("Verify: Get text of Billing Name")
    public String getBillingNameText(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_NAME_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_NAME_TEXT);
    }

    @Step("Verify: Get text of Billing Email")
    public String getBillingEmailText(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_EMAIL_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_EMAIL_TEXT);
    }

    @Step("Verify: Get text of Billing Phone Number")
    public String getBillingPhoneText(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_PHONE_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_PHONE_TEXT);
    }

    @Step("Verify: Get text of Billing Fax Number")
    public String getBillingFaxText(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_FAX_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_FAX_TEXT);
    }

    @Step("Verify: Get text of Billing Comapny")
    public String getBillingCompanyText(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_COMPANY_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_COMPANY_TEXT);
    }

    @Step("Verify: Get text of Billing Country")
    public String getBillingCountryText(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_COUNTRY_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_COUNTRY_TEXT);
    }

    @Step("Verify: Get text of Billing State")
    public String getBillingStateText(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_STATE_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_STATE_TEXT);
    }

    @Step("Verify: Get text of Billing Address 1")
    public String getBillingAddress1Text(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_ADDRESS1_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_ADDRESS1_TEXT);
    }

    @Step("Verify: Get text of Billing Address 2")
    public String getBillingAddress2Text(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_ADDRESS2_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_ADDRESS2_TEXT);
    }

    @Step("Verify: Get text of Billing Zip Postal")
    public String getBillingZipText(){
        waitForElementVisible(driver, UserCheckOutPUI.BILLING_ZIP_TEXT);
        return getTextElement(driver, UserCheckOutPUI.BILLING_ZIP_TEXT);
    }

    @Step("Verify: Get text of Shipping Name")
    public String getShippingNameText(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_NAME_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_NAME_TEXT);
    }

    @Step("Verify: Get text of Shipping Email")
    public String getShippingEmailText(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_EMAIL_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_EMAIL_TEXT);
    }

    @Step("Verify: Get text of Shipping Phone Number")
    public String getShippingPhoneText(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_PHONE_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_PHONE_TEXT);
    }

    @Step("Verify: Get text of Shipping Fax Number")
    public String getShippingFaxText(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_FAX_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_FAX_TEXT);
    }

    @Step("Verify: Get text of Shipping Company")
    public String getShippingCompanyText(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_COMPANY_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_COMPANY_TEXT);
    }

    @Step("Verify: Get text of Shipping Country")
    public String getShippingCountryText(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_COUNTRY_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_COUNTRY_TEXT);
    }

    @Step("Verify: Get text of Shipping State")
    public String getShippingStateText(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_STATE_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_STATE_TEXT);
    }

    @Step("Verify: Get text of Shipping Address 1")
    public String getShippingAddress1Text(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_ADDRESS1_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_ADDRESS1_TEXT);
    }

    @Step("Verify: Get text of Shipping Address 2")
    public String getShippingAddress2Text(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_ADDRESS2_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_ADDRESS2_TEXT);
    }

    @Step("Verify: Get text of Shipping Zip")
    public String getShippingZipText(){
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_ZIP_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_ZIP_TEXT);
    }

    @Step("Verify: Data are displayed in table")
    public boolean isDataRowDisplayed(String productName, String price, String quantity, String totalPrice) {
        waitForElementVisible(driver, UserCheckOutPUI.DATA_ROW_TABLE, productName, price, quantity, totalPrice);
        return isElementDisplayed(driver, UserCheckOutPUI.DATA_ROW_TABLE, productName, price, quantity, totalPrice);
    }

    @Step("Verify: Get text of Sub-Total price")
    public String getSubTotalPriceText() {
        waitForElementVisible(driver, UserCheckOutPUI.SUB_TOTAL_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SUB_TOTAL_TEXT);
    }

    @Step("Verify: Get text of Shipping price")
    public String getShippingPriceText() {
        waitForElementVisible(driver, UserCheckOutPUI.SHIPPING_COST_TEXT);
        return getTextElement(driver, UserCheckOutPUI.SHIPPING_COST_TEXT);
    }

    @Step("Verify: Get text of Tax price")
    public String getTaxPriceText() {
        waitForElementVisible(driver, UserCheckOutPUI.TAX_COST_TEXT);
        return getTextElement(driver, UserCheckOutPUI.TAX_COST_TEXT);
    }

    @Step("Verify: Get text of Total price")
    public String getTotalPriceText() {
        waitForElementVisible(driver, UserCheckOutPUI.TOTAL_COST_TEXT);
        sleepInSecond(10);
        return getTextElement(driver, UserCheckOutPUI.TOTAL_COST_TEXT);
    }

    @Step("Click Confirm Button")
    public void clickConfirmButton() {
        waitForElementClickable(driver, UserCheckOutPUI.CONFIRM_BUTTON);
        clickToElement(driver, UserCheckOutPUI.CONFIRM_BUTTON);
    }

    @Step("Verify: Get text of Successful title")
    public String getSuccessfulTitle() {
        waitForElementVisible(driver, UserCheckOutPUI.SUCCESS_TITLE);
        return getTextElement(driver, UserCheckOutPUI.SUCCESS_TITLE);
    }

    @Step("Verify: Get text of Successful message")
    public String getSuccessfulMessage() {
        waitForElementVisible(driver, UserCheckOutPUI.SUCCESS_MESSAGE);
        return getTextElement(driver, UserCheckOutPUI.SUCCESS_MESSAGE);
    }

    @Step("Verify: Get text of Order number")
    public String getOrderNumber() {
        waitForElementVisible(driver, UserCheckOutPUI.ORDER_NUMBER);
        return getTextElement(driver, UserCheckOutPUI.ORDER_NUMBER);
    }
}

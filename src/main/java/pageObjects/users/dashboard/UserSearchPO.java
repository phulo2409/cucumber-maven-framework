package pageObjects.users.dashboard;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.users.dashboard.UserSearchPUI;

public class UserSearchPO extends BasePage {
    private WebDriver driver;

    public UserSearchPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Enter {0} to Search Keyword textbox")
    public void enterToSearchKeywordTextbox(String value) {
        waitForElementVisible(driver, UserSearchPUI.SEARCH_KEYWORD_TEXTBOX);
        sendkeyToElement(driver, UserSearchPUI.SEARCH_KEYWORD_TEXTBOX, value);
    }

    @Step("Verify: Get warning validation message")
    public String getWarningValidation() {
        waitForElementVisible(driver, UserSearchPUI.WARNING_VALIDATION);
        return getTextElement(driver, UserSearchPUI.WARNING_VALIDATION);
    }

    @Step("Verify: Get message of no result validation")
    public String getNoResultValidation() {
        waitForElementVisible(driver, UserSearchPUI.NO_RESULT_VALIDATION);
        return getTextElement(driver, UserSearchPUI.NO_RESULT_VALIDATION);
    }

    @Step("Verify: Get Total Product are displayed")
    public int getTotalProductDisplayed() {
        waitForElementVisible(driver, UserSearchPUI.PRODUCT_ITEM);
        return getListElementNumber(driver, UserSearchPUI.PRODUCT_ITEM);
    }

    @Step("Verify: {0} Product item title is displayed")
    public boolean isProductItemTitleDisplayed(String value) {
        waitForElementVisible(driver, UserSearchPUI.PRODUCT_ITEM_TITLE,value);
        return isElementDisplayed(driver, UserSearchPUI.PRODUCT_ITEM_TITLE, value);
    }

    @Step("Check on Advanced Search checkbox")
    public void checkOnAdvancedSearchCheckbox() {
        waitForElementClickable(driver, UserSearchPUI.ADVANCED_SEARCH_CHECKBOX);
        checkToCheckbox(driver, UserSearchPUI.ADVANCED_SEARCH_CHECKBOX);
    }

    @Step("Select {0} item in Category dropdown")
    public void selectItemInCategoryDropDown(String value) {
        waitForElementClickable(driver, UserSearchPUI.CATEGORY_DROPDOWN);
        selectItemInDropdown(driver, UserSearchPUI.CATEGORY_DROPDOWN, value);
    }

    @Step("Uncheck Category checkbox")
    public void uncheckCategoryCheckbox() {
        waitForElementClickable(driver, UserSearchPUI.CATEGORY_CHECKBOX);
        uncheckToCheckbox(driver, UserSearchPUI.CATEGORY_CHECKBOX);
    }

    @Step("Check on Category checkbox")
    public void checkOnCategoryCheckbox() {
        waitForElementClickable(driver, UserSearchPUI.CATEGORY_CHECKBOX);
        checkToCheckbox(driver, UserSearchPUI.CATEGORY_CHECKBOX);
    }

    @Step("Select {0} item in Manufacturer dropdown")
    public void selectItemInManufacturerDropdown(String value) {
        waitForElementClickable(driver, UserSearchPUI.MANUFACTURER_DROPDOWN);
        selectItemInDropdown(driver, UserSearchPUI.MANUFACTURER_DROPDOWN, value);
    }

    @Step("Click the Search button")
    public void clickTheSearchButton(){
        waitForElementClickable(driver, UserSearchPUI.SEARCH_BUTTON);
        clickToElement(driver, UserSearchPUI.SEARCH_BUTTON);
    }
}

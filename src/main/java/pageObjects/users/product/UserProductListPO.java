package pageObjects.users.product;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.PageGenerator;
import pageUIs.users.product.UserProductListPUI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserProductListPO extends BasePage {
    private WebDriver driver;

    public UserProductListPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Select product with {0} title ")
    public UserProductPO openProductByTitle(String name) {
        waitForElementClickable(driver, UserProductListPUI.PRODUCT_NAME_DYNAMIC, name);
        clickToElement(driver, UserProductListPUI.PRODUCT_NAME_DYNAMIC, name);
        return PageGenerator.getPageGenerator().getUserProduct(driver);
    }

    @Step("Get total product displayed")
    public int getTotalProductDisplayed() {
        waitForElementVisible(driver, UserProductListPUI.PRODUCT_ITEM);
        return getListElementNumber(driver, UserProductListPUI.PRODUCT_ITEM);
    }

    @Step("Select 'Sort By' dropdown with {0}")
    public void selectSortByDropdown(String value) {
        waitForElementClickable(driver, UserProductListPUI.SORT_BY_DROPDOWN);
        selectItemInDropdown(driver, UserProductListPUI.SORT_BY_DROPDOWN, value);
        waitAllLoadingIconInvisible(driver);
    }

    @Step("Verify: Name of product is sorting ascending")
    public boolean isNameSortAscending() {
        List<WebElement> productNameElement = getListElement(driver, UserProductListPUI.PRODUCT_NAME);
        List<String> productNameText = new ArrayList<String>();

        for (WebElement productName: productNameElement) {
            productNameText.add(productName.getText());
        }

        List<String> productNameTextClone = new ArrayList<>(productNameText);
        Collections.sort(productNameTextClone);
        return productNameText.equals(productNameTextClone);
    }

    @Step("Verify: Name of product is sorting descending")
    public boolean isNameSortDescending() {
        List<WebElement> productNameElement = getListElement(driver, UserProductListPUI.PRODUCT_NAME);
        List<String> productNameText = new ArrayList<String>();

        for (WebElement productName: productNameElement) {
            productNameText.add(productName.getText());
        }

        List<String> productNameTextClone = new ArrayList<>(productNameText);
        Collections.sort(productNameTextClone);
        Collections.reverse(productNameTextClone);
        return productNameText.equals(productNameTextClone);
    }

    @Step("Verify: Price of product is sorting ascending")
    public boolean isPriceSortAscending() {
        List<WebElement> productPriceElement = getListElement(driver, UserProductListPUI.PRODUCT_PRICE);
        List<Float> productPriceText = new ArrayList<Float>();

        for (WebElement productPrice: productPriceElement) {
            productPriceText.add(Float.valueOf(productPrice.getText().replace("$", "").replace(",", "")));
        }

        List<Float> productPriceTextClone = new ArrayList<>(productPriceText);
        Collections.sort(productPriceTextClone);
        return productPriceText.equals(productPriceTextClone);
    }

    @Step("Verify: Price of product is sorting descending")
    public boolean isPriceSortDescending() {
        List<WebElement> productPriceElement = getListElement(driver, UserProductListPUI.PRODUCT_PRICE);
        List<Float> productPriceText = new ArrayList<Float>();

        for (WebElement productPrice: productPriceElement) {
            productPriceText.add(Float.valueOf(productPrice.getText().replace("$", "").replace(",", "")));
        }

        List<Float> productPriceTextClone = new ArrayList<>(productPriceText);
        Collections.sort(productPriceTextClone);
        Collections.reverse(productPriceTextClone);
        return productPriceText.equals(productPriceTextClone);
    }

    @Step("Select display per page dropdown with {0}")
    public void selectDisplayPerPageDropdown(String number) {
        waitForElementClickable(driver, UserProductListPUI.DISPLAY_PER_PAGE_DROPDOWN);
        selectItemInDropdown(driver, UserProductListPUI.DISPLAY_PER_PAGE_DROPDOWN, number);
        waitAllLoadingIconInvisible(driver);
    }

    @Step("Verify: 'Next page icon' is displayed")
    public boolean isNextPageIconDisplayed(){
        waitForElementVisible(driver, UserProductListPUI.NEXT_PAGE_BUTTON);
        return isElementDisplayed(driver, UserProductListPUI.NEXT_PAGE_BUTTON);
    }

    @Step("verify: 'Previous page icon' is displayed")
    public boolean isPreviousPageIconDisplayed(){
        waitForElementVisible(driver, UserProductListPUI.PREVIOUS_PAGE_BUTTON);
        return isElementDisplayed(driver, UserProductListPUI.PREVIOUS_PAGE_BUTTON);
    }

    @Step("Get current page")
    public String getCurrentPage(){
        waitForElementVisible(driver, UserProductListPUI.CURRENT_PAGE_BUTTON);
        return getTextElement(driver, UserProductListPUI.CURRENT_PAGE_BUTTON);
    }

    @Step("Verify: Paging is undisplayed")
    public boolean isPagingUnDisplayed(){
        waitForElementInvisible(driver, UserProductListPUI.PAGING);
        return isElementUndisplayed(driver, UserProductListPUI.PAGING);
    }

    @Step("Click on 'Next Page' button")
    public void clickOnTheNextPage(){
        waitForElementClickable(driver, UserProductListPUI.NEXT_PAGE_BUTTON);
        clickToElement(driver, UserProductListPUI.NEXT_PAGE_BUTTON);
        waitAllLoadingIconInvisibleAdmin(driver);
    }

    @Step("Click on compare button on Prouct name {0}")
    public void clickCompareProductButtonByProductName(String productName) {
        waitForElementClickable(driver, UserProductListPUI.DYNAMIC_ADD_TO_COMPARE_BUTTON_BY_PRODUCT_NAME, productName);
        clickToElement(driver, UserProductListPUI.DYNAMIC_ADD_TO_COMPARE_BUTTON_BY_PRODUCT_NAME, productName);
        waitAllLoadingIconInvisible(driver);
    }

    @Step("Click on Compare link")
    public UserCompareProductsPO clickOnCompareLink() {
        waitForElementClickable(driver, UserProductListPUI.NOTIFICATION_MESSAGE_LINK);
        clickToElement(driver, UserProductListPUI.NOTIFICATION_MESSAGE_LINK);
        return PageGenerator.getPageGenerator().getCompareProduct(driver);
    }


}

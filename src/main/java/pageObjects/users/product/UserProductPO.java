package pageObjects.users.product;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageObjects.users.shoppingCart.UserShoppingCartPO;
import pageObjects.users.wishlist.UserWishlistPO;
import pageUIs.users.product.UserProductPUI;

public class UserProductPO extends BasePage {
    private WebDriver driver;

    public UserProductPO(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click to Add Your Review link")
    public void clickAddYourReviewLink() {
        waitForElementClickable(driver, UserProductPUI.ADD_YOUR_REVIEW_LINK);
        clickToElement(driver, UserProductPUI.ADD_YOUR_REVIEW_LINK);
    }

    @Step("Enter to Review Title textbox with {0}")
    public void enterToReviewTitleTextbox(String value) {
        waitForElementVisible(driver, UserProductPUI.REVIEW_TITLE_TEXTBOX);
        sendkeyToElement(driver, UserProductPUI.REVIEW_TITLE_TEXTBOX, value);
    }

    @Step("Enter to Review Text textbox with {0}")
    public void enterToReviewTextTextbox(String value) {
        waitForElementVisible(driver, UserProductPUI.REVIEW_TEXT_TEXTAREA);
        sendkeyToElement(driver, UserProductPUI.REVIEW_TEXT_TEXTAREA, value);
    }

    @Step("Check on Rating Radiobutton with {0}")
    public void checkOnRatingRadio(String value) {
        waitForElementClickable(driver, UserProductPUI.RATING_RADIOBUTTON, value);
        clickToElement(driver, UserProductPUI.RATING_RADIOBUTTON, value);
    }

    @Step("Click Submit Review button")
    public void clickSubmitReviewButton() {
        waitForElementClickable(driver, UserProductPUI.SUBMIT_REVIEW_BUTTON);
        clickToElement(driver, UserProductPUI.SUBMIT_REVIEW_BUTTON);
    }

    public void clickOnAddToWishlistButton() {
        waitForElementClickable(driver, UserProductPUI.ADD_TO_WISHLIST_BUTT0N);
        clickToElement(driver, UserProductPUI.ADD_TO_WISHLIST_BUTT0N);
    }

    public UserWishlistPO openWishlistPage() {
        waitForElementClickable(driver, UserProductPUI.WISHLIST_MENU_ITEM);
        clickToElement(driver, UserProductPUI.WISHLIST_MENU_ITEM);
        return PageGenerator.getPageGenerator().getWishList(driver);
    }

    public UserRecentlyViewedProductsPO openRecentlyViewedProductsPage() {
        waitForElementClickable(driver, UserProductPUI.RECENTLY_VIEWED_PRODUCTS_LINK);
        clickToElement(driver, UserProductPUI.RECENTLY_VIEWED_PRODUCTS_LINK);
        return PageGenerator.getPageGenerator().getRecentlyViewedProducts(driver);
    }

    public UserProductListPO clickOnBreadcrumb(String item) {
        waitForElementClickable(driver, UserProductPUI.DYNAMIC_BREADCRUMB_ITEM, item);
        clickToElement(driver, UserProductPUI.DYNAMIC_BREADCRUMB_ITEM, item);
        return PageGenerator.getPageGenerator().getUserProductList(driver);
    }

    public UserShoppingCartPO openShoppingCartPage() {
        waitForElementClickable(driver, UserProductPUI.SHOPPING_CART_MENU_ITEM);
        clickToElement(driver, UserProductPUI.SHOPPING_CART_MENU_ITEM);
        return PageGenerator.getPageGenerator().getShoppingCart(driver);
    }

    public void selectBuildYourOwnComputerToCart(String processor, String ram, String hdd, String os, String microsoftOffice, String acrobatReader, String totalCommander, String quantity) {
        waitForElementClickable(driver, UserProductPUI.PROCESSOR_DROPDOWN);
        selectItemInDropdown(driver, UserProductPUI.PROCESSOR_DROPDOWN, processor);
        selectItemInDropdown(driver, UserProductPUI.RAM_DROPDOWN, ram);
        checkToRadioButton(driver, UserProductPUI.DYNAMIC_HDD_RADIO, hdd);
        checkToRadioButton(driver, UserProductPUI.DYNAMIC_OS_RADIO, os);

        if (microsoftOffice.toUpperCase().equals("YES")) {
            checkToCheckbox(driver, UserProductPUI.DYNAMIC_SOFTWARE_CHECKBOX, "Microsoft Office [+$50.00]");
        } else {
            uncheckToCheckbox(driver, UserProductPUI.DYNAMIC_SOFTWARE_CHECKBOX, "Microsoft Office [+$50.00]");
        }

        if (acrobatReader.toUpperCase().equals("YES")) {
            checkToCheckbox(driver, UserProductPUI.DYNAMIC_SOFTWARE_CHECKBOX, "Acrobat Reader [+$10.00]");
        } else {
            uncheckToCheckbox(driver, UserProductPUI.DYNAMIC_SOFTWARE_CHECKBOX, "Acrobat Reader [+$10.00]");
        }

        if (totalCommander.toUpperCase().equals("YES")) {
            checkToCheckbox(driver, UserProductPUI.DYNAMIC_SOFTWARE_CHECKBOX, "Total Commander [+$5.00]");
        } else {
            uncheckToCheckbox(driver, UserProductPUI.DYNAMIC_SOFTWARE_CHECKBOX, "Total Commander [+$5.00]");
        }
        enterToQuatityProduct(quantity);
        clickAddToCartButton();
    }

    public void clickAddToCartButton() {
        waitForElementClickable(driver, UserProductPUI.ADD_TO_CART_BUTTON);
        clickToElement(driver, UserProductPUI.ADD_TO_CART_BUTTON);
        waitAllLoadingIconInvisible(driver);
    }

    public void enterToQuatityProduct(String number) {
        waitForElementClickable(driver, UserProductPUI.PRODUCT_QUANTITY_TEXTBOX);
        sendkeyToElement(driver, UserProductPUI.PRODUCT_QUANTITY_TEXTBOX, number);
    }

    public String getProductTotalPrice(){
        waitForElementVisible(driver, UserProductPUI.PRODUCT_PRICE);
        return getTextElement(driver, UserProductPUI.PRODUCT_PRICE);
    }

}
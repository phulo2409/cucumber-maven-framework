package pageObjects.users.wishlist;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageObjects.users.shoppingCart.UserShoppingCartPO;
import pageUIs.users.wishlist.UserWishlistPUI;

public class UserWishlistPO extends BasePage {
    private WebDriver driver;

    public UserWishlistPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Click on Wishlist Sharing link")
    public UserWishlistSharePO clickOnWishlistSharingLink() {
        waitForElementClickable(driver, UserWishlistPUI.SHARE_LINK);
        clickToElement(driver, UserWishlistPUI.SHARE_LINK);
        return PageGenerator.getPageGenerator().getWishListShare(driver);
    }

    @Step("Check on Add To Cart button in table of {0} product name")
    public void checkOnAddToCartCheckboxInTable(String productName){
        waitForElementClickable(driver, UserWishlistPUI.DYNAMIC_ADD_BUTTON_BY_PRODUCT_NAME, productName);
        checkToCheckbox(driver, UserWishlistPUI.DYNAMIC_ADD_BUTTON_BY_PRODUCT_NAME, productName);
    }

    @Step("Click on Add To Cart button")
    public void clickAddToCartButton(){
        waitForElementClickable(driver, UserWishlistPUI.ADD_TO_CART_BUTTON);
        clickToElement(driver, UserWishlistPUI.ADD_TO_CART_BUTTON);
    }

    @Step("Remove {0} product name in table")
    public void removeProductByName(String productName) {
        waitForElementClickable(driver, UserWishlistPUI.DYNAMIC_REMOVE_BUTTON_BY_PRODUCT_NAME, productName);
        clickToElement(driver, UserWishlistPUI.DYNAMIC_REMOVE_BUTTON_BY_PRODUCT_NAME, productName );
    }

    @Step("Add product to Shopping Cart")
    public UserShoppingCartPO addProductToCart(String productName){
        checkOnAddToCartCheckboxInTable(productName);
        clickAddToCartButton();
        return PageGenerator.getPageGenerator().getShoppingCart(driver);
    }

    @Step("Verify: Get text of No Data message")
    public String getNoDataText() {
        waitForElementVisible(driver, UserWishlistPUI.NO_DATA_MESSAGE);
        return getTextElement(driver, UserWishlistPUI.NO_DATA_MESSAGE);
    }
}

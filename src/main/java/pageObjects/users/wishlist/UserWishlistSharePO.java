package pageObjects.users.wishlist;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageObjects.users.product.UserProductPO;
import pageUIs.users.dashboard.BasePageUI;
import pageUIs.users.wishlist.UserWishlistSharePUI;

public class UserWishlistSharePO extends BasePage {
    WebDriver driver;

    public UserWishlistSharePO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Verify: Get text of title in Share Wishlist page")
    public String getShareWishlistPageTitle() {
        waitForElementVisible(driver, UserWishlistSharePUI.SHARE_WISHLIST_TITLE);
        return getTextElement(driver, UserWishlistSharePUI.SHARE_WISHLIST_TITLE);
    }

    @Step("Click on Wishlish on Header Menu Item")
    public UserWishlistPO openWishlistPage() {
        waitForElementClickable(driver, UserWishlistSharePUI.WISHLIST_MENU_ITEM);
        clickToElement(driver, UserWishlistSharePUI.WISHLIST_MENU_ITEM);
        return PageGenerator.getPageGenerator().getWishList(driver);
    }

    @Step("Click on Product Name")
    public UserProductPO clickOnProductName(String productName){
        waitForElementClickable(driver, BasePageUI.DYNAMIC_PRODUCT_NAME, productName);
        clickToElement(driver, BasePageUI.DYNAMIC_PRODUCT_NAME, productName);
        return PageGenerator.getPageGenerator().getUserProduct(driver);
    }
}

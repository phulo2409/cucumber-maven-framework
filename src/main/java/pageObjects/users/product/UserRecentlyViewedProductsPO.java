package pageObjects.users.product;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.users.product.UserRecentlyViewedProductsPUI;

public class UserRecentlyViewedProductsPO extends BasePage {
    private WebDriver driver;

    public UserRecentlyViewedProductsPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Verify: Product Name {0} is displayed")
    public boolean isProductNameDisplayed(String productName){
        waitForElementVisible(driver, UserRecentlyViewedProductsPUI.PRODUCT_NAME, productName);
        return isElementDisplayed(driver, UserRecentlyViewedProductsPUI.PRODUCT_NAME, productName);
    }

}

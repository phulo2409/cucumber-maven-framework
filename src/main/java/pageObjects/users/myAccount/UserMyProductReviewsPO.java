package pageObjects.users.myAccount;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.users.myAccount.UserMyProductReviewsPUI;

public class UserMyProductReviewsPO extends BasePage {
    private WebDriver driver;

    public UserMyProductReviewsPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Verify: The Review with {0} title is displayed")
    public boolean isTheReviewDisplayed(String productTitle) {
        waitForElementVisible(driver, UserMyProductReviewsPUI.PRODUCT_REVIEW_TITLE, productTitle);
        return isElementDisplayed(driver, UserMyProductReviewsPUI.PRODUCT_REVIEW_TITLE, productTitle);
    }
}

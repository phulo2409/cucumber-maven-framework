package pageObjects.users.myAccount;

import common.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageObjects.users.dashboard.UserHomePO;
import pageUIs.users.dashboard.BasePageUI;
import pageUIs.users.myAccount.UserSideBarPUI;

public class UserSideBarPO extends BasePage {
    private WebDriver driver;

    public UserSideBarPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Open {0} Link from Sidebar")
    public void openSidebarLinkByPageNames(String pageName){
        waitForElementClickable(driver, UserSideBarPUI.DYNAMIC_LINK_BY_PAGE_NAME, pageName);
        clickToElement(driver, UserSideBarPUI.DYNAMIC_LINK_BY_PAGE_NAME, pageName);
    }

    @Step("Click to Logout link")
    public UserHomePO clickToLogoutLink(){
        waitForElementClickable(driver, BasePageUI.LOGOUT_LINK);
        clickToElement(driver, BasePageUI.LOGOUT_LINK);
        return PageGenerator.getPageGenerator().getUserHomePage(driver);
    }

}

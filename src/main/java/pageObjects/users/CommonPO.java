package pageObjects.users;

import common.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.users.dashboard.BasePageUI;

public class CommonPO extends BasePage {
    private WebDriver driver;

    public CommonPO(WebDriver driver){
        this.driver = driver;
    }

    public void inputToDynamicTextbox(String textboxName, String value){
        waitForElementVisible(driver, BasePageUI.DYNAMIC_TEXTBOX, textboxName);
        sendkeyToElement(driver, BasePageUI.DYNAMIC_TEXTBOX,value,textboxName);
    }

    public void clickOnDynamicMenuItem(String menuItem){
        waitForElementClickable(driver, BasePageUI.DYNAMIC_MENU_ITEM, menuItem);
        clickToElement(driver, BasePageUI.DYNAMIC_MENU_ITEM, menuItem);
    }

    public boolean isDynamicMenuItemDisplayed(String menuItem){
        waitForElementVisible(driver, BasePageUI.DYNAMIC_MENU_ITEM, menuItem);
        return isElementDisplayed(driver, BasePageUI.DYNAMIC_MENU_ITEM, menuItem);
    }
}

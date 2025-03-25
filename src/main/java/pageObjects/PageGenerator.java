package pageObjects;

import org.openqa.selenium.WebDriver;
import pageObjects.users.dashboard.UserHomePO;
import pageObjects.users.dashboard.UserSearchPO;
import pageObjects.users.login.UserLoginPO;
import pageObjects.users.login.UserRegisterPO;

public class PageGenerator {

    public static PageGenerator getPageGenerator(){
        return new PageGenerator();
    }

    public UserHomePO getUserHomePage(WebDriver driver){
        return new UserHomePO(driver);
    }

    public UserRegisterPO getUserRegisterPage(WebDriver driver){
        return new UserRegisterPO(driver);
    }

    public UserLoginPO getUserLoginPage(WebDriver driver){
        return new UserLoginPO(driver);
    }

    public UserSearchPO getUserSearch(WebDriver driver){
        return new UserSearchPO(driver);
    }

}

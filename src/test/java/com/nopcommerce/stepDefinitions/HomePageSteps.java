package com.nopcommerce.stepDefinitions;

import com.nopcommerce.hooks.Hooks;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageObjects.users.dashboard.UserHomePO;

public class HomePageSteps {
    private WebDriver driver;
    private UserHomePO homePage;

    public HomePageSteps(){
        driver = Hooks.getDriver();
        homePage = PageGenerator.getPageGenerator().getUserHomePage(driver);
    }

    @Given("user navigate to NopCommerce page and open Register page")
    public void userNavigateToNopCommercePageAndOpenRegisterPage() {
        homePage.openRegisterPage();
    }
}

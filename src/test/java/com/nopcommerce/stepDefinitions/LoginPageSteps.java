package com.nopcommerce.stepDefinitions;

import com.nopcommerce.commons.Context;
import com.nopcommerce.commons.TestContext;
import com.nopcommerce.hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGenerator;
import pageObjects.users.login.UserLoginPO;
import utilities.NopCommerceData;

public class LoginPageSteps {
    private WebDriver driver;
    private NopCommerceData nopCommerceData;
    private UserLoginPO loginPage;
    private TestContext testContext;

    public LoginPageSteps(TestContext testContext){
        driver = Hooks.getDriver();
        this.testContext = testContext;
        loginPage = PageGenerator.getPageGenerator().getUserLoginPage(driver);
        nopCommerceData = NopCommerceData.getNopCommerceData();
    }

    @When("user enter into Email textbox in Login page")
    public void userEnterIntoEmailTextboxInLoginPage() {
        loginPage.enterToEmailTextbox(testContext.getDataContext().getContext(Context.EMAIL).toString());
    }


    @And("user enter into Password textbox in Login page")
    public void userEnterIntoPasswordTextboxInLoginPage() {
        loginPage.enterToPasswordTextbox(nopCommerceData.getPassword());
    }

    @And("click on Login button")
    public void clickOnLoginButton() {
        loginPage.clickTheLogInButton();
    }


}

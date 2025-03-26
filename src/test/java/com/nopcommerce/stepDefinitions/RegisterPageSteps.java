package com.nopcommerce.stepDefinitions;

import com.nopcommerce.commons.Context;
import com.nopcommerce.commons.TestContext;
import com.nopcommerce.hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.PageGenerator;
import pageObjects.users.login.UserRegisterPO;
import utilities.FakerConfig;
import utilities.NopCommerceData;

public class RegisterPageSteps {
    private WebDriver driver;
    private UserRegisterPO registerPage;
    private NopCommerceData nopCommerceData;
    private FakerConfig fakerConfig;
    private String email;
    private TestContext testContext;

    public RegisterPageSteps(TestContext testContext){
        driver = Hooks.getDriver();
        this.testContext = testContext;
        registerPage = PageGenerator.getPageGenerator().getUserRegisterPage(driver);
        nopCommerceData = NopCommerceData.getNopCommerceData();
        fakerConfig = FakerConfig.getFaker();
        email = fakerConfig.getEmailAddress();
    }



    @When("user enter into First Name textbox")
    public void userEnterIntoFirstNameTextbox() {
        registerPage.enterToFirstNameTextbox(nopCommerceData.getFirstName());
    }

    @And("user enter into Last Name textbox")
    public void userEnterIntoLastNameTextbox() {
        registerPage.enterToLastNameTextbox(nopCommerceData.getLastName());
    }

    @And("user enter into Email textbox")
    public void userEnterIntoEmailTextbox() {
        registerPage.enterToEmailTextbox(email);
    }

    @And("user enter into Company textbox")
    public void userEnterIntoCompanyTextbox() {
        registerPage.enterToCompanyTextbox(nopCommerceData.getCompany());
    }

    @And("user enter into Password textbox")
    public void userEnterIntoPasswordTextbox() {
        registerPage.enterToPasswordTextbox(nopCommerceData.getPassword());
    }

    @And("user enter into Confirm Password textbox")
    public void userEnterIntoConfirmPasswordTextbox() {
        registerPage.enterToConfirmPasswordTextbox(nopCommerceData.getPassword());
    }

    @And("click on Register button")
    public void clickOnRegisterButton() {
        registerPage.clickTheRegisterButton();
    }

    @Then("user should see {string} success message is displayed")
    public void userShouldSeeSuccessMessageIsDisplayed(String message) {
        Assert.assertEquals(registerPage.getRegisterSuccessMessage(), message);
    }


    @Given("create an account successfully")
    public void createAnAccountSuccessfully() {
        registerPage.createAnAccount(nopCommerceData.getFirstName(), nopCommerceData.getLastName(), email, nopCommerceData.getCompany(), nopCommerceData.getPassword());
        testContext.getDataContext().setContext(Context.EMAIL, email);
    }
}

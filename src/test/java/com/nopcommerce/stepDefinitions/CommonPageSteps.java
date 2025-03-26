package com.nopcommerce.stepDefinitions;

import com.nopcommerce.hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.PageGenerator;
import pageObjects.users.CommonPO;
import utilities.FakerConfig;

public class CommonPageSteps {
    private WebDriver driver;
    private CommonPO commonPage;
    private FakerConfig fakerConfig;
    private String email;

    public CommonPageSteps(){
        driver = Hooks.getDriver();
        commonPage = PageGenerator.getPageGenerator().getCommon(driver);
        fakerConfig = FakerConfig.getFaker();
        email = fakerConfig.getEmailAddress();
    }

    @When("user enter into {string} textbox with value {string}")
    public void userEnterIntoTextboxWithValue(String textboxName, String value) {
        if (textboxName.equals("Email:")){
            value = email;
        }
        commonPage.inputToDynamicTextbox(textboxName, value);
    }

    @And("click on {string} button on menu bar")
    public void clickOnButtonOnMenuBar(String item) {
        commonPage.clickOnDynamicMenuItem(item);
    }


    @Then("user should see {string} item on menu bar")
    public void userShouldSeeItemOnMenuBar(String item) {
        Assert.assertTrue(commonPage.isDynamicMenuItemDisplayed(item));
    }
}

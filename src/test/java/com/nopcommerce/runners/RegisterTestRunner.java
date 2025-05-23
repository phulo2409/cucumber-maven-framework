package com.nopcommerce.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.nopcommerce.stepDefinitions",
                "com.nopcommerce.hooks"
        },
        plugin = {"pretty",
                "html:target/cucumber-html-report.html",
                "html:target/cucumber-reports/cucumber-report-default",
                "json:target/cucumber-reports/cucumber.json",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        tags = "@Register_Dynamic"
)

@Test
public class RegisterTestRunner extends AbstractTestNGCucumberTests {
}

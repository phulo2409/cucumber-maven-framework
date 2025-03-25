package com.nopcommerce.hooks;

import common.GlobalConstants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private static WebDriver driver;
    private static final Logger log = LogManager.getLogger(Hooks.class.getName());

    @Before
    public synchronized void openBrowser() {
        String browser = System.getProperty("BROWSER");
        System.out.println("Browser name run by command line = " + browser);

        if (driver == null) {
            try {
                if (browser == null) {
                    browser = System.getenv("BROWSER");
                    if (browser == null) {
                        browser = "edge";
                    }
                }

                switch (browser) {
                    case "chrome":
                        driver = new ChromeDriver();
                        break;
                    case "hchrome":
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("headless");
                        chromeOptions.addArguments("window-size=1920x1080");
                        driver = new ChromeDriver(chromeOptions);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        break;
                    case "hfirefox":
                        WebDriverManager.firefoxdriver().setup();
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        driver = new FirefoxDriver(firefoxOptions);
                        break;
                    case "edge":
                        EdgeOptions edgeOptions = new EdgeOptions();
                        edgeOptions.addArguments("--user-data-dir=C:/Users/Admin/AppData/Local/Microsoft/Edge/User Data/");
                        edgeOptions.addArguments("--profile-directory=Profile 1");
                        driver = new EdgeDriver(edgeOptions);
                        break;
                    case "ie":
                        WebDriverManager.iedriver().arch32().setup();
                        driver = new InternetExplorerDriver();
                        break;
                    default:
                        driver = new ChromeDriver();
                        break;
                }
            } catch (WebDriverException e) {
                driver = new ChromeDriver();
            }

            driver.get(GlobalConstants.getGlobalConstants().getUrl());
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            log.info("------------- Started the browser -------------");
        }
    }

    @After
    public void closeBrowser(Scenario scenario) {
        if (driver != null) {
            try {
                log.info("------------- Closing the browser -------------");
                driver.quit();
                driver = null;
            } catch (UnreachableBrowserException e) {
                log.error("Cannot close the browser: " + e.getMessage());
            }
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
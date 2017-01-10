package org.fundacionjala.pivotal.cucumber.stepdefinition.login;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fundacion.pivotal.pages.HomePage;
import org.fundacion.pivotal.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;


/**
 * @author JorgeForero
 */
public class LoginStepDef {
    WebDriver driver;
    HomePage home;

    @When("^I login with valid credentials$")
    public void iLoginWithValidCredentials() {
        System.setProperty("webdriver.chrome.driver", ".\\tools\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.pivotaltracker.com/signin");

        LoginPage login = new LoginPage(driver);
        login.setUserName("jorge.forero@fundacion-jala.org");
        login.clickContinue();
        login.setPassword("jb&11235");
        home = login.clickSubmit();

    }

    @Then("^I expect the HomePage is displayed$")
    public void itIsExpectedThatTheDisplayUserName() {
        assertTrue(home.getTitle().contains("Dashboard"));
        driver.quit();
    }
}

package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginTest {
    WebDriver driver;
    @Given("I have opened the application in the browser")
    public void I_have_opened_the_application_in_the_browser() {
        System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("I have been navigated to the login page")
    public void I_have_been_navigated_to_the_login_page() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("I enter username {string} and password {string}")
    public void I_enter_username_and_password(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
    }

    @When("I click the login button")
    public void I_click_the_login_button() {
        driver.findElement(By.id("login-button")).click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.urlContains("inventory.html"));
    }

    @Then("I should see the message {string} on the login form")
    public void I_should_see_the_message_on_the_login_form(String expectedResult) {
        String actualResult = driver.findElement(By.cssSelector("[data-test='error']")).getText();
        Assert.assertEquals("Epic sadface: " + expectedResult, actualResult);
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}

package WEB.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then; 

public class LoginStepDefinitions {

    WebDriver driver;

    @Given("User has opened the application in the browser")
    public void userHasOpenedApplication() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("url_of_application");
    }

    @Given("User has navigated to the login page")
    public void userHasNavigatedToLoginPage() {
        // Implementasi navigasi ke halaman login
    }

    @When("User enters the username and password")
    public void userEntersUsernameAndPassword() {
        // Implementasi memasukkan username dan password
    }

    @When("User clicks on the login button")
    public void userClicksOnLoginButton() {
        // Implementasi mengklik tombol login
    }

    @Then("User should be directed to the home page")
    public void userDirectedToHomePage() {
        // Implementasi memeriksa pengalihan ke halaman beranda
    }

    @Then("User should see a notification {string}")
    public void userSeeNotification(String notification) {
        // Implementasi memeriksa notifikasi
    }
}


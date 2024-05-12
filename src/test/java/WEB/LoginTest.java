package WEB;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginTest {

    @Given("User has opened the application in the browser")
    public void userHasOpenedApplication() {
        // Implementasi langkah-langkah untuk membuka aplikasi dalam browser
    }

    @Given("User has navigated to the login page")
    public void userHasNavigatedToLoginPage() {
        // Implementasi langkah-langkah untuk menavigasi ke halaman login
    }

    @When("User enters the username and password")
    public void userEntersUsernameAndPassword() {
        // Implementasi langkah-langkah untuk memasukkan username dan password
    }

    @When("User clicks on the login button")
    public void userClicksOnLoginButton() {
        // Implementasi langkah-langkah untuk mengklik tombol login
    }

    @Then("User should be directed to the home page")
    public void userDirectedToHomePage() {
        // Implementasi langkah-langkah untuk memeriksa pengalihan ke halaman beranda
    }

    @Then("User should see a notification {string}")
    public void userSeeNotification(String notification) {
        // Implementasi langkah-langkah untuk memeriksa notifikasi
    }
}

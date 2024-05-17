package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(By.id("login-button")).click();
    }

    public String getErrorMessage() {
        WebElement errorMessageElement = driver.findElement(By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3"));
        return errorMessageElement.getText();
    }
}

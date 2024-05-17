package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    private WebDriver driver;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutButton;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isLogoutButtonDisplayed() {
        return logoutButton.isDisplayed();
    }
    
    public void clickLogoutButton() {
        logoutButton.click();
    }
}

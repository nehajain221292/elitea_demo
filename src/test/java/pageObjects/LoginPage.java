package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();
    }
}

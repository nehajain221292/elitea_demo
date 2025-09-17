package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to the login page")
    public void navigateToLoginPage() {
        driver = new ChromeDriver();
        driver.get("https://phptravels.net/login");
    }

    @When("I enter valid credentials")
    public void enterValidCredentials() {
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        emailField.sendKeys("user@phptravels.com");
        passwordField.sendKeys("demouser");
    }

    @When("I click on the login button")
    public void clickLoginButton() {
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();
    }

    @Then("I should see the dashboard")
    public void verifyDashboardIsVisible() {
        WebElement dashboard = driver.findElement(By.id("dashboard"));
        assert(dashboard.isDisplayed());
        driver.quit();
    }
}
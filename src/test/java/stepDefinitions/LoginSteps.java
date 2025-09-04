package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to the login page")
    public void i_navigate_to_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://phptravels.net/login");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        emailField.sendKeys("user@phptravels.com");
        passwordField.sendKeys("demouser");
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();
    }

    @Then("I should see the PHPTRAVELS logo on the dashboard page")
    public void i_should_see_the_phptravels_logo_on_the_dashboard_page() {
        boolean logoVisible = driver.findElement(By.xpath("//img[@alt='PHPTRAVELS']")).isDisplayed();
        assert(logoVisible);
        driver.quit();
    }
}

package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    @And("I enter {string} in the email field")
    public void i_enter_email(String email) {
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(email);
    }

    @And("I enter {string} in the password field")
    public void i_enter_password(String password) {
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
    }

    @When("I click on the {string} button")
    public void i_click_on_login_button(String button) {
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        loginButton.click();
    }

    @Then("I should see the {string} logo on the dashboard page")
    public void i_should_see_logo(String logo) {
        WebElement logoElement = driver.findElement(By.xpath("//img[@alt='PHPTRAVELS']"));
        assert(logoElement.isDisplayed());
        driver.quit();
    }
}

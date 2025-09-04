package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Given("I enter {string} in the email field")
    public void i_enter_in_the_email_field(String email) {
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(email);
    }

    @Given("I enter {string} in the password field")
    public void i_enter_in_the_password_field(String password) {
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String button) {
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        loginButton.click();
    }

    @Then("I should see the {string} logo on the dashboard page")
    public void i_should_see_the_logo_on_the_dashboard_page(String logo) {
        WebElement logoElement = driver.findElement(By.xpath("//img[@alt='PHPTRAVELS']"));
        Assert.assertTrue(logoElement.isDisplayed());
        driver.quit();
    }
}

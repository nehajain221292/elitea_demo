package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
    }

    @When("I click on the Login button")
    public void i_click_on_the_login_button() {
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));
        loginButton.click();
    }

    @Then("I should be redirected to the secure area")
    public void i_should_be_redirected_to_the_secure_area() {
        WebElement secureArea = driver.findElement(By.id("flash"));
        assert(secureArea.getText().contains("You logged into a secure area!"));
        driver.quit();
    }
}
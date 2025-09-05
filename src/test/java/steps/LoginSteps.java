package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("I enter Email as {string} and Password as {string}")
    public void i_enter_email_and_password(String email, String password) {
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("I click on 'Login' button")
    public void i_click_on_login_button() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard() {
        assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
        driver.quit();
    }
}
package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("I enter email {string} and password {string}")
    public void i_enter_email_and_password(String email, String password) {
        driver.findElement(By.name("email"))
              .sendKeys(email);
        driver.findElement(By.name("password"))
              .sendKeys(password);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String button) {
        driver.findElement(By.xpath("//button[contains(text(), '" + button + "')]")).click();
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard() {
        assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
        driver.quit();
    }
}
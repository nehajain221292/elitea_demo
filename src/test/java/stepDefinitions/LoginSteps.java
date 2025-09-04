package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://phptravels.net/login");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
        driver.findElement(By.name("password")).sendKeys("demouser");
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.xpath("//button[text()='Login']")).click();
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard() {
        boolean isDashboardVisible = driver.findElement(By.xpath("//h2[text()='PHPTRAVELS']")).isDisplayed();
        assert(isDashboardVisible);
        driver.quit();
    }
}
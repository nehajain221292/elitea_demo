package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class VisaSteps {
    WebDriver driver;

    @Given("I am logged in")
    public void i_am_logged_in() {
        driver = new ChromeDriver();
        driver.get("https://phptravels.net/login");
        driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
        driver.findElement(By.name("password")).sendKeys("demouser");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        assertTrue(driver.findElement(By.id("dashboard")).isDisplayed());
    }

    @When("I navigate to visa section")
    public void i_navigate_to_visa_section() {
        driver.findElement(By.linkText("Visa")).click();
    }

    @When("I fill from country as {string} and to country as {string}")
    public void i_fill_from_country_and_to_country(String fromCountry, String toCountry) {
        driver.findElement(By.name("from_country")).sendKeys(fromCountry);
        driver.findElement(By.name("to_country")).sendKeys(toCountry);
    }

    @When("I click on 'Search' button")
    public void i_click_on_search_button() {
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("I should see the 'Submission Form' page")
    public void i_should_see_the_submission_form_page() {
        assertTrue(driver.findElement(By.id("submission_form")).isDisplayed());
        driver.quit();
    }
}
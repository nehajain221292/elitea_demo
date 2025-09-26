package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class VisaSearchSteps {
    WebDriver driver;

    @Given("I am logged in")
    public void i_am_logged_in() {
        // Reuse login steps
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.i_navigate_to("https://phptravels.net/login");
        loginSteps.i_enter_email_and_password("user@phptravels.com", "demouser");
        loginSteps.i_click_on_the_button("Login");
        loginSteps.i_should_see_the_dashboard();
        this.driver = loginSteps.driver;
    }

    @When("I navigate to the visa section")
    public void i_navigate_to_the_visa_section() {
        WebElement visaSection = driver.findElement(By.linkText("Visa"));
        visaSection.click();
    }

    @When("I fill from country as {string} and to country as {string}")
    public void i_fill_from_country_as_and_to_country_as(String fromCountry, String toCountry) {
        WebElement fromCountryField = driver.findElement(By.name("from_country"));
        WebElement toCountryField = driver.findElement(By.name("to_country"));
        fromCountryField.sendKeys(fromCountry);
        toCountryField.sendKeys(toCountry);
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() {
        WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(), 'Search')]");
        searchButton.click();
    }

    @Then("I should see the {string} page")
    public void i_should_see_the_page(String pageTitle) {
        // Wait for page to load (simple sleep for demo, use WebDriverWait in real code)
        try { Thread.sleep(3000); } catch (InterruptedException e) { }
        Assert.assertTrue(driver.getPageSource().contains(pageTitle));
        driver.quit();
    }
}
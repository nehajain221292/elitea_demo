package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class VisaSteps {
    WebDriver driver;

    @Given("user is logged in")
    public void user_is_logged_in() {
        driver = new ChromeDriver();
        driver.get("https://phptravels.net/login");
        WebElement email = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        email.sendKeys("user@example.com");
        password.sendKeys("password");
        loginButton.click();
    }

    @When("user navigates to visa section")
    public void user_navigates_to_visa_section() {
        WebElement visaLink = driver.findElement(By.linkText("Visa"));
        visaLink.click();
    }

    @And("user fills from country as {string} and to country as {string}")
    public void user_fills_from_country_as_and_to_country_as(String fromCountry, String toCountry) {
        WebElement fromCountryDropdown = driver.findElement(By.name("from_country"));
        WebElement toCountryDropdown = driver.findElement(By.name("to_country"));
        fromCountryDropdown.sendKeys(fromCountry);
        toCountryDropdown.sendKeys(toCountry);
    }

    @And("user clicks on search")
    public void user_clicks_on_search() {
        WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));
        searchButton.click();
    }

    @Then("verify 'Submission Form' page is visible")
    public void verify_submission_form_page_is_visible() {
        WebElement submissionForm = driver.findElement(By.xpath("//h2[text()='Submission Form']"));
        assert(submissionForm.isDisplayed());
        driver.quit();
    }
}

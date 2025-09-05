package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class VisaSteps {
    WebDriver driver;

    @And("I navigate to the visa section")
    public void i_navigate_to_visa_section() {
        driver.findElement(By.linkText("Visa")).click();
    }

    @And("I fill from country as {string} and to country as {string}")
    public void i_fill_from_country_and_to_country(String fromCountry, String toCountry) {
        driver.findElement(By.name("from_country")).sendKeys(fromCountry);
        driver.findElement(By.name("to_country")).sendKeys(toCountry);
    }

    @And("I click on 'Search' button")
    public void i_click_on_search_button() {
        driver.findElement(By.cssSelector("button[type='submit'")).click();
    }

    @Then("I should see the {string} page")
    public void i_should_see_the_page(String pageTitle) {
        assertTrue(driver.findElement(By.xpath("//h1[text()='" + pageTitle + "']")).isDisplayed());
        driver.quit();
    }
}

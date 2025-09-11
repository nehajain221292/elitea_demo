package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaSteps {
    WebDriver driver;

    @And("^I navigate to the visa section$")
    public void navigateToVisaSection() {
        WebElement visaSection = driver.findElement(By.linkText("Visa"));
        visaSection.click();
    }

    @And("^I fill from country as \"([^\"]*)\" and to country as \"([^\"]*)\"$")
    public void fillVisaForm(String fromCountry, String toCountry) {
        WebElement fromCountryElement = driver.findElement(By.id("from_country"));
        WebElement toCountryElement = driver.findElement(By.id("to_country"));
        fromCountryElement.sendKeys(fromCountry);
        toCountryElement.sendKeys(toCountry);
    }

    @And("^I click on the \"Search\" button$")
    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(By.id("search_button"));
        searchButton.click();
    }

    @Then("^I should see the \"Submission Form\" page$")
    public void verifySubmissionFormPage() {
        WebElement submissionForm = driver.findElement(By.id("submission_form"));
        assert(submissionForm.isDisplayed());
    }
}

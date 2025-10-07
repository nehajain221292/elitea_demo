package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class VisaApplicationSteps {
    private WebDriver driver;

    @Given("the user fills out all required fields with valid information")
    public void the_user_fills_out_all_required_fields_with_valid_information() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/visa-application");
        WebElement nameField = driver.findElement(By.name("name"));
        WebElement passportField = driver.findElement(By.name("passport"));
        WebElement dobField = driver.findElement(By.name("dob"));
        nameField.sendKeys("John Doe");
        passportField.sendKeys("123456789");
        dobField.sendKeys("01/01/1980");
    }

    @Given("the user leaves one or more required fields empty")
    public void the_user_leaves_one_or_more_required_fields_empty() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://example.com/visa-application");
        WebElement nameField = driver.findElement(By.name("name"));
        WebElement passportField = driver.findElement(By.name("passport"));
        WebElement dobField = driver.findElement(By.name("dob"));
        nameField.sendKeys("");
        passportField.sendKeys("");
        dobField.sendKeys("");
    }

    @When("the user submits the visa application form")
    public void the_user_submits_the_visa_application_form() {
        WebElement submitButton = driver.findElement(By.xpath("//button[contains(text(), 'Submit')]"));
        submitButton.click();
    }

    @Then("the application should be submitted successfully")
    public void the_application_should_be_submitted_successfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean confirmationVisible = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("confirmation"), "Your visa application has been submitted"));
        assertTrue("Confirmation message is not visible", confirmationVisible);
        driver.quit();
    }

    @Then("the application should not be submitted")
    public void the_application_should_not_be_submitted() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        boolean errorVisible = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("error"), "Please fill out all required fields"));
        assertTrue("Error message is not visible", errorVisible);
        driver.quit();
    }

    @And("the user should see a confirmation message 'Your visa application has been submitted'")
    public void the_user_should_see_a_confirmation_message() {
        WebElement confirmationMessage = driver.findElement(By.id("confirmation"));
        assertTrue("Confirmation message is not visible", confirmationMessage.isDisplayed());
    }

    @And("the user should see an error message 'Please fill out all required fields'")
    public void the_user_should_see_an_error_message() {
        WebElement errorMessage = driver.findElement(By.id("error"));
        assertTrue("Error message is not visible", errorMessage.isDisplayed());
    }
}

package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.junit.Assert.assertTrue;

public class TestCaseCreationSteps {
    private WebDriver driver;

    @Given("I am logged into the website")
    public void i_am_logged_into_the_website() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://example.com/login");
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        emailField.sendKeys("test@example.com");
        passwordField.sendKeys("password");
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]");
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }

    @When("I attempt to create a test case without the priority field")
    public void i_attempt_to_create_a_test_case_without_the_priority_field() {
        WebElement createTestCaseButton = driver.findElement(By.xpath("//button[contains(text(), 'Create Test Case')]");
        createTestCaseButton.click();
        WebElement testCaseNameField = driver.findElement(By.name("testCaseName"));
        testCaseNameField.sendKeys("Test Case without Priority");
        WebElement saveButton = driver.findElement(By.xpath("
package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class VisaSearchSteps {
    WebDriver driver;

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("I enter email {string} and password {string}")
    public void i_enter_email_and_password(String email, String password) {
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String buttonText) {
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(), 'Login')]"));
        loginButton.click();
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
        toCountryField.sendKeys
package com.elitea_demo.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import java.time.Duration;

import org.junit.Assert;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("I enter email {string} and password {string}")
    public void i_enter_email_and_password(String email, String password) {
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }

    @And("I click on the {string} button")
    public void i_click_on_the_button(String button) {
        WebElement loginButton = driver.findElement(By.xpath("//button/span[text()='" + button + "']"));
        loginButton.click();
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> d.findElement(By.xpath("//span[text()='Dashboard']")));
        WebElement dashboard = driver.findElement(By.xpath("//span[text()='Dashboard']"));
        Assert.assertTrue(dashboard.isDisplayed());
        driver.quit();
    }
}
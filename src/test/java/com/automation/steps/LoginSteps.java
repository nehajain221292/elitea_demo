package com.automation.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("I navigate to {string}")
    public void i_navigate_to(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @And("I enter {string} in the email field")
    public void i_enter_in_the_email_field(String email) {
        driver.findElement(By.name("email"))
                .sendKeys(email);
    }

    @And("I enter {string} in the password field")
    public void i_enter_in_the_password_field(String password) {
        driver.findElement(By.name("password"))
                .sendKeys(password);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String button) {
        driver.findElement(By.xpath("//button[text()='" + button + "']"))
                .click();
    }

    @Then("I should see the dashboard")
    public void i_should_see_the_dashboard() {
        boolean isDashboardVisible = driver.findElement(By.id("dashboard"))
                .isDisplayed();
        assert isDashboardVisible;
        driver.quit();
    }
}
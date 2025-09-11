package com.automation.steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VisaApplicationSteps {
    WebDriver driver;

    @And("I navigate to the visa section")
    public void i_navigate_to_the_visa_section() {
        driver.findElement(By.linkText("Visa")).click();
    }

    @And("I fill from country as {string} and to country as {string}")
    public void i_fill_from_country_as_and_to_country_as(String fromCountry, String toCountry) {
        driver.findElement(By.name("from_country")).sendKeys(fromCountry);
        driver.findElement(By.name("to_country")).sendKeys(toCountry);
    }

    @When("I click on the {string} button")
    public void i_click_on_the_search_button(String button) {
        driver.findElement(By.xpath("//button[text()='" + button + "']")).click();
    }

    @Then("I should see the {string} page")
    public void i_should_see_the_submission_form_page(String page) {
        boolean isPageVisible = driver.findElement(By.xpath("//h1[text()='" + page + "']")).isDisplayed();
        assert isPageVisible;
        driver.quit();
    }
}
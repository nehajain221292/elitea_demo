package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import java.util.concurrent.TimeUnit;

public class LoginSteps {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://phptravels.net/login");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        WebElement emailField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        emailField.sendKeys("user@phptravels.com");
        passwordField.sendKeys("demouser");
    }

    @And("I click on the Login button")
    public void i_click_on_the_login_button() {
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Login']"));
        loginButton.click();
    }

    @Then("I should see PHPTRAVELS dashboard")
    public void i_should_see_phptravels_dashboard() {
        WebElement dashboard = driver.findElement(By.xpath("//h2[text()='PHPTRAVELS']"));
        assert(dashboard.isDisplayed());
    }

    @And("I click on Flights from header menu")
    public void i_click_on_flights_from_header_menu() {
        WebElement flightsMenu = driver.findElement(By.xpath("//a[text()='Flights']"));
        flightsMenu.click();
    }

    @And("I search for a flight from Pune to Indore for tomorrow's date")
    public void i_search_for_a_flight_from_pune_to_indore_for_tomorrow_date() {
        WebElement fromCity = driver.findElement(By.name("fromCity"));
        WebElement toCity = driver.findElement(By.name("toCity"));
        WebElement departureDate = driver.findElement(By.name("departureDate"));
        fromCity.sendKeys("Pune");
        toCity.sendKeys("Indore");
        departureDate.sendKeys("tomorrow's date");
        WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));
        searchButton.click();
    }

    @Then("I should see the details of the first flight")
    public void i_should_see_the_details_of_the_first_flight() {
        WebElement firstFlight = driver.findElement(By.xpath("(//div[@class='flight-details'])[1]"));
        assert(firstFlight.isDisplayed());
        driver.quit();
    }
}

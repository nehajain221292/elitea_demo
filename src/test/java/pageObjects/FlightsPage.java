package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightsPage {
    WebDriver driver;

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFlight(String fromCity, String toCity, String departureDate) {
        WebElement fromCityField = driver.findElement(By.name("fromCity"));
        WebElement toCityField = driver.findElement(By.name("toCity"));
        WebElement departureDateField = driver.findElement(By.name("departureDate"));
        fromCityField.sendKeys(fromCity);
        toCityField.sendKeys(toCity);
        departureDateField.sendKeys(departureDate);
        WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));
        searchButton.click();
    }

    public boolean isFirstFlightVisible() {
        WebElement firstFlight = driver.findElement(By.xpath("(//div[@class='flight-details'])[1]"));
        return firstFlight.isDisplayed();
    }
}

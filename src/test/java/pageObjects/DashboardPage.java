package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDashboardVisible() {
        WebElement dashboard = driver.findElement(By.xpath("//h2[text()='PHPTRAVELS']"));
        return dashboard.isDisplayed();
    }

    public void clickFlightsMenu() {
        WebElement flightsMenu = driver.findElement(By.xpath("//a[text()='Flights']"));
        flightsMenu.click();
    }
}

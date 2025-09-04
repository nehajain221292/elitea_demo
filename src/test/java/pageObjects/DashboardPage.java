package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {
    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    By dashboardText = By.xpath("//*[contains(text(), 'PHPTRAVELS')]");

    public boolean isDashboardTextVisible() {
        WebElement text = driver.findElement(dashboardText);
        return text.isDisplayed();
    }
}

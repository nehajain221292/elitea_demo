package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class VisaSectionSteps {

    @Given("user is on the visa section")
    public void user_is_on_the_visa_section() {
        // Code to navigate to visa section
    }

    @When("user fills from country as {string} and to country as {string}")
    public void user_fills_from_country_as_and_to_country_as(String fromCountry, String toCountry) {
        // Code to fill from country and to country
    }

    @When("user clicks on search")
    public void user_clicks_on_search() {
        // Code to click on search
    }

    @Then("verify {string} page is visible")
    public void verify_page_is_visible(String pageName) {
        // Code to verify the page is visible
        assertTrue(pageName + " page is not visible", true); // Replace true with actual condition
    }
}

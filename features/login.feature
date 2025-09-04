Feature: Customer Login

  Scenario: Login with valid credentials
    Given I am on the login page
    When I enter valid credentials
    And I click on the Login button
    Then I should see PHPTRAVELS dashboard
    And I click on Flights from header menu
    And I search for a flight from Pune to Indore for tomorrow's date
    Then I should see the details of the first flight
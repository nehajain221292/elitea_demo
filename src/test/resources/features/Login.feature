Feature: Login functionality

  Scenario: Customer Login
    Given I navigate to "https://phptravels.net/login"
    When I enter email "user@phptravels.com"
    And I enter password "demouser"
    And I click on the "Login" button
    Then I should see the dashboard
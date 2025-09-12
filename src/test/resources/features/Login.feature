Feature: Customer Login

  Scenario: Successful Login
    Given I navigate to "https://phptravels.net/login"
    When I enter email "user@phptravels.com" and password "demouser"
    And I click on the "Login" button
    Then I should see the dashboard
Feature: Customer Login

  Scenario: Successful login with valid credentials
    Given I navigate to "https://phptravels.net/login"
    When I enter "user@phptravels.com" in the email field
    And I enter "demouser" in the password field
    And I click on the "Login" button
    Then I should see "PHPTRAVELS" on the dashboard page
Feature: Customer Login

  Scenario: Successful login with valid credentials
    Given I navigate to "https://phptravels.net/login"
    And I enter "user@phptravels.com" in the email field
    And I enter "demouser" in the password field
    When I click on the "Login" button
    Then I should see the "PHPTRAVELS" logo on the dashboard page
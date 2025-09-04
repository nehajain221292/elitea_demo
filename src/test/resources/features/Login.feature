Feature: Customer Login

  Scenario: Successful login with valid credentials
    Given I navigate to the login page
    When I enter valid credentials
    And I click on the login button
    Then I should see the PHPTRAVELS logo on the dashboard page
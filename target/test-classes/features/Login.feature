Feature: Customer Login

  Scenario: Successful login with valid credentials
    Given I navigate to "https://phptravels.net/login"
    When I enter Email as "user@phptravels.com" and Password as "demouser"
    And I click on 'Login' button
    Then I should see the dashboard
Feature: Visa Search

  Scenario: Search visa from India to France
    Given I navigate to "https://phptravels.net/login"
    And I enter "user@phptravels.com" in the email field
    And I enter "demouser" in the password field
    When I click on the "Login" button
    Then I should see the dashboard
    And I navigate to the visa section
    And I fill from country as "India" and to country as "France"
    When I click on the "Search" button
    Then I should see the "Submission Form" page
Feature: Visa Section Navigation

  Scenario: User navigates to visa section and searches for visa
    Given I navigate to "https://phptravels.net/login"
    When I enter email "user@phptravels.com" and password "demouser"
    And I click on the "Login" button
    And I navigate to the visa section
    And I fill from country as "India" and to country as "France"
    And I click on the "Search" button
    Then I should see the "Submission Form" page
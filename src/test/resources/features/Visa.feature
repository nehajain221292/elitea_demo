Feature: Visa Application

  Scenario: Apply for Visa
    Given I navigate to "https://phptravels.net/login"
    When I enter Email as "user@phptravels.com" and Password as "demouser"
    And I click on 'Login' button
    And I navigate to the visa section
    And I fill from country as "India" and to country as "France"
    And I click on 'Search' button
    Then I should see the "Submission Form" page
Feature: Visa Application

  Scenario: Apply for Visa
    Given I am logged in
    When I navigate to visa section
    And I fill from country as "India" and to country as "France"
    And I click on 'Search' button
    Then I should see the 'Submission Form' page
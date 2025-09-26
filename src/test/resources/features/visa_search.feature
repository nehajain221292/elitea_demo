Feature: Visa Search

  Scenario: Search for visa from India to France
    Given I am logged in
    When I navigate to the visa section
    And I fill from country as "India" and to country as "France"
    And I click on the search button
    Then I should see the "Submission Form" page
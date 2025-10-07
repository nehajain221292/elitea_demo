Feature: Visa Search

  Scenario: Customer tries to proceed without selecting From country
    Given I am logged in
    When I navigate to the visa section
    And I fill from country as "" and to country as "USA"
    And I click on the search button
    Then I should see the "Error: From country is required" message
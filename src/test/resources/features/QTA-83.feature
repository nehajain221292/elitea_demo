Feature: Visa Search

  Scenario: Customer selects valid From country, To country, and travel date
    Given I am logged in
    When I navigate to the visa section
    And I fill from country as "India" and to country as "USA"
    And I click on the search button
    Then I should see the "Visa Search Results" page
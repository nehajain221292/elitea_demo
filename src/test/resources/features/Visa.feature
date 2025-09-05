Feature: Visa Section
  Scenario: User searches for visa
    Given user is logged in
    When user navigates to visa section
    And user fills from country as "India" and to country as "France"
    And user clicks on search
    Then verify 'Submission Form' page is visible
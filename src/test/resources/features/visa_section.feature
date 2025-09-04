Feature: Visa Section

  Scenario: User navigates to visa section and searches for visa
    Given user is on the visa section
    When user fills from country as "India" and to country as "France"
    And user clicks on search
    Then verify "Submission Form" page is visible
Feature: Jira Issue Creation

  Scenario: Verify JSON payload for Jira issue creation
    Given I have a JSON payload for Jira issue creation
    When I attempt to create a Jira issue with the payload
    Then I should encounter formatting issues
    And I should verify the Jira API's specific requirements for JSON formatting
    And I should test the payload directly in a controlled environment
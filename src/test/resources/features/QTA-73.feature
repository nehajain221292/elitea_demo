Feature: QTA-73 Test Case

  Scenario: Verify user can successfully log in
    Given I navigate to the login page
    When I enter valid credentials
    And I click on the login button
    Then I should see the dashboard
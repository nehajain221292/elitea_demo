Feature: Test Case Creation without Priority Field

  Scenario: Create test case without priority field
    Given I am logged into the website
    When I attempt to create a test case without the priority field
    Then the test case should be created successfully
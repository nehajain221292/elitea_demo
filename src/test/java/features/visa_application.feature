Feature: Visa Application

  Scenario: Successful visa application submission with valid data
    Given the user fills out all required fields with valid information
    When the user submits the visa application form
    Then the application should be submitted successfully
    And the user should see a confirmation message 'Your visa application has been submitted'

  Scenario: Submission fails when required fields are missing
    Given the user leaves one or more required fields empty
    When the user submits the visa application form
    Then the application should not be submitted
    And the user should see an error message 'Please fill out all required fields'

Feature: Compose Email

  Scenario: Open compose window
    Given I am on Gmail home page
    When I click on the Compose button
    Then the compose window should open

  Scenario: Verify empty recipient field
    Given I am on Gmail home page
    When I click on the Compose button
    Then the email address field should be empty

  Scenario: Verify empty subject field
    Given I am on Gmail home page
    When I click on the Compose button
    Then the subject field should be empty

  Scenario: Verify empty body field
    Given I am on Gmail home page
    When I click on the Compose button
    Then the body field should be empty
    

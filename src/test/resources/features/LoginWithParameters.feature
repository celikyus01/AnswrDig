Feature: Login as different users

  Scenario: login as a driver user
    Given the user is in Login page
    When the user logs in using "user1" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"

  Scenario: login as driver
    Given the user is in Login page
    When the user logs in as a "user"
    Then the user should be able to login
    And the title contains "Dashboard"

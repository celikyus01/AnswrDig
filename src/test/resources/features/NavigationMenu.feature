@navigate

Feature: Navigation Menu
  @deneme
  Scenario: Navigating Fleet -- Vehicles
    Given the user is in Login page
    And the user logs in using "user1" and "UserUser123"
    When the user navigates to "Fleet" -- "Vehicles"
    Then the title should be "Vehicles"
  @db
  Scenario: Navigating Marketting  -- Campaigns
    Given the user is in Login page
    And the user logs in using "user1" and "UserUser123"
    When the user navigates to "Fleet" -- "Vehicles"
    Then the title should be "Vehicles"
  @ds
  Scenario: Navigating Activities -- Calendar
    Given the user is in Login page
    And the user logs in as a "driver"
    When the user navigates to "Activities" -- "Calendar Events"
    Then the title should be "Calendar"

  @homework
  Scenario: Menu Options
    Given the user is in Login page
    And the user logs in as a "driver"
    Then the user see "Fleet" "Customer" "Activities" "System"
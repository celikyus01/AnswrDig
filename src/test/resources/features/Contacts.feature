@Contact
Feature: Contacts page


  Scenario: Default Page number
    Given the user is in Login page
    And the user enter the driver information
    When the user navigates to "Customers" -- "Contacts"
    Then default page number should be 1


  Scenario: Default Page number
    Given the user is in Login page
    And the user enter the sales manager information
    When the user navigates to "Activities" -- "Calendar Events"
    Then default page number should be 1

  Scenario: Menu Options
    When the user logs in as a "driver"
    Then the user should see following options
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

  Scenario Outline: login as a given user <userType>
    Given the user is in Login page
    When the user logs in using following credentals
      | username  | <userType>  |
      | password  | <password>  |
      | firstName | <firstName> |
      | lastName  | <lastName>  |
    Then the user should be able to login
    Examples:
      | userType        | firstName | lastName | password    |
      | user1           | Jhon      | Doe      | UserUser123 |
      | salesmanager101 | Peyton    | Harber   | UserUser123 |
      | storemanager85  | Marcella  | Huels    | UserUser123 |


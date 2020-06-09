Feature: Account types
  @wip
  Scenario: Driver user
    Given the user logs in as a "<userType>"
    When the user navigates to "Activities" -- "Calendar Events"
    Then the title contains "Calendar Events - ActivitiesS"

  Scenario: Sales manager user
    Given the user logs in as a "Sales Manager"
    When the user navigates to "Customers" -- "Accounts"
    Then the title contains "Accounts - Customers"

  Scenario: Store Manager User
    Given the user logs in as a "Store Manager"
    Then the user navigates to "Customers" -- "Contacts"
    Then the title contains "Contacts - Customers"

  #---------------------------------------------------------

  Scenario: Login with users
    Given the user logs in as a "driver"

  Scenario: Login with users
    Given the user logs in as a "sales manager"

  Scenario: Login with users
    Given the user logs in as a "store manager"
    #---------------------------------------------
  Scenario Outline: Login with different users
    Given the user logs in as a "<userType>"
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |

                                     #if the parameter needs "" use it
                                      #otherwise dont use
                                    #we dont used in Scenario Outline
  Scenario Outline: Login with accounts <userType>
    Given the user logs in as a "<userType>"
    When the user navigates to "<tab>" -- "<module>"
    Then the title contains "<title>"
    Examples:
      | userType      | tab        | module          | title                        |
      | driver        | Activities | Calendar Events | Calendar Events - Activities |
      | sales manager | Customers  | Accounts        | Accounts - Customers         |
      | store manager | Customers  | Contacts        | Contacts - Customers         |


  Scenario Outline: Login with Different accounts <userType>
    Given the user logs in as a "<userType>"
    When the user navigates to "<tab>" -- "<module>"
    Then the title contains "<title>"

    Examples:
      | userType      | tab        | module          | title                                                              |
      | driver        | Fleet      | Vehicles Model  | Vehicles Model - Entities - System - Car - Entities - System       |
      | driver        | Customers  | Accounts        | Accounts - Customers                                               |
      | driver        | Customers  | Contacts        | Contacts - Customers                                               |
      | driver        | Activities | Calendar Events | Calendar Events - Activities                                       |
      | driver        | System     | Jobs            | Jobs - System                                                      |
      | sales manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | sales manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | sales manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | sales manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | sales manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | sales manager | System     | Jobs            | All - Jobs - System                                                |
      | store manager | Fleet      | Vehicles        | All - Car - Entities - System - Car - Entities - System            |
      | store manager | Fleet      | Vehicles Model  | All - Vehicles Model - Entities - System - Car - Entities - System |
      | store manager | Customers  | Accounts        | All - Accounts - Customers                                         |
      | store manager | Customers  | Contacts        | All - Contacts - Customers                                         |
      | store manager | Activities | Calendar Events | All - Calendar Events - Activities                                 |
      | store manager | System     | Jobs            | All - Jobs - System                                                |
      | store manager | System     | Menus           | All - Menus - System                                               |


  Scenario Outline: Login with different users
    Given the user logs in as a "<userType>"

    Examples:
      | userType      |
      | driver        |
      | admin         |
      | sales manager |
      | store manager |








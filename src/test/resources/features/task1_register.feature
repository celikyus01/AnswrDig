@wip
Feature: Register

  Scenario:
    Given the user is in the main page
    When the user navigates to "Forms" -- "Practice Form"
    When the user fill the form with below data
      | First Name | Kamil       |
      | Last Name  | Karate      |
      | Email      | bla@bla.com |

  @wip2
  Scenario Outline:
    Given the user is in the main page
    When the user navigates to "Forms" -- "Practice Form"
#    When the user enter "<First Name>" , "<Last Name>" and "<Email>"
    When the user fill "First Name" as "<First Name>"
    And the user fill "Last Name" as "<Last Name>"
    And the user fill "Email" as "<Email>"
    When the user select "Gender" as "<Gender>"
    And the user select "Hobbies" as "<Hobbies>"



    Examples:
      | First Name | Last Name | Email       | Gender | Hobbies |
      | Kamil      | Karete    | bla@bla.com | Male   | Sports  |

  @wip3
  Scenario Outline:
    Given the user is in the main page
    When the user navigates to "Elements" -- "Text Box"
    When the user fill "Full Name" as "<Full Name>"
    And the user fill "Email" as "<Email>"

    When the user clicks on "Submit" button
    Examples:
      | Full Name    | Email         |
      | Kamil Karate | aaa@gmail.com |







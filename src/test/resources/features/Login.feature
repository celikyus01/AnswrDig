@login
Feature: Users should be login

  Background:
    Given the user is in Login page
      @smoke @driver @VYT-123
      Scenario: Login as a driver
        When  the user enter the driver information
        Then the user should be able to login
      @salesManager @VYT-123
      Scenario: Login as a sales manager
        When  the user enter the sales manager information
        Then the user should be able to login
      @smoke @storeManager
      Scenario: Login as store manager
        When the user enter the store manager information
        Then the user should be able to login

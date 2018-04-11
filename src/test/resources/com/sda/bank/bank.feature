Feature: Bank functionality
  Scenario: I can add user to bank
    Given I instantiate Bank
    And I create user with name 'Adam Marcinko' and pesel '123456789'
    When I insert user to the bank
    Then User is present in the bank
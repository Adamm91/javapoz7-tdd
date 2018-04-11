Feature:

  Scenario: I can calculate single number
    Given I initialize stringCal
    And I pass 5 value
    When I trigger calculate function
    Then I get 5 as a result

  Scenario: I can calculate null number
    Given I initialize stringCal
    And I pass value null
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate blank number
    Given I initialize stringCal
    And I pass  value
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate double numbers
    Given I initialize stringCal
    And I pass 1;4 value
    When I trigger calculate function
    Then I get 5 as a result

  Scenario: I can calculate multiple numbers
    Given I initialize stringCal
    And I pass 12;5;4 value
    When I trigger calculate function
    Then I get 21 as a result

  Scenario: I can calculate multiple numbers with whitespaces
    Given I initialize stringCal
    And I pass 1; 2;   2 value
    When I trigger calculate function
    Then I get 5 as a result

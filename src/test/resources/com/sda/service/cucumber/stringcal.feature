Feature:

  Scenario: I can calculate single number
    Given I initialize stringCal
    And I pass single number value
    When I trigger calculate function
    Then I get 5 as a result

  Scenario: I can calculate null number
    Given I initialize stringCal
    And I pass null value
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate blank number
    Given I initialize stringCal
    And I pass blank value
    When I trigger calculate function
    Then I get 0 as a result

  Scenario: I can calculate double numbers
    Given I initialize stringCal
    And I pass two numbers
    When I trigger calculate function
    Then I get 5 as a result

  Scenario: I can calculate multiple numbers
    Given I initialize stringCal
    And I pass few numbers
    When I trigger calculate function
    Then I get 21 as a result

  Scenario: I can calculate multiple numbers with whitespaces
    Given I initialize stringCal
    And I pass few numbers with whitespaces
    When I trigger calculate function
    Then I get 5 as a result

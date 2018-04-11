Feature:

  Scenario: I can calculate null number
    Given I initialize stringCal
    And I pass value null
    When I trigger calculate function
    Then I get 0 as a result

  Scenario Outline: i can calculate multiple values
    Given I initialize stringCal
    And I pass <values> value
    When I trigger calculate function
    Then I get <result> as a result
    Examples:
      | values    | result |
      | 5         | 5      |
      |           | 0      |
      | 1;4       | 5      |
      | 12;5;4    | 21     |
      | 1; 2;   2 | 5      |
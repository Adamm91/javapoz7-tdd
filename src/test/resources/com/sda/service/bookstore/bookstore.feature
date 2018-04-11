Feature:

  Scenario: I can add a book to the bookstore
    Given I instantiate bookstore
    And I create book
    When I add book to bookstore
    Then Book is present in bookstore

    Scenario: I can change titles
      Given I instantiate bookstore
      And I create book
      When I add book to bookstore
      And I can change the title
      Then Book title is changed

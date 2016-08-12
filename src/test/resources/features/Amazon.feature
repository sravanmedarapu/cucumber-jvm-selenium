Feature: SignIn amazon.co.uk website

  Scenario: Sign in
    Given I open browser
    When I open amazon.co.uk website
    Then I Should see co.uk in the url domain
    When I sign in
    Then I Should See HomePage

  Scenario: Verify book on Orders history page
    When I open Your Orders Page
    Then I Should see following OrderName
      | Cucumber Recipes: Automate Anything with BDD Tools and Techniques (Pragmatic Programmers) |

  Scenario Outline: Order Book
    When I open amazon.co.uk website
    And I search item "<Name>"
    Then I should see results related "<Name>"
    And I should be able to place the order
    And I should be able to logout
    And I quit browser

    Examples:
      | Name |
      | Functional Programming in Scala |
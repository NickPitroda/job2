
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Dating site
    Given User is a male
    And should be single
    When at the time of signup
    And he is above 18+
    Then he can signup
    And use the account to find a mate for a date

  @tag2
  Scenario: I'm testing discounts
    Given Customer is 3 years old customer
    When customer renews policy
    Then 10% discount is to be applied

  @tag3
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | Sumanth |     5 | success |
      | Revanth |     7 | Fail    |

#Author: Lydia
@tag
Feature: Controlgroup Page Test

  @UI
  Scenario: Controlgroup Page Test
    Given user is on Jquery homepage
    When user click <Controlgroup> button
    Then user is loaded on Controlgroup page
    Then user gets into the frame
    And user can select their rental cars

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in ste

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

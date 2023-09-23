Feature: widgets_Spinner

  @UI
  Scenario: Selecting each button on spinner
    Given Users goes to jQuery.com
    When User clicks on Spinner
    Then User should select a value of "3"
    And User should click on every button

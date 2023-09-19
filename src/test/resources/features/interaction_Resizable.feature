Feature: interactions_Resizable

  @UI
  Scenario: Resiza the box 
    Given Users goes to jQuery.com
    When User clicks on resizable
    Then User should be able to resize the box

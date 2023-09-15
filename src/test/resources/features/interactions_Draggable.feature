Feature: interactions_Draggable

  @UI
  Scenario: Dragging the box to expected point
    Given Users goes to jQuery.com
    When User clicks on Draggable
    Then User should click and drag the box

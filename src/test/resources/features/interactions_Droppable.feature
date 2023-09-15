Feature: interactions_Droppable

  @UI
  Scenario: Dragging the box to the expected drop location
    Given Users goes to jQuery.com
    When User clicks on Droppable
    Then User should click and drag the box to the desire location

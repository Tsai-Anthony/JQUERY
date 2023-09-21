#Author: Krystal
Feature: Selectable

  @UI
  Scenario: Clicking each Item boxes
  
    Given user is on Jquery homepage
    When user click <Selectable> button
    Then user goes in to the frame
    And user can clicks Item1 button
    And user can clicks Item2 button
    And user can clicks Item3 button
    And user can clicks Item4 button
    And user can clicks Item5 button
    And user can clicks Item6 button
    And user can clicks Item7 button

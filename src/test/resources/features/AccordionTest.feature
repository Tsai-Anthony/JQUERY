#Author: Lydia
@tag
Feature: AccordionPage Test

  @tag1
  Scenario: Testing each section and its content
    Given user is on Jquery homepage
    When user click <Accordion> button
    Then user is loaded on Accordion page
    Then user gets into the frame
    And user can click Section1 button and validate its content
    And user can click Section2 button and validate its content
    And user can click Section3 button and validate its content
    And user can click Section4 button and validate its content

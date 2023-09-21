#Author:Lydia

Feature: Button page test
  

@jQuery
  Scenario: Button page test
    Given user is on Jquery homepage
    When user click <Button> button
    Then user is loaded on Button page
    Then user gets into the frame
    And user can click all the buttons
    

  
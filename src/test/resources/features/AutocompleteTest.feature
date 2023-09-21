#Author: Lydia
@tag
Feature: AutocompeltePage Test

  @tag1
  Scenario: Testing the <Tags> autocompletion
    Given user is on Jquery homepage
    When user click <Autocomplete> button
    Then user is loaded on Autocomplete page
    Then user gets into the frame
    #When user enters "ja" in the <Tags> frame
    #Then user can see a list of tags and find searchedTag - "Java" and click it
  	When user enters "c" in the <Tags> frame
    Then user can see a list of tags and find searchedTag - "C++" and click it

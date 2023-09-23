Feature: widgets_Selectmenu

  @UI
  Scenario: Selecting each menu and every options in it.
    Given Users goes to jQuery.com
    When User clicks on Selectmenu
    Then User should click on every option in each menu drop down
#Author: Lydia
Feature: Checkboxradio page test

  @UI
  Scenario Outline: Checkboxradio page test
    Given user is on Jquery homepage
    When user click <Checkboxradio> button
    Then user is loaded on Checkboxradio page
    Then user gets into the frame
    Then user can select their requirments
      | Location      | <Location>      |
      | Hotel Ratings | <Hotel Ratings> |
      | Bed Type      | <Bed Type>      |

    Examples: 
      | Location | Hotel Ratings | Bed Type |
      | New York | 4 Star         | 1 King    |
      | Paris    | 3 Star         | 1 Queen   |
      | London   | 5 Star         | 2 Queen   |
      | Paris    | 2 Star         | 2 Double  |

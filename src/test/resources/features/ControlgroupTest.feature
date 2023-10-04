#Author: Lydia
@tag
Feature: Controlgroup Page Test

  @UI
  Scenario Outline: Controlgroup One Test
    Given user is on Jquery homepage
    When user click <Controlgroup> button
    Then user is loaded on Controlgroup page
    Then user gets into the frame
    And user can select their rental car1
      | TypeOfCar1      | <TypeOfCar1>      |
      | Standard1       | <Standard1>       |
      | Automatic1      | <Automatic1>      |
      | Insurance1      | <Insurance1>      |
      | Number of cars1 | <Number of cars1> |

    Examples: 
      | TypeOfCar1 | Standard1 | Automatic1 | Insurance1 | Number of cars1 |
      | SUV        | False     | True       | False      |               2 |
      | Luxury     | True      | False      | True       |               1 |

  @UI
  Scenario Outline: Controlgroup Two Test
    Given user is on Jquery homepage
    When user click <Controlgroup> button
    Then user is loaded on Controlgroup page
    Then user gets into the frame
    And user can select their rental car2
      | TypeOfCar2      | <TypeOfCar2>      |
      | Standard2       | <Standard2>       |
      | Automatic2      | <Automatic2>      |
      | Insurance2      | <Insurance2>      |
      | Number of cars2 | <Number of cars2> |

    Examples: 
      | TypeOfCar2 | Standard2 | Automatic2 | Insurance2 | Number of cars2 |
      | Van        | False     | True       | True       |               2 |
      | Truck      | True      | False      | True       |               1 |

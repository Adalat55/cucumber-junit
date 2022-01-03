@datatables
Feature: DDT example with Cloudtables

  Scenario Outline: Adding multiple users to the table
    Given User is on cloudtables home page
    When User enters "<firstName>" to firstname field
    And User enters "<lastName>" to lastname field
    And User enters "<position>" to position field
    And User enters "<salary>" to salary field
    And User clicks on create button
    Then "<firstName>" should be added to the list
    Examples:
      | firstName | lastName | position            | salary |
      | Janina    | R        | SDET                | 115000 |
      | Nisso     | U        | Automation Engineer | 150000 |
      | Kamila    | S        | Developer           | 130000 |
      | Fahima    | E        | UI Developer        | 180000 |
      | Adalat    | O        | SDET                | 200000 |


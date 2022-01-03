@lyft
Feature: Searching Lyft fare details
  As a rider, I should be able to enter pickup and dropoff locations so that I can see the estimated fare

  Scenario: Fare estimate using City
    Given User is on lyft fare estimate page
    When User enters "Woodland hills" to pickup adress
    And User enters "Beverly Hills, CA, USA" to drop-off adress
    And User clicks on get estimate button
    Then User should see estimated prices


  Scenario: Fare estimate using full adress
    Given User is on lyft fare estimate page
    When User enters "20544 Ventura Boulevard, Woodland Hills, CA, USA" to pickup adress
    And User enters "7039 Topanga Canyon Boulevard, Canoga Park, CA, USA" to drop-off adress
    And User clicks on get estimate button
    Then User should see estimated prices


  Scenario: Fare estimate using empty adress
    Given User is on lyft fare estimate page
    When User enters "" to pickup adress
    And User enters "" to drop-off adress
    Then User should see error message


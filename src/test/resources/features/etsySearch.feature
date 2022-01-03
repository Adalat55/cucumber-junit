@regression @etsy   #this is a tag
Feature: User etsy search
  As a user, when I search for an item, I should see the results.

  @smoke
  Scenario: User search for wooden spoon
    Given User is on etsy homepage
    Then Page title should be as expected
    When User searches for wooden spoon
    Then Page title should start with wooden spoon


  Scenario: Users empty search
    Given User is on etsy homepage
    Then Page title should be as expected
    When User searches for empty value
    Then All categories should be displayed
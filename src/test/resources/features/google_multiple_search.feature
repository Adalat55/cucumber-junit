 @google
 Feature: Passing multiple parameters to the step

   As a user I should be able to search for multiple inputs

   Scenario: User should be able to search for multiple parameters
    Given User is on Google home page
    Then  User should be able to search for following:
      | java          |
      | selenium      |
      | cucumber bdd  |
      | QA automation |
      | wooden spoon  |
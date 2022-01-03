@google
Feature: Data driven testing using scenario outline Examples table

  Scenario Outline: Google capital city search
    Given User is on Google home page
    When User searches for "<country>" capital
    Then User should see "<capital>"  in the result
    Examples:
      | country      | capital          |
      | USA          | Washington, D.C. |
      | Turkey       | Ankara           |
      | Ukraine      | Kyiv             |
      | Turkmenistan | Ashgabat         |
      | Latvia       | Riga             |
      | Uzbekistan   | Tashkent         |
      | Eritrea      | Asmara           |

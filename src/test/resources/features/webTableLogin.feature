Feature: User should be login with valid credentials

  Background: user is on the login page

  Scenario: Positive login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user clicks the login button
    Then user should see url contains orders


  Scenario: Positive login scenario
    When user enters username "Test" password "Testers" and logins
    Then user should see url contains orders


  Scenario: User should be able to see all 12 months in months dropdown
    When User enters below credentials
      | username     | Test   |
      | password     | Tester |
    Then User should see url contains orders
Feature: Loginpage
  Scenario: User Enters bad credentials
    Given User enters bad username
    And User enters bad password
    When User hits login button
    Then User is Restricted from entering into web

  Scenario: User Enters the valid credentials
    Given User enter the valid username
    And User enters the valid password
    When User clicks the login button
    Then user enters into the site

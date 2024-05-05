Feature: Test Main App
  Background: User Should logged inn
    Given User enter the valid usernamee
    And User enters the valid passwordd
    When User clicks the login buttonn
    Then user enters into the sitee

    Scenario: User enters to the qa page
      Given User clicks the qa button
      And User Clicks the user Management button

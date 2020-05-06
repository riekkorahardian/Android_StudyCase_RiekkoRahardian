@Android @Login
Feature: Login

  @TS001
  Scenario: login with correct username and password using email
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "riekkorahardn29@gmail.com" on username text field
    And User input password "123456r" on password text field
    And User click sign in button on sign in page
    Then User is on moka favourite page

  @TS002
  Scenario: login with correct username and password using phone
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input phone "08155111706" on username text field
    And User input password "123456r" on password text field
    And User click sign in button on sign in page
    Then User is on moka favourite page

  @TS003
  Scenario: login with correct username and incorrect password
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "riekkorahardn29@gmail.com" on username text field
    And User input password "12233456r" on password text field
    And User click sign in button on sign in page
    Then User see error state Authentication failed
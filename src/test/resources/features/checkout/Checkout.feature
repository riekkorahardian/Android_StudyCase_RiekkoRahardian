@Android @Checkout
Feature: Checkout

  Background:
    Given User is on moka start page
    When User click sign in button on moka start page
    And User input email "riekkorahardn29@gmail.com" on username text field
    And User input password "123456r" on password text field
    And User click sign in button on sign in page

  @TS004
  Scenario: User make order with 1 quantity and pay by cash
    Given User is on moka favourite page
    When User add item "Korean Bulgogi" with quantity "1" on favourite page
    And User click charge button
    And The user select the total payment that equal to the total price
    And User click charge button on checkout PopUp
    Then User see receipt page with "No Change" information
    Then User click charge back button

  @TS005
  Scenario: User make order with more quantity and pay by cash
    Given User is on moka favourite page
    When User add item "Korean Bulgogi" with quantity "3" on favourite page
    And User click charge button
    And The user select the total payment that equal to the total price
    And User click charge button on checkout PopUp
    Then User see receipt page with "No Change" information
    Then User click charge back button

  @TS006
  Scenario: User make order and the total payment is more than total price by cash
    Given User is on moka favourite page
    When User add item "Japanese Beef Yakiniku" with quantity "2" on favourite page
    And User click charge button
    And The user select the total payment is more than the total price
    And User click charge button on checkout PopUp
    Then User see receipt page with "Rp 4.000 Change" information
    Then User click charge back button

  @TS007
  Scenario: User make order and the total payment is highest than total price by cash
    Given User is on moka favourite page
    When User add item "Japanese Beef Yakiniku" with quantity "2" on favourite page
    And User click charge button
    And The user select the total payment is highest than the total price
    And User click charge button on checkout PopUp
    Then User see receipt page with "Rp 14.000 Change" information
    Then User click charge back button

  @TS008
  Scenario: User make order and the total payment is Rp 150.000 by cash
    Given User is on moka favourite page
    When User add item "Japanese Beef Yakiniku" with quantity "2" on favourite page
    And User click charge button
    And The user input "150000" cash payment on cash text field
    And User click charge button on checkout PopUp
    Then User see receipt page with "Rp 64.000 Change" information
    Then User click charge back button

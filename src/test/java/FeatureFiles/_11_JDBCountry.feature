Feature: Testing JDBC States

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully

    Scenario: States Testing with JDBC
      And Click on the element in the left Nav
      |setupOne|
      |parameters|
      |states|

      Then Send query the database "select * from states" and control match
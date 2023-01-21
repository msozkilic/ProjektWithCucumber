Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to basqar

  Scenario: Create a country
    When Create a country
    Then Success message should be displayed

  Scenario: Create a country parameter data
    When Create a country name as "Serkan" code as "code2"
    Then Success message should be displayed

Feature: Country Multi Scenario
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to basqar

  @Regression
  Scenario: Create a country
    When Create a country
    Then Success message should be displayed
  @Regression
  Scenario: Create a country parameter data
    When Create a country name as "Serkan77" code as "code21"
    Then Success message should be displayed

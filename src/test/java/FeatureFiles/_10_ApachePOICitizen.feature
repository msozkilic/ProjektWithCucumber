Feature: ApachePOI Citizen Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Cizienship page

  Scenario: Create citizenship from Excel
    When User Create citizenship with ApachiPOI

  Scenario: delete citizenship from Excel
    Then User Delete citizenship with ApachiPOI
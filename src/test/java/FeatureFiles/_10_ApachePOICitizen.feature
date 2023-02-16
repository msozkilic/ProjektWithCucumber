Feature: ApachePOI Citizen Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Cizienship page

    Scenario: Create and delete citizenship from Excel
      When User Create citizenship with ApachiPOI

      Then User Delete citizenship with ApachiPOI
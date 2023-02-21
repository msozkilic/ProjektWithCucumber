Feature: Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    And User should login succesfully
    And Navigate to basqar

    Scenario Outline:Citizenship create
      When User a Citizenship name as<name> short name as <shortName>
      Then Success message should be displayed

      When User a Citizenship name as<name> short name as <short Name>
      Then Already exist message should be displayed
      And Click on close button

      Then User delete the <name>
      And Success message should be displayed

      Examples:
        |name  |short name|
        |germany      |ger          |
        | france     |   fran       |




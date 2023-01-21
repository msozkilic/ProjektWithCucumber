Feature: Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Cizienship page

    Scenario Outline : Citizenship create
      When User a Citizenship name as<CitizenshipName>short name as <ShortName>
      Then Success message should be displayed

      When User a Citizenship name as<CitizenshipName>short name as <ShortName>
      Then Already exist message should be displayed
      And Click on close button
      Examples:
        |  CitizenshipName|ShortName|
        |  vatan131|v13|
        |  vatan132|v14|
        |  vatan133|v15|
        |  vatan134|v16|
        |  vatan132|v17|


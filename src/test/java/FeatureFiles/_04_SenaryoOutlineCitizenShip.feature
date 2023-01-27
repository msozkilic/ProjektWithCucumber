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

    When User delete the <CitizenshipName>
    Then Success message should be displayed
    Examples:
      |  CitizenshipName|ShortName|
      |  vatan231|v23|
      |  vatan232|v24|
      |  vatan233|v25|
      |  vatan234|v26|
      |  vatan232|v27|


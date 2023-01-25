#Daha önceki Creat a Fee ,delete Senaryosunu
  #Asagidaki 5 farkli degerler ile calistiriniz

Feature: Fee Functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline: Create a Fee,delete Fee

And Click on the element in the left Nav
|setupOne|
|parameters|
|fees |
And Click on the element in the Dialog
|addButton|

And User sending the keys in Dialog content
|nameInput|<name>|
|codeInput|<code>|
|integrationCode|<iCode>|
|priorityCode|<pCode>|

And Click on the element in the Dialog
|saveButton|

And Success message should be displayed

And User delete item from Dilaog
|<name>|

And Success message should be displayed
  Examples:
    | name    | code          | iCode       |pCode |
    | serkan12| academicPeriod| gradeLevel2 |aaa|
    | serkan12| academicPeriod1| gradeLevel2|aa|
    | serkan12| academicPeriod1| gradeLevel2|aaa|
    | serkan12|academicPeriod1 | gradeLevel2|aaa|

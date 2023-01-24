#1 sinav girisi yapip ,sonrasinda siliniz.

Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Entrance Exam
    And Click on the element in the left Nav
      | entranceExam       |
      | setUpTwo           |
      | entranceExamButton |

    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | serkanExam1 |

    And Click on the element in the Form Content

      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in the Dialog
    |saveButton|

    Then Success message should be displayed

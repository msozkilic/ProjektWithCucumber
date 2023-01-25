#Bir önceki Exam Giriş Senaryosunu
#  Aşağıdaki değerler için çalıştırınız.
#
#| ExamName    | AcademicPeriodOption | GradeLevelOption | documentTypeOption |
#| Math exam   | option2              | option4          | option4            |
#| IT exam     | option1              | option1          | option1            |
#| Oracle exam | option2              | option2          | option2            |
#| Math exam   | option1              | option3          | option3            |

Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario Outline:Create and delete a Exam
    And Click on the element in the left Nav
      | entranceExam       |
      | setUpTwo           |
      | entranceExamButton |

    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | <ExamName>|

    And Click on the element in the Form Content
      | academicPeriod  |
      | <AcademicPeriodOption> |
      | gradeLevel      |
      | <GradeLevelOption>  |

    And Click on the element in the Dialog
      |saveButton|

    Then Success message should be displayed

    And Click on the element in the left Nav
      | entranceExam       |
      | setUpTwo           |
      | entranceExamButton |

    And User delete item from Dilaog
      |<ExamName >|

    Then Success message should be displayed
    Examples:
      | ExamName    | AcademicPeriodOption | GradeLevelOption |
      | Math exam   | academicPeriod1      | gradeLevel2      |
      | IT exam     | academicPeriod1      | gradeLevel2      |
      | Oracle exam | academicPeriod1      | gradeLevel2      |
      | Math exam   |academicPeriod1       | gradeLevel2      |


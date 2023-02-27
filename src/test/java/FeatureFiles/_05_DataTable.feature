Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login succesfully

  Scenario: Create Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | countries  |
    And Click on the element in the Dialog
      | addButton |
    And User sending the keys in Dialog content
      | nameInput | serkanCountry1 |
      | codeInput | 123123         |

    And Click on the element in the Dialog
      | saveButton |
    And Success message should be displayed
    And User delete item from Dilaog
      | serkanCountry |
    And Success message should be displayed

  Scenario: Create a Nationality
    And Click on the element in the left Nav
      | setupOne    |
      | parameters  |
      | countries   |
      | nationality |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | serkanCountry22 |

    And Click on the element in the Dialog
      | saveButton |

    And User should login succesfully

    And User delete item from Dilaog
      | serkanCountry22 |

    And Success message should be displayed


  Scenario: Create a Fee,delete Fee

    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |
    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | serkanFee22 |
      | codeInput       | F22         |
      | integrationCode | 2322        |
      | priorityCode    | 5522        |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dilaog
      | serkanFee22 |

    And Success message should be displayed
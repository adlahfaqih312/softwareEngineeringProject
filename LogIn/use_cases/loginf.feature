Feature: LogIn

  Background: 
    Given lunch frame
    And user enter <username> and <password>
      | username      | password | message                 |
      | AdlahFaqih312 |    12345 | successfully            |
      
    When I enter login <button>

  Scenario: username is correct and password is correct
    And <username> is correct and <password> is correct
    Then I should have successfully <message>

  Scenario: username is not correct and password is correct
    And <username> is not correct and <password> is correct
    Then I should have uncorrect username <message>

  Scenario: username is correct and password is not correct
    And <username> is correct and <password> is not correct
    Then I should have uncorrect password <message>

  Scenario: username is not correct and password is not correct
    And <username> is not correct and <password> is not correct
    Then I should have signup <message>

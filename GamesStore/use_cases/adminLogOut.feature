Feature: Admin logout

  Scenario: Admin logs out
    Given Admin already log in
    When she "Adlah" select to log out
    Then log out done
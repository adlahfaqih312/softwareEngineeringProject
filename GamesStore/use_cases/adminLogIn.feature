Feature: Admin login

  Scenario Outline: Admin log in with valid informations 
    Given Admin selected to log in
    When Admin entered the valid <username> and the valid <password>
    Then log in must be successful

    Examples: 
      | username | password |
      | "Adlah"  | "123456"  |
      | "Masa"   | "123456"  |
      | "Arwa"   | "123456"  |

  Scenario Outline: Admin has the wrong password 
    Given Admin selected to log in
    When Admin entered the valid <username> and the unvalid <password>
    Then log in must be field

    Examples: 
      | username | password |
      | "Adlah"  | "00000"  |
      | "Masa"   | "11111"  |
      | "Arwa"   | "22222"  |
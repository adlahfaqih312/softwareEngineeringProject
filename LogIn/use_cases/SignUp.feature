Feature: SignUp

      
  Scenario: sigup
    Given console is lunch succsessfully
    When I enter "username" and 12345 password and 18 age
    Then I should have message and go to login 
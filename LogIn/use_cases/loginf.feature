Feature: LogIn

Scenario: username and password written successfully
Given I should written <username> as username and <password> as password correct
When I enter login button
Then I should have successfully <message>



Scenario: correct username ,wrong password
Given I should written <username> as username coorect and <password> as password wrong
When I enter login button
Then I should have uncorrect password/username <message>


Scenario: correct password ,wrong username
Given I should written <password> as username coorect and <username> as password wrong
When I enter login button
Then I should have uncorrect password/username message


Scenario: not registered
Given I tried to log in without <username> as username registered 
When I enter login button
Then I should have signup <message>


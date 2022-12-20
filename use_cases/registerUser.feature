Feature: Registration 


 Scenario Outline: Admin log in with valid credentials 
    Given Admin selected to Create "user"
    When Admin entered the valid "Name" and the valid "ID" and the valid "Email" 
    Then Create user must be successful
	
	Examples: 
		|Name   | Tamara Sufian| 
		|ID     | 312103       | 
		|Email  | tas@gmail.com| 

		
Scenario: exist account 
Given Admin is logged in
When Admin selected to create new "user"
And user is already exist
Then Admin can not add this user

Scenario: Create a user account when the Admin is not logged in 
Given Admin is not logged in
When Admin selected to create new user
Then Admin can not create user
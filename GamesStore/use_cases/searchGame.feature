Feature: search game 


Scenario: search by a name 
	Given i choose to search by name 
	When i entered a valid substring "GTA" 
	Then the game for this name will shown 
	
	
Scenario: search by a type 
	Given i choose to search by type 
	When i entered a valid substring "Action & Life" 
	Then  the game for this type will shown 
	
	
Scenario: search by a price 
	Given i choose to search by price 
	When i entered a valid substring "99$" 
	Then  the game for this price will shown 
	
Scenario: search by name when the user is logged in 
	Given Admin already log in 
	And i choose to search by name 
	When i entered a valid substring "GTA" 
	Then  the game for this name will shown  
	
Scenario: search by type when the user is logged in 
	Given Admin already log in 
	And i choose to search by type 
	When i entered a valid substring "Action & Life" 
	Then  the game for this type will shown 
	
Scenario: search by price when the user is logged in 
	Given Admin already log in 
	And i choose to search by price 
	When i entered a valid substring "99$" 
	Then the game for this price will shown  

Scenario: search by a name when No games match the criteria 
	Given i choose to search by name 
	When i entered  invalid substring "anything" 
	Then no information will apear 
	
	
Scenario: search by a type when No games match the criteria 
	Given i choose to search by type 
	When i entered  invalid substring "anything" 
	Then no information will apear 
	
	
Scenario: search by a price when No games match the criteria 
	Given i choose to search by price 
	When i entered  invalid substring "anything" 
	Then no information will apear 


	
Scenario: search by a type when there is more than one game 
	Given i choose to search by type 
	When i entered a valid substring "Action & Life" 
	Then  all game for this type will shown 

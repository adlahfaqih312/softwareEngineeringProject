Feature: Borrow Game 
	Description: A user can borrow maximum 3 Games
	Actors: user
Background: The Store has a set of Games 
	Given that the admin is logged in 
	When these Games are contained in the Store 
		| GTA | Action & Life | 99$ |
		| Blur | Cars | 89$ |
		| Call Of Duty | Horror & Action | 125$ |
	Then the admin logs out 
 
	
Scenario: 
	Given that the user with id "119" is regestered   
	When the user borrow  Game with Name "GTA" 
	Then the user borrow the Game with Name "GTA"
	 
	
Scenario: 
	Given that the user with id "119" is regestered 
	When the user borrow  Game with Name "GTA" the user have borrowd numofbrrowd "3"
	Then error message "you can't borrow more than five Games" is given 
	

Scenario: 
Given a Game with Type "Action & Life" is in the Store
And a Game with Type "Cars" is in the Store 
And that the user with id "119" is regestered
When the user borrows the Game with Type "Cars"
And 21 dayes have passed
And the user borrows the Game with Type "Action & Life" 
Then the Game with Type "Action & Life" is not borrowed by the user 
And the error massege "you can't borrow any new Game because you have an overdue Games" is given




Scenario: 
Given that the user with id "119" is regestered  
And a Game with Type "Action & Life" is in the Store
And a Game with Type "Cars" is in the Store 

When the user borrows the Game with Type "Cars"
And 21 days have passed
Then the user has to pay a fine of 30 NIS
When the user returns the Game with Type "Cars"
Then the user has to pay a fine of 30 NIS

When the user borrows the Game with Type "Action & Life"
Then the Game with Type "Action & Life" is not borrowed by the user
And the error massage "Can't borrow Game, you have fines" is given
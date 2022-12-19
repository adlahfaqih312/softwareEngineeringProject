Feature: Add Game
  
  Adds a game to the Store so that it can be searched. Only the 
    administrator can do this. Thus, the administrator has to be logged in. 

  Scenario: Add a game when the Admin is logged in and enter a valid password
    Given Admin loged in
    When Admin "Adlah" select to add new game
    And Admin must enter the "name of the game","type of the game","price of the game"
    And valid password "00312"
    Then game was added to the Store

  Scenario: Add a game when the Admin is logged in and enter a unvalid password
    Given Admin loged in successfull
    When Admin "Adlah" select to add game
    And Admin must enter the info "name of the game","type of the game","price of the game"
    And unvalid password "001234"
    Then The game has not been added

  Scenario: Add a game when the Admin is not logged in 
    Given Admin not loged in
    When Admin is select to add game
    Then Admin could not add game
    
    
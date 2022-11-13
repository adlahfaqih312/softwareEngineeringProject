package acceptance_package;

import static org.junit.Assert.assertTrue;

import GamesPackage.AdminOfStore;
import GamesPackage.MyGame;
import GamesPackage.Store;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addGameSteps {
	AdminOfStore admin = new AdminOfStore() ;
	MyGame game = new MyGame();
	Store store;
	boolean login;
	
	public addGameSteps(Store s){
		super();
		store=s;
	}
	
	@Given("Admin loged in")
	public void admin_loged_in() {
	    System.out.println("Welcome To Our Store");
	}

	@When("Admin {string} select to add new game")
	public void admin_select_to_add_new_game(String username) {
		login=store.checkLogin(username);
	}

	@When("Admin must enter the {string},{string},{string}")
	public void admin_must_enter_the(String name, String type, String price) {
	    game.setGameName(name);
	    game.setGameType(type);
	    game.setGamePrice(price);
	}

	@Then("game was added to the Store")
	public void game_was_added_to_the_store() {
		/////////
		assertTrue(login==false);
	}

	

	@Then("The game has not been added")
	public void the_game_has_not_been_added() {
		//////////////
		assertTrue(!login==true);
	}

	@Given("Admin not loged in")
	public void admin_not_loged_in() {
	    System.out.println("admin not logged in");
	}

	@When("Admin with select to add game")
	public void admin_is_select_to_add_game() {
		login = store.checkLogin(admin.getUsername());
	}

	@Then("Admin could not add a game")
	public void admin_could_not_add_a_game() {
		/////////////////
		assertTrue(!login==true);
		}
	
	
	
	
	
	@Given("Admin loged in successfull")
	public void adminLogedInSuccessfull() {
		System.out.println("Welcome to our store");
	}
	@When("Admin {string} select to add game")
	public void adminSelectToAddGame(String username) {
		login=store.checkLogin(username);
	}
	@When("Admin must enter the info {string},{string},{string}")
	public void adminMustEnterTheInfo(String name, String type, String price) {
			game.setGameName(name);
		    game.setGameType(type);
		    game.setGamePrice(price);
	}
	@When("unvalid password {string}")
	public void unvalidPassword(String password) {
		login = store.checkLogin(admin.getPasword());
		
	}
	
	@When("valid password {string}")
	public void valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		login = store.checkLogin(admin.getPasword());
	}
	
	@When("Admin is select to add game")
	public void adminIsSelectToAddGame() {
		login = store.checkLogin(admin.getUsername());
	}
	@Then("Admin could not add game")
	public void adminCouldNotAddGame() {
		///////////////////
		assertTrue(!login==true);
	}
	
	

}

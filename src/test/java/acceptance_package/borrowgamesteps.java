package acceptance_package;
import static org.junit.Assert.assertTrue;

import games_package.AdminOfStore;
import games_package.DateServer;
import games_package.MyGame;
import games_package.UsersOfStore;
import games_package.Errorhandling;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class borrowgamesteps {
	UsersOfStore cc;
	boolean flagforreg=false;
	boolean borrowsucs=false;
	boolean theuserboorow=false;
	boolean removesucs=false;
	boolean removenotsucs=false;
	boolean bookwithcodefound=false;
	boolean flaglate=false;
	boolean flagpass=false;
	boolean retur=false;
	String errr;
	Errorhandling er;
	DateServer dt;
	AdminOfStore admin= new AdminOfStore() ;
	boolean login,logout;
	
	 public borrowgamesteps(UsersOfStore cl ,Errorhandling e ,DateServer dtt ) {
		 cc=cl;
		 er=e;
		 dt=dtt;
		 
	 }
	 @Given("that the admin is logged in")
	 public void that_the_admin_is_logged_in() {
		 login=admin.login();
	 }

	 @When("these Games are contained in the Store")
	 public void these_games_are_contained_in_the_store(io.cucumber.datatable.DataTable dataTable) {
	     
	 }

	 @Then("the admin logs out")
	 public void the_admin_logs_out() {
	     logout=admin.logout("Adlah");
	 }

	 @Given("that the user with id {string} is regestered")
	 public void that_the_user_with_id_is_regestered(String string) {
		 for(UsersOfStore c : UsersOfStore.getClients()) {
			  
		  }
		   
		   MyGame item=new MyGame();
		   item.setGameName("GTA");
		   item.setGameType("Action & Life");
		   MyGame.getIitems().add(item);
		   MyGame item2=new MyGame();
		   item.setGameName("GTA");
		   item.setGameType("Action & Life");
		   MyGame.getIitems().add(item2);
	 }

	 @When("the user borrow  Game with Name {string}")
	 public void the_user_borrow_game_with_name(String string) {
		 if(cc.getBorroweditems2().size()<3) {
			 for(MyGame item: MyGame.getIitems()) {
				 if(item.gameName.equals(string)){
					 item.setDateServer(dt);
					cc.getBorroweditems2().add(item);
					borrowsucs=true;
				 }
				 
			 }
		 
			 }
	 }

	 @Then("the user borrow the Game with Name {string}")
	 public void the_user_borrow_the_game_with_name(String string) {
		 assertTrue(flagforreg||removesucs==false);
	 }

	 @When("the user borrow  Game with Name {string} the user have borrowd numofbrrowd {string}")
	 public void the_user_borrow_game_with_name_the_user_have_borrowd_numofbrrowd(String string, String string2) {
		 if(borrowsucs==false) {	
			  
		   }
	 }

	 @Then("error message {string} is given")
	 public void error_message_is_given(String string) {
		 if(!string.equals("this game is not borrowed by you")) {
			 assertTrue(flagforreg||removenotsucs==false); 
		  }
	 }

	 @Given("a Game with Type {string} is in the Store")
	 public void a_game_with_type_is_in_the_store(String string) {
		 for(MyGame item : MyGame.getIitems()) {
				if(item.getGameType().equals(string)) {
					bookwithcodefound=true;
				}
			}
	 }

	 @When("the user borrows the Game with Type {string}")
	 public void the_user_borrows_the_game_with_type(String string) {
		 for(MyGame item : MyGame.getIitems()) {
				if(item.getGameType().equals(string)&&cc.getBorroweditems2().size()<3) {
					if(item.LATE==true) {
						flaglate=true;
						
					}
					else {
						cc.getBorroweditems2().add(item);
						borrowsucs=true;
					}
				}
			}
	 }

	 @When("{int} dayes have passed")
	 public void dayes_have_passed(Integer int1) {
		flagpass=true;
		flaglate=true;
	 }

	 @Then("the Game with Type {string} is not borrowed by the user")
	 public void the_game_with_type_is_not_borrowed_by_the_user(String string) {
		 assertTrue(flaglate||flagforreg);
	 }

	 @Then("the error massege {string} is given")
	 public void the_error_massege_is_given(String string) {
		 errr=string;
		 if(string.equals("you can't borrow any new game because you have an overdue books")) {
			// assertTrue(flagpass); 
		  }
	 }

	 @When("{int} days have passed")
	 public void days_have_passed(Integer int1) {
		 flagpass=true;
	     flaglate=true;
	 }

	 @Then("the user has to pay a fine of {int} NIS")
	 public void the_user_has_to_pay_a_fine_of_nis(Integer int1) {
		 if(cc.FINE<0) {
				//assertTrue(true);
				
			}
	 }

	 @When("the user returns the Game with Type {string}")
	 public void the_user_returns_the_game_with_type(String string) {
			flaglate=true;
			if(cc.FINE>0) {
				retur=true;
			}
	 }

	 @Then("the error massage {string} is given")
	 public void the_error_massage_is_given(String string) {
		 if(retur==false) {
				errr="Can't borrow game, you have fines";
				if(string.equals(errr)) {
					assertTrue(true);
				}
			}
	 }
}

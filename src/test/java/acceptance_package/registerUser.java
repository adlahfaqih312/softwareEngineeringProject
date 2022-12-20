package acceptance_package;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertTrue;

import games_package.AdminOfStore;
import games_package.MyGame;
import games_package.Store;
import games_package.UsersOfStore;

public class registerUser {
	UsersOfStore user = new UsersOfStore();
	AdminOfStore admin=new AdminOfStore();
	MyGame game= new MyGame();
	Store store ;
	
	boolean login,create;
	
	public registerUser(Store s) {
		super();
		store=s;
	}
	
	
	@Given("Admin selected to Create {string}")
	public void admin_selected_to_create(String username) {
		login = store.checkLogin(username);
	}

	@When("Admin entered the valid {string} and the valid {string} and the valid {string}")
	public void admin_entered_the_valid_and_the_valid_and_the_valid(String name, String id, String email) {
	    user.setName(name);
	    user.setID(id);
	    user.setEmail(email);
	    create = user.login();
	    
	}

	@Then("Create user must be successful")
	public void create_user_must_be_successful() {
		System.out.println("Succsessfull");
	    equals(create);
	}

	@Given("Admin is logged in")
	public void admin_is_logged_in() {
	    System.out.println("Welcome");
	}
	

	@When("Admin selected to create new {string}")
	public void admin_selected_to_create_new(String username) {
		create = store.checkLogin(username);
	}

	

	@When("user is already exist")
	public void user_is_already_exist() {
		if (Store.FOUNDUSER == 1) {
			
		}
	}

	@Then("Admin can not add this user")
	public void admin_can_not_add_this_user() {
		System.out.println("you arealready register");
		equals(!create);
	}

	@Given("Admin is not logged in")
	public void admin_is_not_logged_in() {
	    System.out.println("Our Store");
	}

	@When("Admin selected to create new user")
	public void admin_selected_to_create_new_user() {
		create = store.checkLogin(admin.getUsername());
	}

	@Then("Admin can not create user")
	public void admin_can_not_create_user() {
		System.out.print("Admin Should log in");
		equals(!create);
	}

}

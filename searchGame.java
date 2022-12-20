package acceptance_package;
import static org.junit.Assert.assertSame;

import static org.junit.Assert.*;
import java.util.ArrayList;

import games_package.MyGame;
import games_package.Store;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class searchGame {
	public Store store;
	public static ArrayList<MyGame> item = new ArrayList<MyGame>();
	String n;
	String out;
	
	public searchGame(Store s) {
		super();
		this.store=s;
	}
	
	@Given("i choose to search by name")
	public void i_choose_to_search_by_name() {
	    n="name";
	}

	@When("i entered a valid substring {string}")
	public void i_entered_a_valid_substring(String string) {
		out = store.search(n, string);
	}

	@Then("the game for this name will shown")
	public void the_game_for_this_name_will_shown() {
		assertSame("GTA",out);
	}

	@Given("i choose to search by type")
	public void i_choose_to_search_by_type() {
		n = "Type";
	}

	@Then("the game for this type will shown")
	public void the_game_for_this_type_will_shown() {
		assertSame("Action & Life",out);
	}

	@Given("i choose to search by price")
	public void i_choose_to_search_by_price() {
	    n = "Price";
	}

	@Then("the game for this price will shown")
	public void the_game_for_this_price_will_shown() {
		assertSame("99$",out);
	}

	@When("i entered  invalid substring {string}")
	public void i_entered_invalid_substring(String string) {
		out = store.search(n, string);
	}

	@Then("no information will apear")
	public void no_information_will_apear() {
		assertSame("",out);
	}

	@Then("all game for this name will shown")
	public void all_game_for_this_name_will_shown() {
		assertSame("GTA",out);
	}

	@Then("all game for this type will shown")
	public void all_game_for_this_type_will_shown() {
		assertSame("Action & Life",out);
	}



}

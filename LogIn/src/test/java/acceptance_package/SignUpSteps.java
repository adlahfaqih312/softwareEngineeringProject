package acceptance_package;

import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myLogIn.Log_In;
import myLogIn.Search;

public class SignUpSteps {
	Scanner cout=new Scanner(System.in);
	String username;
	int pass,age;
	Log_In l;
	Search search;
	
	@Given("console is lunch succsessfully")
	public void console_is_lunch_succsessfully() {
	    System.out.println("Welcome To Signup Page");
	}

	@When("I enter {string} and {int} password and {int} age")
	public void i_enter_and_password_and_email_and_age(String userName, Integer password, Integer age) {
	    System.out.println("Please Enter The Information ");
	    System.out.print("Enter your Username: ");
	    userName=cout.next();
	    username=userName;
	    System.out.println("");
	    System.out.print("Enter your Age: ");
	    age=cout.nextInt();
	    System.out.println("");
	    System.out.print("Enter your Password: ");
	    password=cout.nextInt();
	    pass=password;
	    System.out.println("");
	    l=new Log_In(username,pass);
	    
	}

	@Then("I should have message and go to login")
	public void i_should_have_message_and_go_to_login() {
		search=new Search();
		l=new Log_In(username,pass);
		search.searchIfThere(username, pass);
	    
	}

}

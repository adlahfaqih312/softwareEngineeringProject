package acceptance_package;
import java.awt.event.ActionEvent;
import io.cucumber.datatable.DataTable;
import java.awt.event.ActionListener;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myLogIn.Log_In;
import myLogIn.Search;

	public class loginSteps {
		Log_In l;
		Search search;
		String user;
		int pass;
		Scanner cout=new Scanner(System.in);
		@Given("console is lunch")
		public void consoleIsLunch() {
		    System.out.println("Welcome To Login Page");
		}
		@When("I enter {string} and {int}")
		public void iEnterAnd(String username1, int password1) {
			System.out.print("Enter your username:  ");
			username1=cout.next();
			user=username1;
			System.out.print("Enter your password:  ");
			password1=cout.nextInt();
			pass=password1;
			l=new Log_In(user,pass);
		    
		}
		@Then("I should have message")
		public void iShouldHaveMessage() {
			search=new Search();
			search.displayMessage(l, l);
			
		    
		}

	}


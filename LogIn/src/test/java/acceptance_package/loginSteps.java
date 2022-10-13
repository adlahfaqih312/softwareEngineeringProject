package acceptance_package;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myLogIn.Log_In;

	public class loginSteps {
		Log_In l;
		String user;
		String pass;
		boolean flag=false;
		
		@Given("lunch frame")
		public void lunch_frame() {
			l=new Log_In();
			System.out.println("not hello");
			
		}
		@When("I enter login <button>")
		public void iEnterLoginButton() {
			l.login.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					user=l.username.getText();
					pass=l.password.getText();
					
					
				}
			});
		}


		
		@Given("user enter <username> and <password>")
		public void userEnterUsernameAndPassword(io.cucumber.datatable.DataTable dataTable) {
			user=l.username.getText();
			pass=l.password.getText();
			System.out.println("hello");
		}
		@When("<username> is correct and <password> is correct")
		public void usernameIsCorrectAndPasswordIsCorrect() {
			if(user.equals("AdlahFaqih312")) {
		    	if(pass.equals("12345")) {
		    		flag=true;
		    	}
		    	
		    }
		}
		@Then("I should have successfully <message>")
		public void iShouldHaveSuccessfullyMessage() {
			if(flag==true) {
				System.out.println("Succsefull");
			}
			
		}

		@When("<username> is not correct and <password> is correct")
		public void usernameIsNotCorrectAndPasswordIsCorrect() {
			if(user.equals(" ")) {
		    	if(pass.equals("12345")) {
		    		flag=false;
		    	}
		    	
		    }
		}
		@Then("I should have uncorrect username <message>")
		public void iShouldHaveUncorrectUsernameMessage() {
			if(flag==false) {
				System.out.println("UnSuccsefull");
			}
		}
		
		@When("<username> is correct and <password> is not correct")
		public void usernameIsCorrectAndPasswordIsNotCorrect() {
			if(user.equals("MasaThaer")) {
		    	if(pass.equals(" ")) {
		    		flag=false;
		    	}
		    	
		    }
		}
		@Then("I should have uncorrect password <message>")
		public void iShouldHaveUncorrectPasswordMessage() {
			if(flag==false) {
				System.out.println("UnSuccsefull");
			}
		}
		
		@When("<username> is not correct and <password> is not correct")
		public void usernameIsNotCorrectAndPasswordIsNotCorrect() {
			if(user.equals(" ")) {
		    	if(pass.equals(" ")) {
		    		flag=false;
		    	}
		    	
		    }
		}
		@Then("I should have signup <message>")
		public void iShouldHaveSignupMessage() {
			if(flag==false) {
				System.out.println("UnSuccsefull");
			}
		}


	}


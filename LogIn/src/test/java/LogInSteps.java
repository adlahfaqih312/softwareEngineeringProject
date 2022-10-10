import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myLogIn.Log_In;

public class LogInSteps {
	Log_In l=new Log_In();

	@Given("I should written <username> as username and <password> as password correct")
	public void i_should_written_username_as_username_and_password_as_password_correct() {
	    
	}

	@When("I enter login button")
	public void i_enter_login_button() {
	    
	}

	@Then("I should have successfully <message>")
	public void i_should_have_successfully_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I should written <username> as username coorect and <password> as password wrong")
	public void i_should_written_username_as_username_coorect_and_password_as_password_wrong() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should have uncorrect password\\/username <message>")
	public void i_should_have_uncorrect_password_username_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I should written <password> as username coorect and <username> as password wrong")
	public void i_should_written_password_as_username_coorect_and_username_as_password_wrong() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should have uncorrect password/username message")
	public void i_should_have_uncorrect_password_username_message1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I tried to log in without <username> as username registered")
	public void i_tried_to_log_in_without_username_as_username_registered() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should have signup <message>")
	public void i_should_have_signup_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}

package stepDefinition;

import cucumber.api.java.en.*;
import cucumber.api.java.en.When;

public class SeleniumTest {
	
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page()  {
	    // Express the Regexp above with the code you wish you had
		
		System.out.println("User is on the home page");
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void User_Navigate_to_LogIn_Page()  {
	    // Express the Regexp above with the code you wish you had
		System.out.println("User navigates to the login page");
	}

	@When("^User enters UserName and Password$")
	public void User_enters_UserName_and_Password()  {
	    // Express the Regexp above with the code you wish you had
		System.out.println("User enters UserName and Password");
	}

	@Then("^Message displayed Login Successfully$")
	public void Message_displayed_Login_Successfully()  {
	    // Express the Regexp above with the code you wish you had
		System.out.println("Login Message Displayed Successfully");
	}
	

}

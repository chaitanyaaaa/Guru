package StepDefs;
import pageObject.LoginPage;
import pageObject.LoginSuccs;
import Utility.BrowserManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GuruLoginStep 
{
	LoginSuccs lsux;
	@Given("^when user is on login page$")
	public void when_user_is_on_login_page() throws Throwable 
	{
		LoginPage lpage = new LoginPage();
			
	   
	}

	@When("^user enters the valid credentials$")
	public void user_enters_the_valid_credentials() throws Throwable 
	{
		LoginPage lpage = new LoginPage();
		lpage.GuruLogin();
	   
	}

	@Then("^Login is successful$")
	public void login_is_successful() throws Throwable 
	{
		
	  // lsux.loginverify();
		Assert.assertTrue(lsux.loginverify());
	   
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable
	{
		BrowserManager.tear_down();
	
	}

}

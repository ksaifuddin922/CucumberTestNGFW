package Stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {
WebDriver driver;
	@Before
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();

	}

	@Given("User is on HRMLogin page {string}")
	public void user_is_on_hrm_login_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("string");
	    throw new io.cucumber.java.PendingException();
	}
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to login sucessfully and new page open")
	public void user_should_be_able_to_login_sucessfully_and_new_page_open() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to see error message {string}")
	public void user_should_be_able_to_see_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@After
	public void tearDown() {
		driver.quit();
		
	}
}

package StepDefination;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Dirver_Factory_Class.Driverfactory;
import Page_class.Login_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	Login_Page loginpage = new Login_Page(Driverfactory.getdriver());

	@Given("user is at the application login screen")
	public void user_is_at_the_application_login_screen() {
		 WebDriver driver = Driverfactory.getdriver();
		    driver.get("https://dev.klaarhq.com/auth/sign_in");
	}
	
	@When("User click on the Login with klaar")
	public void user_click_on_the_login_with_klaar() {
		loginpage.loginwithklaar();
	}

	@When("user enters {string} in username field")
	public void user_enters_in_username_field(String username) {
		loginpage.username(username);
	}

	@When("user enters {string} in password field")
	public void user_enters_in_password_field(String password) {
		loginpage.password(password);
	}

	@When("Click on the signin button")
	public void click_on_the_signin_button() {
		loginpage.login_button();
	}

	@Then("user should redirect to Profile page {string}")
	public void user_should_redirect_to_profile_page(String string) throws InterruptedException {
	String title = loginpage.Verifyluser();
	boolean ispresent = title.contains(string);
	Assert.assertTrue(ispresent);
}
}

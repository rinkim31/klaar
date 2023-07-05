package StepDefination;

import org.testng.Assert;

import Dirver_Factory_Class.Driverfactory;
import Page_class.Cutomisemodule_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CutomisemoduleStep {
	
	Cutomisemodule_Page cmp = new Cutomisemodule_Page(Driverfactory.getdriver());
	
	@Given("Navigate to the Customize modules page")
	public void navigate_to_the_customize_modules_page() throws InterruptedException {
	    cmp.clickoncustomizemodules();
	}

	@When("Test toggle on\\/off for profile module My Strength")
	public void test_toggle_on_off_for_profile_module_my_strength() {
	    cmp.strengthsmoduleview();
	}



	@When("Test toggle on\\/off for profile module  My Skills")
	public void test_toggle_on_off_for_profile_module_my_skills() {
	    cmp.skillsmoduleview();
	}

	@When("Test toggle on\\/off for profile module Teams module")
	public void test_toggle_on_off_for_profile_module_teams_module() {
	   cmp.teamsmoduleview();
	}

	@When("Test toggle on\\/off for profile module Health module")
	public void test_toggle_on_off_for_profile_module_health_module() {
	  cmp.healthmoduleview();
	}

	@Then("User should be able see the Toggle on\\/off effect on the profile page")
	public void user_should_be_able_see_the_toggle_on_off_effect_on_the_profile_page() throws InterruptedException {
		//cmp.verifyStrengthsprofile();
		//cmp.verifySkillsprofile();
		
	}

}

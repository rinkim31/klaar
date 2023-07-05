package StepDefination;

import org.testng.Assert;

import Dirver_Factory_Class.Driverfactory;
import Page_class.WorkspaceSettingpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WorkspaceSettingsSteps {
	
	WorkspaceSettingpage wsp = new WorkspaceSettingpage(Driverfactory.getdriver());
	
	@Given("Navigate to the Settings module")
	public void navigate_to_the_settings_module() {
		
		wsp.navigatetosettingmodule();
	}

	@Given("Verify you have landed the Workspace settings page {string}")
	public void verify_you_have_landed_the_workspace_settings_page(String pageurl) throws InterruptedException {
		
		String title = wsp.verifyURL();
		boolean ispresent = title.contains(pageurl);
		Assert.assertTrue(ispresent);
	}

	@Given("Verify the workspace settings page {string}")
	public void verify_the_workspace_settings_page(String pagehading) throws InterruptedException {
		String title = wsp.verifytext();
		boolean ispresent = title.contains(pagehading);
		Assert.assertTrue(ispresent);
	}

	@When("Add a new workspace logo and verify")
	public void add_a_new_workspace_logo_and_verify() throws InterruptedException {
		wsp.choosethefile();
	}

	@When("Edit the workspace logo and verify")
	public void edit_the_workspace_logo_and_verify() {
		wsp.fileeditbutton();
	}

	@When("Delete the workspace logo and veify")
	public void delete_the_workspace_logo_and_veify() {
		wsp.filedeletebutton();
	}

	@Then("User should be at workspace logo")
	public void user_should_be_at_workspace_logo() {
		wsp.Verifycurrentpage();
	}

}

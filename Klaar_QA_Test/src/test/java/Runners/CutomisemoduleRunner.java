package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
features = {"src\\test\\resources\\Feature_Application\\Customisemodules.feature"},
		
		//features = {"@target/FailedRun.txt"},
		
		glue = {"StepDefination","Hooks"},
		
		plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/FailedRun.txt"}
		
		
	
		
		
		)
public class CutomisemoduleRunner extends AbstractTestNGCucumberTests{
	
	

}

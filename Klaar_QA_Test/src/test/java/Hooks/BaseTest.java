package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Dirver_Factory_Class.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseTest {
	
	WebDriver driver;
	
	@Before
	public void lunchbrowser() {
		
		Driverfactory df = new Driverfactory();
		
		driver = df.initbrowser();
		
		driver.manage().window().maximize();
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
		String scenarioname = scenario.getName();
		scenarioname.replace(" ", "_");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		byte[] source = ts.getScreenshotAs(OutputType.BYTES);
		
		scenario.attach(source, "image/png", scenarioname);
		}
		
	}
	
	@After(order = 1)
	public void closebrowser() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();
	}

}

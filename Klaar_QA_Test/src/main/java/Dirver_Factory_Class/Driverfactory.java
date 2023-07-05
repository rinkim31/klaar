package Dirver_Factory_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverfactory {
	
	static WebDriver driver;
	
	public  WebDriver initbrowser() {
		
		return driver = new ChromeDriver();
		
	}
	
	public static WebDriver getdriver() {
		
		return driver;
		
	}

}

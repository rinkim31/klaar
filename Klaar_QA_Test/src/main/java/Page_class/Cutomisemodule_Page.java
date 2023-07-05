package Page_class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cutomisemodule_Page {
	
	WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Customize Modules']") private WebElement customizemodules;
	
	@FindBy(xpath = "//div[@data-cy='settings-customize-strengths-module-container']//*[text()=' Strengths ']") private WebElement strengthsmodule;
	
	@FindBy(xpath = "//div[@data-cy='settings-customize-strengths-module-container']//button") private WebElement strengthstoggle;
	
	@FindBy(xpath = "//div[@data-cy='settings-customize-skills-module-container']") private WebElement skillsmodule;
	
	@FindBy(xpath = "//div[@data-cy='settings-customize-skills-module-container']//button")private WebElement skillstoggle;
	
	@FindBy(xpath = "//div[normalize-space()='Teams']") private WebElement teamsmodule;
	
	@FindBy(xpath = "(//div[@data-cy='settings-customize-teams-module-container']//button)[1]")private WebElement teamstoggle;
	
	@FindBy(xpath = "//div[normalize-space()='Health']") private WebElement healthmodule;
	
	@FindBy(xpath = "//div[@data-cy='settings-customize-health-module-container']//button")private WebElement healthtoggle;
	
	@FindBy(xpath = "//i[@class='anticon tw-mr-0 tw-h-5 tw-w-5 tw-text-xl anticon-user ng-star-inserted']//*[name()='svg']") 
	private WebElement profilemodule;
	
 @FindBy(xpath = "//*[@data-cy=\"settings-customize-opportunities-module-container\"]//button")private WebElement Scroll;
 
 @FindBy(xpath = "//*[@data-cy=\"settings-customize-performance-review-module-container\"]//button")private WebElement Scroll1;
	
	JavascriptExecutor js;
	WebDriverWait wait;
	
	public Cutomisemodule_Page(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		js = (JavascriptExecutor)driver;
	}
	
	public void clickoncustomizemodules() throws InterruptedException {
		Thread.sleep(2000);
		customizemodules.click();
	}
	
	public void strengthsmoduleview() {
		wait.until(ExpectedConditions.elementToBeClickable(strengthstoggle));
		strengthstoggle.click();		
	}
	
	public void skillsmoduleview() {
		wait.until(ExpectedConditions.elementToBeClickable(skillstoggle));
		skillstoggle.click();		
	}
	
	public void teamsmoduleview() {

		wait.until(ExpectedConditions.elementToBeClickable(teamstoggle));
		js.executeScript("arguments[0].click();",teamstoggle);
				
	}
	
	public void healthmoduleview() {
		
		wait.until(ExpectedConditions.elementToBeClickable(healthtoggle));
		js.executeScript("arguments[0].click();",healthtoggle);
				
	}
	
	
	/*public void verifyStrengthsprofile() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(profilemodule));
		profilemodule.click();
		
		Thread.sleep(5000);
        WebElement profilestrengths = driver.findElement(By.xpath("//*[@class=\"ng-star-inserted\"]//label[@for='tab2']"));
        if(profilestrengths.equals(strengthsmodule)) {
        	
        	System.out.println("ON");
		
        }
        else
        {
		
        	System.out.println("OFF");
        }
		
				
		
		 	
	}
	public void verifySkillsprofile() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(profilemodule));
		profilemodule.click();
		
		Thread.sleep(5000);
        WebElement profileskills = driver.findElement(By.xpath("//*[@class=\"ng-star-inserted\"]//label[@for='tab1']"));
        if(profileskills.equals(skillsmodule)) {
        	
        	System.out.println("ON");
		
        }
        else
        {
		
        	System.out.println("OFF");
        }
		
				
		
		 	
	}*/

}

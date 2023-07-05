package Page_class;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkspaceSettingpage {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//i[@class='anticon tw-mr-0 tw-h-5 tw-w-5 tw-text-xl anticon-setting ng-star-inserted']//*[name()='svg'])") private WebElement settingtab;
	
	@FindBy(xpath = "//*[text()='Workspace Settings']") private WebElement heddingpage;
	
	@FindBy(xpath = "//span[normalize-space()='Choose File']") private WebElement choosefile;
	
	@FindBy(xpath = "(//button[@data-cy='settings-workspace-logo-save-upload-button'])") private WebElement savebutton;
	
	@FindBy(xpath = "(//button[@class='ant-btn upload-edit tw-min-w-fit ant-btn-link ant-btn-icon-only ng-star-inserted']") private WebElement editbutton;
	
	@FindBy(xpath = "//button[@class='ant-btn upload-delete tw-min-w-fit ant-btn-link ant-btn-icon-only ng-star-inserted']") private WebElement deletebutton;
	
	JavascriptExecutor js;
	WebDriverWait wait;
	
	public WorkspaceSettingpage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		js = (JavascriptExecutor)driver; 
		
	}
	
	public void navigatetosettingmodule() {
	
		settingtab.click();
		
	}
	
	public String verifyURL() throws InterruptedException {
		
		Thread.sleep(4000);
		
		return driver.getCurrentUrl();
	}
	
	public String verifytext() throws InterruptedException {
		Thread.sleep(4000);
		return heddingpage.getText();
		
	}
	
	public void choosethefile() throws InterruptedException {
		
		   js.executeScript("arguments[0].scrollIntoView(true);",choosefile);
		   Thread.sleep(3000);
		   
		  js.executeScript("arguments[0].value='C:\\Users\\rinki\\Desktop\\USer1Git\\Test.jpg'",choosefile);
		//choosefile.sendKeys("C:\\Users\\rinki\\Desktop\\USer1Git\\Test.jpg");
		   Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeClickable(savebutton));
		//savebutton.click();
		js.executeScript("arguments[0].click();", savebutton);
	}
	
	public void fileeditbutton() {
		wait.until(ExpectedConditions.elementToBeClickable(editbutton));
		editbutton.sendKeys("C:\\Users\\rinki\\Desktop\\USer1Git\\Test1.jpg");
		wait.until(ExpectedConditions.elementToBeClickable(savebutton));
		savebutton.click();
	}
	
	public void filedeletebutton() {
		wait.until(ExpectedConditions.elementToBeClickable(deletebutton));
		deletebutton.click();
		
		WebElement deletetext = driver.findElement(By.xpath("//*[@class='ant-spin-container ng-star-inserted']"));
		deletetext.getText();
		driver.findElement(By.xpath("//p[normalize-space()='Delete']")).click();
	}
	
	public void Verifycurrentpage() {
		driver.getPageSource();
	}
	
}

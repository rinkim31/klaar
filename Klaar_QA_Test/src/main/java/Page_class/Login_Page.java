package Page_class;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Log in with klaar']") private WebElement Loginklaar;
	
	@FindBy(id="email-field") private WebElement emailtext;
	 @FindBy(id="password-field") private WebElement pass;
	 @FindBy(id="login-btn") private WebElement Loginbutton;
	 @FindBy(xpath = "//*[@class='ant-page-header-heading-extra extra']//*[@class='user-name']") private WebElement pagetitle;
	 
	 JavascriptExecutor js;
		WebDriverWait wait;
	 
	 public Login_Page( WebDriver driver) {
		 
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
			wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		  
	 }
	 
	 public void loginwithklaar() {
		 wait.until(ExpectedConditions.elementToBeClickable(Loginklaar));
		 Loginklaar.click();
	 }
	 
	 public void username(String username) {
		 
		 emailtext.sendKeys(username);
	 }

	 public void password(String passed) {
		
		 pass.sendKeys(passed);
	 }
	 
	 public void login_button() {
		 wait.until(ExpectedConditions.elementToBeClickable(Loginbutton));
		 Loginbutton.click();
	 }
	public String Verifyluser() throws InterruptedException {

		Thread.sleep(5000);
		return pagetitle.getText();
	}
}

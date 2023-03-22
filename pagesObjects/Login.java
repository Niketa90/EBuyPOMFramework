package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import eBuy.Baseclass;

public class Login extends Baseclass {
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	@FindBy (xpath="//span[@class='v-p-right-xxs line-clamp']")
	WebElement acc;
	
	@FindBy (xpath="//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement SignIn;
	@FindBy (xpath="//input[@type='email']")
	WebElement EMail;
	@FindBy (xpath="//input[@type='password']")
	WebElement Password;
	@FindBy (xpath="//*[contains(@class,'c-button c-button-secondary c-button-lg ')]")
	WebElement SignInButton;
	
	@FindBy (xpath="//a[text()='Return to previous page']")
	WebElement returnTo;
	   
	
	
	
	public Login(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	
	
	public void accLogin() {
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='v-p-right-xxs line-clamp']")));
		 this.acc.click();
		
	}
	public void signIn() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")));
		 this.SignIn.click();
	} 
	public void eMail(String Email) {
		this.EMail.click();
		this.EMail.sendKeys("khare.niketa+9290@gmail.com");
		
	} 
	
	public void password(String Password) {
		this.Password.click();
		this.Password.sendKeys("Niketa@90983");
		
	} 
	public void signInButton() {
		this.SignInButton.click();
		
	} 
	public void returnPage() {
		this.returnTo.click();
		
	} 
}	
	
	
	
	
	
	
	
   
	
   



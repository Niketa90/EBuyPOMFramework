package pagesObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import eBuy.Baseclass;

public class SignUp extends Baseclass {
	//public  WebDriver driver;
	public WebDriverWait wait=new WebDriverWait(driver, 30);
	
	@FindBy (xpath="//h4[text()='United States']")
	WebElement usFlag;
	
	 @FindBy (xpath="//span[text()='Account']")
	  WebElement acc;
	 
	 @FindBy (xpath="//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
	  WebElement createacc;
	 
	 @FindBy (xpath="//input[@name='firstName']")
	  WebElement firstname;
	 @FindBy (xpath="//input[@name='lastName']")
	  WebElement lastname;
	 @FindBy (xpath="//input[@id='email']")
	  WebElement Email;
	 @FindBy (xpath="//input[@id='fld-p1']")
	  WebElement Password;
	 @FindBy (xpath="//input[@id='reenterPassword']")
	  WebElement ConfirmPassword;
	 @FindBy (xpath="//input[@id='phone']")
	  WebElement PhoneNo;
	 @FindBy (xpath="//input[@id='is-recovery-phone']")
	  WebElement CheckBox;
	 @FindBy (xpath="//button[text()='Create an Account']")
	  WebElement CreateAccount;
	 @FindBy (xpath="//a[text()='Return to previous page']")
	  WebElement ReturnPage;
	 @FindBy (xpath="//span[@class='v-p-right-xxs line-clamp']")
	  WebElement acc1;
	 
	 
	
	 
	 
		
	
	
	public SignUp(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}

	
	public void account(WebDriver driver) throws InterruptedException  {
		WebDriverWait wait=new WebDriverWait(driver, 30);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='v-p-right-xxs line-clamp']")));
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", acc);
        
//        try {
//			this.acc.click();
//			driver.switchTo().alert().dismiss();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
      
    	   
       
	}
	
	public void createAccount(WebDriver driver) {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@class='c-button c-button-outline c-button-sm create-account-btn']")));
        
		this.createacc.click();
	}
	public void firstname(String FirstName) {
		
		this.firstname.sendKeys("Rinni");
		  }
    public void lastName(String LastName) {
    	
		this.lastname.click();
		this.lastname.sendKeys("Khare");
		  }
     public void email(String EmailID) {
    	this.Email.click();
    	this.Email.sendKeys("khare.niketa@gmail.com");
		
		  }
     public void password(String Password) {
     	this.Password.click();
     	this.Password.sendKeys("Niketa@90983");
     	
 		
 		  }
     public void confirmPW(String Password) {
      	this.ConfirmPassword.click();
      	this.ConfirmPassword.sendKeys("Niketa@90983");
      	
  		
  		  }
     public void phoneNo(String PhoneNo) {
       	this.PhoneNo.click();
       	this.PhoneNo.sendKeys("9639822471");
       	
   		
   		  }
     public void checkBox() {
        	this.CheckBox.click();
     } 
     public void createacc1() {
     	this.CreateAccount.click();
  } 
     public void returnPage() {
     	this.ReturnPage.click();
  } 
     
     public void acc1() {
    	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='v-p-right-xxs line-clamp']")));
    	 this.acc1.click();
    	 
     }
      	
     
    		
}


     
     
     
 	
 	
     
    
 	
 	
     
     
    
 	 	
 	
		
		
		
		 
	  



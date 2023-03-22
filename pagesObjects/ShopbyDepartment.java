package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import eBuy.Baseclass;

public class ShopbyDepartment extends Baseclass {
	WebDriverWait wait=new WebDriverWait(driver, 20);
	@FindBy (xpath="//button[@aria-label='Menu']")
	WebElement Menu; 
	@FindBy (xpath="//button[text()='TV & Home Theater']")
	WebElement tvNHome;
	@FindBy (xpath="//button[text()='TVs by Size']")
	WebElement TvsBysize;
	@FindBy (xpath="//a[@href='/site/tvs/85-inch-tvs/pcmcat1571250794220.c?id=pcmcat1571250794220']")
	WebElement sizeLarge;
	@FindBy (xpath="(//button[text()='Add to Cart'])[1]")
	WebElement addtoCart;
	@FindBy (xpath="//a[text()='Go to Cart']")
	WebElement gotoCart;
	@FindBy (xpath="//div[@class='c-modal-grid col-xs-10']//button[@aria-label='Close']")
	WebElement close;
	@FindBy (xpath="//button[text()='Checkout']")
	WebElement checkOut;
	@FindBy (xpath="//button[text()='Continue as Guest']")
	WebElement contAsGuest;
	@FindBy (xpath="//input[@id='user.emailAddress']")
	WebElement email;
	@FindBy (xpath="//input[@id='user.phone']")
	WebElement  phoneNo;
	@FindBy (xpath="//span[text()='Continue to Payment Information']")
	WebElement  contToPayment;
	@FindBy (xpath="//span[normalize-space()='Getting your order']")
	WebElement  getOrderdetails;
	
	
	
	
	
	
	
	
	public ShopbyDepartment (WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	
	public void shopDeptt() throws Exception {
		this.Menu.click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Shop by Department']")).isDisplayed());
    	tvNHome.click();
    	TvsBysize.click();
    	sizeLarge.click();
    	Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='85-Inch or Larger TVs']")).isDisplayed());
    	Thread.sleep(3000);
    	addtoCart.click();
    	gotoCart.click();
    	//close.click();
    	checkOut.click();
    	contAsGuest.click();
    	
	}
    	public void eMail(String Email, String PhoneNo) {
    		email.click();
    		email.sendKeys("khare.niketa@gmail.com");
        	phoneNo.click();
        	phoneNo.sendKeys("147 078 9108");
    	}
    	
    	public void continuepay() {
    		 contToPayment.click();
    		 Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Getting your order']")).isDisplayed());
    		 System.out.println(getOrderdetails.getText());
    		 System.out.println(driver.getTitle());
    		 Assert.assertEquals(driver.getTitle(), "Checkout – Best Buy");
    	}
}
   	 
   	 
  
   			
    	
    	
    	
    	
    	
    	
      
    	
    	
    	
    	
    	
    	
		
	











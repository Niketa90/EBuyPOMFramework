package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import eBuy.Baseclass;

public class NavigationandTitleCheck extends Baseclass{
	
WebDriverWait wait=new WebDriverWait(driver, 20);
	
	@FindBy (xpath="//a[@title='BestBuy.com']")
	WebElement bestbuy;
	@FindBy (linkText="Top Deals")
    WebElement TopDeals;
	@FindBy (partialLinkText="Deal of the")
    WebElement DealoftheDay;
	@FindBy (linkText="Totaltech Membership")
    WebElement Totaltech ;
	@FindBy (xpath="//button[@aria-label='Menu']")
	WebElement Menu;
	@FindBy (xpath="//span[text()='More']")
	WebElement More;
	@FindBy (linkText="Credit Cards")
	WebElement CreditCards;
	@FindBy (linkText="Gift Cards")
	WebElement GiftCards;
	
	@FindBy (linkText="Gift Ideas")
	WebElement GiftIdeas;
	
	@FindBy (xpath="(//a[text()='Health & Wellness'])[2]")
	WebElement HealthNwellness;
	
	@FindBy (xpath="(//a[text()='Best Buy Outlet'])[2]")
	WebElement BestBuyoutlet;
	
	@FindBy (xpath="//li[@class='liDropdownList']//a[@data-lid='hdr_best_buy_business']")
	WebElement BestBuyBusiness;
	
	
	@FindBy (className="accountMenuCloseText")
	WebElement close;
	
	@FindBy (xpath="//a[text()='Recently Viewed']")
	WebElement recentlyViewed ;
	@FindBy (xpath="//button[@id='recentlyviewed']")
	WebElement message;
	@FindBy (xpath="//span[text()='Order Status']")
	WebElement orderStatus;
	@FindBy (xpath="//h2[text()='Order Status']")
	 WebElement orderMessage;
	 @FindBy (xpath="//a[@data-lid='hdr_saved_lv']")
	 WebElement savedItems;
	 
	
	
	public NavigationandTitleCheck(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	
	public void HomePage(WebDriver driver) {
		System.out.println("Title "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Best Buy | Official Online Store | Shop Now & Save"); 
		Assert.assertTrue(bestbuy.isDisplayed());
		}
	public void topDeals () {
           System.out.println(TopDeals.getText());
		   Assert.assertTrue(TopDeals.isDisplayed());
		   Assert.assertTrue(TopDeals.isEnabled());
	}
	
	public void dealofTheDay () {
        System.out.println(DealoftheDay.getText());
        Assert.assertTrue(DealoftheDay.isDisplayed());
 	   DealoftheDay.click();
 	   Assert.assertEquals(driver.getTitle(), "Deal of the Day: Electronics Deals - Best Buy");
 	   System.out.println(driver.getTitle());
	}
	public void totalTech () {
        System.out.println(Totaltech.getText());
        Assert.assertTrue(Totaltech.isDisplayed());
    	Totaltech.click();
    	Assert.assertEquals(driver.getTitle(), "Best Buy Totaltech™ – Best Buy");
    	System.out.println(driver.getTitle());
	}
	public void menuandMore () {
		Assert.assertTrue(Menu.isDisplayed());
		System.out.println(Menu.getText());
		Assert.assertTrue(More.isDisplayed());
		System.out.println(More.getText());
		More.click();
	}
	public void creditCard () {
		System.out.println(CreditCards.getText());
		Assert.assertTrue(CreditCards.isDisplayed());
		CreditCards.click();
		Assert.assertEquals(driver.getTitle(), "Best Buy Credit Card: Rewards & Financing");
        System.out.println(driver.getTitle());
	}
	public void giftCards () {
	    System.out.println(GiftCards.getText());
		Assert.assertTrue(GiftCards.isDisplayed());
		GiftCards.click();
		Assert.assertEquals(driver.getTitle(), "Gifts Cards and E-Gift Cards - Best Buy");
		System.out.println(driver.getTitle());
		More.click();
	}
	
	public void giftIdeas() {
		GiftIdeas.getText();
		Assert.assertTrue(GiftIdeas.isDisplayed());
		GiftIdeas.click();
		Assert.assertEquals(driver.getTitle(), "Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
		System.out.println(driver.getTitle());
	}
	public void healthAndwellness() {
		More.click();
		Assert.assertTrue(HealthNwellness.isDisplayed());
		HealthNwellness.click();
		Assert.assertEquals(driver.getTitle(), "Health & Wellness Solutions & Technology - Best Buy");
		System.out.println(driver.getTitle());
	}
	public void bestbuyOutlet() {
		More.click();
		Assert.assertTrue(BestBuyoutlet.isDisplayed());
		BestBuyoutlet.click();
		Assert.assertEquals(driver.getTitle(), "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
		System.out.println(driver.getTitle());
	}
	public void bestbuyBusiness() {
		More.click();
		Assert.assertTrue(BestBuyBusiness.isDisplayed());
		BestBuyBusiness.click();
		Assert.assertEquals(driver.getTitle(), "Best Buy for Business - Best Buy");
	    System.out.println(driver.getTitle());
	}
	public void closeButton() {
		More.click();
		Assert.assertTrue(close.isDisplayed());
		close.click();
	}
	
	public void testing() {
		
	    
		
		Assert.assertTrue(recentlyViewed.isDisplayed());
		System.out.println(recentlyViewed.getText());
		recentlyViewed.click();
		System.out.println(driver.getTitle());
		
		Assert.assertTrue(message.isDisplayed());
		System.out.println(message);
	    
	    
	    
	    Assert.assertTrue(orderStatus.isDisplayed());
	    System.out.println(orderStatus.getText());
	    orderStatus.click();
	    System.out.println(driver.getTitle());
	    
	   
	    Assert.assertTrue(orderMessage.isDisplayed());
	    System.out.println(driver.getTitle());
	    
		
		
	   
	    Assert.assertTrue(savedItems.isDisplayed());
	    System.out.println(savedItems.getText());
	    savedItems.click();
	    System.out.println(driver.getTitle());
	    
	   
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   


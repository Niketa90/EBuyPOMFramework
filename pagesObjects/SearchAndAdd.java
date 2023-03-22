package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import eBuy.Baseclass;

public class SearchAndAdd extends Baseclass {
	WebDriverWait wait=new WebDriverWait(driver, 20);
	
	@FindBy (className="search-input")
	WebElement searchbox; 
	@FindBy (partialLinkText="Samsonite - Classic Leather Backpack for 15.6")
	WebElement classicBag;
	@FindBy (xpath="//button[@data-button-state='ADD_TO_CART']")
	WebElement addToCart; 
	@FindBy (xpath="//span[@class='header-search-icon']//*[name()='svg']")
	WebElement searchicon;
	@FindBy (xpath="//span[@class='item-count']")
	WebElement totalitems;
	@FindBy (xpath="//span[text()='Added to cart']")
	WebElement classicAdded;
	@FindBy (xpath="//div[@class='go-to-cart-button']")
	WebElement GoToCartButton;
	@FindBy (xpath="//button[normalize-space()='Checkout']")
	WebElement CheckOut;
	@FindBy (css="div[class='below-the-line-item '] div:nth-child(2)")
	WebElement TotalAmt;
	
	
	
	
	
	
	
	public SearchAndAdd (WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	
	public void searchBox () {
		searchbox.click();
		searchbox.sendKeys("bag");
		searchicon.click();
		 System.out.println(totalitems.getText());
		classicBag.click();
		addToCart.click();
		Assert.assertEquals(classicAdded.getText(), "Added to cart");
		System.out.println("Classic bag added to cart "+ classicAdded.getText());
		GoToCartButton.click();
		System.out.println("Total amount summary "+ TotalAmt.getText());
		CheckOut.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

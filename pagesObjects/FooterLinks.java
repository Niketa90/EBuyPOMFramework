package pagesObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import eBuy.Baseclass;

public class FooterLinks extends Baseclass {
	WebDriverWait wait=new WebDriverWait(driver, 20);
	@FindBy (xpath="//a[text()='Accessibility']")
	WebElement Accesiblity;
	@FindBy (linkText="Terms & Conditions")
	WebElement TermsAndcond; 
	@FindBy (xpath="//a[text()='Privacy']")
	WebElement privacy; 
	@FindBy (xpath="//a[@data-lid='ft_support_visit_our_support_center']")
	WebElement SupportCenter; 
	@FindBy (xpath="//a[@data-lid='ft_partner_best_buy_health']")
	WebElement BestBuyHealthLink; 
	
	public FooterLinks (WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}
	
	
	public void accesiblity() {
	
		Accesiblity.click();
	    Assert.assertEquals(driver.getTitle(), "Accessibility - Best Buy");
	    System.out.println(driver.getTitle());
	}
	
	public void Terms() {
		TermsAndcond.click();
	    Assert.assertEquals(driver.getTitle(), "BestBuy.com Terms and Conditions");
	    System.out.println(driver.getTitle());
	}
 
	public void privacyLink() {
		privacy.click();
		Assert.assertEquals(driver.getTitle(), "Privacy Policy Hub - Best Buy");
		System.out.println(driver.getTitle());
	}
	
	public void supportCenter() {
		SupportCenter.click();
		Assert.assertEquals(driver.getTitle(),"Best Buy Support & Customer Service");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
	}
	public void bestBuyHealth() {
		BestBuyHealthLink.click();
		Assert.assertEquals(driver.getTitle(),"Best Buy Health");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		
		
	}
	
	
}

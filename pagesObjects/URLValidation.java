package pagesObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import eBuy.Baseclass;

public class URLValidation extends Baseclass {
	public  WebDriver driver;
	
	
	
	
	
	
	public URLValidation(WebDriver driver) {
		this.driver=driver;
		  PageFactory.initElements(driver, this);
			// TODO Auto-generated constructor stub
		}

	public void validateURL() {
		String url ="";
		 String homePage= "https://www.bestbuy.com/";
		HttpURLConnection huc = null;
		int respCode = 200;
		driver= new ChromeDriver();
		 driver.get(homePage);
		String E ="Best Buy International: Select your Country - Best Buy";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals(driver.getTitle(), E);
		
		
		// validating broken links if any
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		// Iterating through all links
		
		Iterator<WebElement> it = links.iterator();
		
		while(it.hasNext()) {
			url = it.next().getAttribute("href");
			
			System.out.println(url);
			
			if(url == null || url.isEmpty()) {
				System.out.println("URL is not configured");
				continue;
			}
			
			if(!url.startsWith(homePage)) {
				System.out.println("url belongs to other domain");
				continue;
				
			}
			
			try {
				huc =(HttpURLConnection)(new URL(url).openConnection());
			    huc.setRequestMethod("HEAD");
			    huc.connect();
			    
			    respCode = huc.getResponseCode();
			    
			    if(respCode >= 400) {
			    	System.out.println(url+"is broken link");
			    }
			    else {
			    	System.out.println(url+"is valid link");
			    }
			
			}
			catch (MalformedURLException e) {
				e.printStackTrace();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
		 
	  }


package eBuy;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.eBuy.Utils;

public class Baseclass extends Utils {
	public static WebDriver driver;
	 
	
	  @BeforeMethod
     public void startup() throws Exception {
		  WebDriverManager.chromedriver().setup();
	         driver = new ChromeDriver();
	            driver.get("https://www.bestbuy.com/?intl=nosplash");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	            TakesScreenshot scrShot =((TakesScreenshot)driver);
	            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	            File DestFile=new File("C:\\Users\\Hp\\eclipse-workspace\\eBuy\\screenshot\\screenshot.png");
	            FileUtils.copyFile(SrcFile, DestFile);
	            
	           

}
          
		
	
		@AfterMethod
              public void closeup() {
          //	driver.close();
               }
    
	
	
}



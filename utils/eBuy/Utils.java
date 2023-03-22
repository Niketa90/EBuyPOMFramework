package utils.eBuy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Utils  {
public static WebDriver driver;
	
	public void browserlaunch(String browser) {
		 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
            driver.get("https://www.bestbuy.com/?intl=nosplash");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            
		
	}


}

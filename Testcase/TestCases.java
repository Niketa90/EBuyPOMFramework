package Testcase;

import org.testng.annotations.Test;

import eBuy.Baseclass;
import pagesObjects.FooterLinks;
import pagesObjects.Login;
import pagesObjects.NavigationandTitleCheck;
import pagesObjects.SearchAndAdd;
import pagesObjects.ShopbyDepartment;
import pagesObjects.SignUp;
import pagesObjects.URLValidation;

public class TestCases extends Baseclass{
	
	
    @Test
	public void URLvalidateTC_001() {
	URLValidation obj = new URLValidation(driver);
	obj.validateURL();
	}
   
@Test
    public void signUpTC_002() throws Exception {
    	SignUp obj = new SignUp(driver);
    	Thread.sleep(3000);
    	obj.account(driver);
    	Thread.sleep(4000);
    	obj.createAccount(driver);
    	obj.firstname("Rinni");
    	obj.lastName("Khare");
    	obj.email("khare.niket@gmail.com");
    	obj.password("Niketa@90983");
    	obj.confirmPW("Niketa@90983");
    	obj.phoneNo("9639822471");
    	obj.checkBox();
    	obj.createacc1();
    	obj.returnPage();
    	obj.acc1();
	TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("C:\\Users\\Hp\\eclipse-workspace\\eBuy\\screenshot\\screenshot.png");
        FileUtils.copyFile(SrcFile, DestFile);
    	
    }
    @Test
    public void signInTC_003() throws Exception {
    	Login obj = new Login(driver);
    	obj.accLogin();
    	obj.signIn();
    	obj.eMail("khare.niketa@gmail.com");
    	obj.password("Niketa@90983");
    	obj.signInButton();
    	obj.returnPage();
    }
    @Test
    public void navigationAndtitleCheckInTC_004() throws Exception {
	NavigationandTitleCheck obj = new NavigationandTitleCheck(driver);
	obj.HomePage(driver);
	obj.topDeals();
	obj.dealofTheDay();
	obj.totalTech();
	obj.menuandMore();
	obj.creditCard();
	obj.giftCards();
	obj.giftIdeas();
	obj.healthAndwellness();
	obj.bestbuyOutlet();
	obj.bestbuyBusiness();
	obj.closeButton();
	obj.testing();
}
   @Test
   public void footerLInksTC_005() {
	   FooterLinks obj = new FooterLinks(driver);
	   obj.accesiblity();
	   obj.Terms();
	   obj.privacyLink();
	   obj.supportCenter();
	   obj.bestBuyHealth();
	   
   }
  @Test
   public void SearchAndaddshoppingTC_006() {
	   SearchAndAdd obj = new SearchAndAdd(driver);
	   obj.searchBox();
   }
  @Test
  public void shopByDepartTC_007() throws Exception {
	  ShopbyDepartment obj = new ShopbyDepartment(driver);
	  obj.shopDeptt();
	  obj.eMail("khare.niketa@gmail.com", "147 078 9108");
	  obj.continuepay();
	  
  }

}
	







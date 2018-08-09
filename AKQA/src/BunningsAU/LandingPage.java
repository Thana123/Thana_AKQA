package BunningsAU;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Exception.ExceptionErr;
import Interfaces.SeleniumChrome;


public class LandingPage {
	SeleniumChrome driver = new SeleniumChrome();
	private static Logger Log = Logger.getLogger(LandingPage.class);
	static ExceptionErr exceperr = new ExceptionErr();
	
	public static String landingpage(WebDriver driver,String Url, int x,int y) {
		String productxpath = "//*[@id=\"content-layout_inside-anchor\"]/div[3]/div/div/section/div[3]/div/div[1]/section["+x+"]/article["+y;
		driver.get(Url);
		exceperr.LocationErr();		
		String productNameLP = driver.findElement(By.xpath(productxpath+"]/a/div[2]/div[2]")).getText();
		String productDetails = driver.findElement(By.xpath(productxpath+"]/a")).getAttribute("href");
		driver.get(productDetails);
		Log.info("Product title from landing page is : " + productNameLP);
		return productNameLP;		
		
	}

}
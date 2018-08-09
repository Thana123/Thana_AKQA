package BunningsAU;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Exception.ExceptionErr;


public class ProductDetails {
	private static Logger Log = Logger.getLogger(ProductDetails.class);
	static ExceptionErr exceperr = new ExceptionErr();
	public static String Productpage(WebDriver driver ) {
		exceperr.LocationErr();
		String productNamePP = driver.findElement(By.xpath("//*[@id=\"content-layout_inside-anchor\"]/section/div/div[1]/div[1]/div[2]/div/h1")).getText();
		Log.info("Product title from Product detail page is" +productNamePP);			
		driver.findElement(By.xpath("//*[@id=\"content-layout_inside-anchor\"]/section/div/div[2]/div[3]/div[2]/button/span")).click();
		return productNamePP;

	}

}
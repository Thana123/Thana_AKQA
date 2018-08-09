package BunningsAU;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Exception.ExceptionErr;

public class WishList {
	private static Logger Log = Logger.getLogger(WishList.class);
	static ExceptionErr exceperr = new ExceptionErr();
	public static String CheckWishList(WebDriver driver, String AddWishlistURL){
		driver.get(AddWishlistURL);
		exceperr.LocationErr();
		String productNameWL = driver.findElement(By.xpath("//*[@id=\"content-layout_inside-anchor\"]/div[1]/section[2]/table/tbody/tr[1]/td[2]/a[2]/strong")).getText();
		Log.info("Product title from Wishlist is :" + productNameWL);
		return productNameWL;
		
	}
}
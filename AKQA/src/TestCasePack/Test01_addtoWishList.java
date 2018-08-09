package TestCasePack;

import java.util.Random;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import BunningsAU.LandingPage;
import BunningsAU.ProductDetails;
import BunningsAU.WishList;
import Interfaces.PropertiesFile;

public class Test01_addtoWishList {
	private static Logger Log = Logger.getLogger(Test01_addtoWishList.class);
	public static void Test_addtoWishlist( WebDriver driver){
		PropertiesFile prop = new PropertiesFile();
		String url = prop.GeneralProperties("URL");
		
 /* 
  * ######################################################################################################################################
  *  To Open the Bunnings URL && to Randomly visit one product from the URL
  * ######################################################################################################################################		
  */
		String addWishlistURL = prop.GeneralProperties("wishlistURL");

		Random randm = new Random();
		int x = 1 + randm.nextInt(3);
		int y = 1 + randm.nextInt(16);
		
		String productNameLP = LandingPage.landingpage(driver, url, x, y);
		if ((driver.getCurrentUrl()).contains("https://www.bunnings.com.au")){
			Log.info("Step 1 : Visit Search Result page is Passed");
			}else {
			Log.info("Step 1 : Visit Search Result page is Failed");
			}
		
		if (!(productNameLP == null)) {
			Log.info("Step 2 : Randomly visit one product from the Search Result page is Passed");
		} else {
			Log.info("Step 2 : Randomly visit one product from the Search Result page is Failed");
		}
		
 /* 
  * ######################################################################################################################################
  * To redirect to a Product Detail page
  * ######################################################################################################################################		
  */
		String productNamePP = ProductDetails.Productpage(driver);
		if ((productNamePP).contains(productNameLP)) {

			Log.info("Step 3 : redirect to a Product Detail page is Passed");
		} else {
			Log.info("Step 3 : redirect to a Product Detail page is Failed");
		}
 /* 
  * ######################################################################################################################################
  * To check Product is added to the wish list
  * ######################################################################################################################################		
  */
		String productNameWL = WishList.CheckWishList(driver, addWishlistURL);
		if (productNameWL.contains(productNameLP)) {
			Log.info("Step 4 : Product added to the wish list is Passed");
		} else {
			Log.info("Step 4 : Product added to the wish list is Failed");
		}
	}
}

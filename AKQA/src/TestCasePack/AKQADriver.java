package TestCasePack;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import Interfaces.PropertiesFile;
import Interfaces.SeleniumChrome;

public class AKQADriver {
	private static Logger Log = Logger.getLogger(AKQADriver.class);
	static WebDriver driver;
	public static void main(String[] args) {
		
			Log.info(" ########################## Info Log is Started ########################## ");
			PropertiesFile prop = new PropertiesFile();
			String driverPath = prop.GeneralProperties("DriverPath");
			driver = SeleniumChrome.getdriver(driverPath);
			Test01_addtoWishList.Test_addtoWishlist(driver);
			SeleniumChrome.quitdriver();

	}

}
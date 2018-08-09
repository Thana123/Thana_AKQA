package Interfaces;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumChrome {
	static WebDriver driver;
	public static WebDriver getdriver(String driverPath){
		
			System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
			ChromeOptions maxWindow = new ChromeOptions();
			maxWindow.addArguments("--start-maximized");
			WebDriver driver = new ChromeDriver(maxWindow);			
		    return driver;
	   }
	public static void quitdriver() {
		
			driver.quit();
			driver.close();
		
	   }
}
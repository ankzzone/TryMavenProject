package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driver {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() {
		
		if(driver == null) {
			switch(testDataReader.getProperty("browser")) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver",
						"C:\\\\Users\\\\Hp\\\\Desktop\\\\Tools\\\\geckodriver-v0.32.0-win32\\\\geckodriver.exe");
				driver = new FirefoxDriver();
				break;
				default:
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Desktop\\Tools\\chromedriver_win32\\chromedriver.exe");
					driver = new ChromeDriver();
					break;
				
			}
		}
		
		
		return driver;
	}
	
	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;

		}

	}

}

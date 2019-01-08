package TinderFramework.Tinder;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {
	
	public static WebDriver driver;
	
	public static WebDriver setUpChrome() {
		
		return new ChromeDriver();
		

	}

	public static WebDriver setUpFirefox() {
		FirefoxProfile geoEnabled = new FirefoxProfile();
		geoEnabled.setPreference("geo.enabled", true);
		geoEnabled.setPreference("geo.provider.use_corelocation", true);
		geoEnabled.setPreference("geo.prompt.testing", true);
		geoEnabled.setPreference("geo.prompt.testing.allow", true);
		return new FirefoxDriver(geoEnabled);

	}

	public static WebDriver deleteCookies(WebDriver driver) {
		driver.manage().deleteAllCookies();
		return driver;

	}

	public static WebDriver maximizePage(WebDriver driver) {
		driver.manage().window().maximize();
		return driver;

	}

	public static WebDriver closePage(WebDriver driver) {
		driver.quit();
		return driver;
	}

}

package TinderFramework.Tinder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	public static WebDriver driver;
	
	public static WebDriver setUpChrome() {
		return new ChromeDriver();
		

	}

	public static WebDriver setUpFirefox() {
		return new FirefoxDriver();

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

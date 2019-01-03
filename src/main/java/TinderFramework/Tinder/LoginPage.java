package TinderFramework.Tinder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void LoginButtonActionFB() {
		try {
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='modal-manager']/div/div/div[2]/div/div[3]/div/button/span/span"))
			.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public String openPage() {
		driver.navigate().to("https://tinder.com/");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tinderText = driver.getCurrentUrl();
		return tinderText;

	}
}

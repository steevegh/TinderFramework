package TinderFramework.Tinder;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

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

	public void LoginWithFacebookAccountGetStarted() throws InterruptedException {
		String usernameEmailFB = "Test";
		String passwordEmailFB = "Test";
		Set<String> it = driver.getWindowHandles();
		Iterator<String> iterator = it.iterator();
		Thread.sleep(1000);
		while (iterator.hasNext()) {
			String childWindows = iterator.next();
			if (!iterator.next().equalsIgnoreCase(childWindows))
				;
			driver.switchTo().window(childWindows);
			Thread.sleep(1000);
			

		}
		System.out.println("No page found");

	}
}

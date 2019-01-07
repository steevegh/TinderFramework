package TinderFramework.Tinder;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
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
		try {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='modal-manager']/div/div/div[2]/div/div[3]/div/button/span/span"))
					.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String usernameEmailFB = OpenExcelFile.getCellData(1, 1);
		System.out.println(OpenExcelFile.getCellData(1, 1));
		String passwordEmailFB = OpenExcelFile.getCellData(1,2);
		System.out.println(OpenExcelFile.getCellData(1,2));
		Thread.sleep(2000);
		String parentWindows = driver.getWindowHandle();
		Set<String> it = driver.getWindowHandles();

		for (String childWindows : it) {
			if (!childWindows.equalsIgnoreCase(parentWindows)) {
				driver.switchTo().window(childWindows);
				Thread.sleep(2000);
				driver.findElement(By.id("email")).sendKeys(usernameEmailFB);
				driver.findElement(By.id("pass")).sendKeys(passwordEmailFB);
			}
		}

	}
}

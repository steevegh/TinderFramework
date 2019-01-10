package TinderFramework.Tinder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MatchTinder {
	WebDriver driver;
	WebDriverWait wait;

	public MatchTinder(WebDriver driver) {
		this.driver = driver;
	}

	public void swipeRightTinder() {
		try {
			
			wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
					"/html/body/div[1]/div/span/div/div[1]/div/main/div[1]/div/div/div[1]/div/div[2]/button[4]")));
			while (wait != null) {
				driver.findElement(By.xpath(
						"/html/body/div[1]/div/span/div/div[1]/div/main/div[1]/div/div/div[1]/div/div[2]/button[4]"))
						.click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
						"/html/body/div[1]/div/span/div/div[1]/div/main/div[1]/div/div/div[1]/div/div[2]/button[4]")));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
package TinderFramework.Tinder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MatchTinder {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "/html/body/div[1]/div/span/div/div[1]/div/main/div[1]/div/div/div[1]/div/div[2]/button[4]")
	WebElement likeButtonTinder;

	public MatchTinder(WebDriver driver) {
		this.driver = driver;
	}

	public void swipeRightTinder() {
		try {
			for (int i = 0; i < 5; i++) {
				wait = new WebDriverWait(driver, 15);
				wait.until(ExpectedConditions.elementToBeClickable(likeButtonTinder));
				likeButtonTinder.click();
				System.out.println(i);
			}
			System.out.println("MatchExecutedAutomatically");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
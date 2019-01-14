package TinderFramework.Tinder;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SettingPage {
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath = "/html/body/div[1]/div/span/div/div[1]/div/aside/div/a/span/span")
	WebElement profileTinderButton;
	@FindBy(xpath = "/html/body/div[1]/div/span/div/div[1]/div/aside/nav/div/div/div/div/div/div/div[2]/a/span[2]/div/div/div/span")
	WebElement tinderPlusButton;
	@FindBy(className = "Cf")
	WebElement CurrentLocationButton;
	@FindBy(xpath = "/html/body/div[1]/div/span/div/div[1]/div/main/div[1]/div/div/div[5]/div/div/span[2]/div/div[1]/input")
	WebElement NameCityField;
	@FindBy(xpath = "/html/body/div[1]/div/span/div/div[1]/div/main/div[1]/div/div/div[2]/div[3]/div")
	WebElement cityFieldArrow;

	public SettingPage(WebDriver driver) {
		this.driver = driver;
	}

	public void changeGeolocation() {
		try {
			wait = new WebDriverWait(driver, 15);
			String city = "granada, españa";
			// Click on profile
			wait.until(ExpectedConditions.elementToBeClickable(profileTinderButton));
			profileTinderButton.click();
			// Click on Tinder+
			wait.until(ExpectedConditions.elementToBeClickable(tinderPlusButton));
			tinderPlusButton.click();
			// Click on Current location
			wait.until(ExpectedConditions.elementToBeClickable(CurrentLocationButton));
			CurrentLocationButton.click();
			// Change name city
			wait.until(ExpectedConditions.elementToBeClickable(NameCityField));
			NameCityField.sendKeys(city);
			NameCityField.click();
			// Validate the choice of the new city
			wait.until(ExpectedConditions.elementToBeClickable(cityFieldArrow));
			cityFieldArrow.click();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

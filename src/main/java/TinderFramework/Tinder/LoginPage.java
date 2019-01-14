package TinderFramework.Tinder;

import java.io.File;
import java.io.FileInputStream;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public static XSSFWorkbook xlsfilepath;
	public static XSSFSheet xlsSheetName;
	public static XSSFCell Cell;
	WebDriver driver;


	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	 @FindBy(xpath = "//div[@id='modal-manager']/div/div/div[2]/div/div[3]/div/button/span/span") WebElement facebookButton;
	 @FindBy(xpath = "/html/body/div[1]/div/span/div/div[1]/div/main/div[1]/div/div/div[1]/div/div[2]/button[4]") WebElement likeButtonTinder;
	
	public String openPage() throws InterruptedException {
		// Open TinderPage
		driver.navigate().to("https://tinder.com/");
		try {
			WebDriverWait	wait  = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(facebookButton));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tinderText = driver.getCurrentUrl();
		return tinderText;

	}

	public void LoginWithFacebookAccountGetStarted() throws Exception {
		String usernameEmailFB;
		String passwordEmailFB;
		try {
			facebookButton.click();
			// Read an Excel file
			// Access to the excel file
			FileInputStream excelTinder = new FileInputStream(
					new File("C:\\Users\\ghallabs\\Documents\\TestDataTinder.xlsx"));
			// Open the excel file
			XSSFWorkbook workbook = new XSSFWorkbook(excelTinder);
			// Select the sheetname
			XSSFSheet sheet = workbook.getSheetAt(0);
			// Select the data
			usernameEmailFB = sheet.getRow(1).getCell(0).getStringCellValue();
			passwordEmailFB = sheet.getRow(1).getCell(1).getStringCellValue();
			// register the page that is opened and set the iterator to interact with the
			// FBpage that open for the sign in.
			String parentWindows = driver.getWindowHandle();
			Set<String> it = driver.getWindowHandles();

			for (String childWindows : it) {
				if (!childWindows.equalsIgnoreCase(parentWindows)) {
					driver.switchTo().window(childWindows);
					WebDriverWait	wait  = new WebDriverWait(driver, 15);
					wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
					driver.findElement(By.id("email")).sendKeys(usernameEmailFB);
					driver.findElement(By.id("pass")).sendKeys(passwordEmailFB);
					excelTinder.close();
					driver.findElement(By.id("u_0_0")).click();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String openPageTinderLogged() {
		driver.get("https://tinder.com/");
		try {
			WebDriverWait wait  = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.elementToBeClickable(likeButtonTinder));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tinderText = driver.getCurrentUrl();
		return tinderText;
	}

	/*
	 * public void SettingUpFirstAccessTinder() throws Exception {
	 * 
	 * wait.until(ExpectedConditions .elementToBeClickable(By.xpath(
	 * "/html/body/div[1]/div/span/div/div[2]/div/div/div[3]/button[1]")));
	 * driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/span/div/div[2]/div/div/div[3]/button[1]")).click();
	 * wait.until(ExpectedConditions .elementToBeClickable(By.xpath(
	 * "/html/body/div[1]/div/span/div/div[2]/div/div/div[3]/button[2]")));
	 * driver.findElement(By.xpath(
	 * "/html/body/div[1]/div/span/div/div[2]/div/div/div[3]/button[2]")).click();
	 * wait.until(ExpectedConditions.elementToBeClickable( By.xpath(
	 * "/html/body/div[1]/div/span/div/div[1]/div/main/div[1]/div/div/div[1]/div/div[2]/button[4]"
	 * ))); driver.findElement( By.xpath(
	 * "/html/body/div[1]/div/span/div/div[1]/div/main/div[1]/div/div/div[1]/div/div[2]/button[4]"
	 * )) .click();
	 * } 
	 */

}

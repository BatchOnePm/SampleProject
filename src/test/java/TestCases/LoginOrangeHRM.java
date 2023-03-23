package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Locators.LoginLocatorsOrangeHRM;

public class LoginOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		LoginLocatorsOrangeHRM.username(driver).sendKeys("Admin");
		LoginLocatorsOrangeHRM.password(driver).sendKeys("admin123");
		LoginLocatorsOrangeHRM.loginBtn(driver).click();

	}
}
package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import locators.LoginPageLocators;

public class LoginPageTestCases {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);

		LoginPageLocators.username(driver).sendKeys("Admin");
		LoginPageLocators.password(driver).sendKeys("admin123");
		LoginPageLocators.loginBtn(driver).click();

	}

}

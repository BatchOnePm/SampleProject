package Facebook.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Facebook.locators.FacebookLoginLocators;

public class FacebookLoginTestcases {

	@Test
	public void browserLaunch() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		PageFactory.initElements(driver, FacebookLoginLocators.class);

		FacebookLoginLocators.userName.sendKeys("Oraniumtech@gmail.com");
		FacebookLoginLocators.password.sendKeys("123456789");
		FacebookLoginLocators.loginBtn.click();

	}

}

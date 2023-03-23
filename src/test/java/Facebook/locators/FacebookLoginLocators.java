package Facebook.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLoginLocators {

	@FindBy(id = "email")
	public static WebElement userName;

	@FindBy(id = "pass")
	public static WebElement password;

	@FindBy(name = "login")
	public static WebElement loginBtn;

	/*
	 * public static WebElement userName(WebDriver driver) { return
	 * driver.findElement(By.id("email"));
	 * 
	 * }
	 * 
	 * public static WebElement password(WebDriver driver) { return
	 * driver.findElement(By.id("pass"));
	 * 
	 * }
	 * 
	 * public static WebElement loginBtn(WebDriver driver) { return
	 * driver.findElement(By.name("login"));
	 * 
	 * }
	 */

}

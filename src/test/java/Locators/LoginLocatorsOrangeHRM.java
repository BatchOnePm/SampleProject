package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginLocatorsOrangeHRM {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.name("password"));

	}

	public static WebElement loginBtn(WebDriver driver) {
		return driver.findElement(By.cssSelector("button[type = 'submit']"));
	}

}

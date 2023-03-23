package Facebook.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Samplefacebook {

	public static void main(String[] args) {
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Oraniumtech@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456778");
		driver.findElement(By.name("login")).click();

	}

}

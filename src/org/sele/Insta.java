package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.instagram.com/accounts/login/?hl=en) login page ");
		
//		Thread.sleep(3000);
		
		
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("8685456789");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("4567895123");
		

	}

}

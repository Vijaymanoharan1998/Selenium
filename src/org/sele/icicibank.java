package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icicibank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
		driver.manage().window().maximize();
		
		WebElement txtusername = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		txtusername.sendKeys("vijay@123");
		
		WebElement txtpassword = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtpassword.sendKeys("hello@123");
		
	}

}

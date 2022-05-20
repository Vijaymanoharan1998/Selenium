package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbtask2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		txtusername.sendKeys("vijay");
		WebElement txtpassword = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		txtpassword.sendKeys("hjh@123");
	}

}

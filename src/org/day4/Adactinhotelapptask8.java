package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactinhotelapptask8 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@id='username']"));
		txtusername.sendKeys("8680825976");
		String text = txtusername.getAttribute("value");
		System.out.println(text);
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys("hjh@123");
		String text1 = txtpassword.getAttribute("value");
		System.out.println(text1);
	}

}

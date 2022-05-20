package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("http://www.google.com/");
		
		driver.navigate().to("http://www.facebook.com/");
		
		String ti = driver.getTitle();
		System.out.println(ti);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		driver.manage().window().maximize();
		WebElement txtUserName=driver.findElement(By.id("email"));
		
		txtUserName.sendKeys("vijay");
		
		WebElement txtUserPassword = driver.findElement(By.id("pass"));
		txtUserPassword.sendKeys("vi@123");
		
//		driver.navigate().back();
//		driver.navigate().forward();
//     	driver.navigate().refresh();
		
	}

}

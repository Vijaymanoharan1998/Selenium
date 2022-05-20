package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdealtask12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		WebElement txtsignin= driver.findElement(By.xpath("//div[@class='accountInner']"));
		txtsignin.click();
		
		WebElement clksrch = driver.findElement(By.xpath("//span[@class='accountBtn btn rippleWhite']"));
		clksrch.click();
		
		WebElement txtphno = driver.findElement(By.xpath("//input[@class='col-xs-24']"));
		txtphno.sendKeys("5689875235");
		
		WebElement clkcnt = driver.findElement(By.xpath("//button[@id='checkUser']"));
		clkcnt.click();
		
		
	}

}

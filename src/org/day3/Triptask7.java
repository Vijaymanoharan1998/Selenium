package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Triptask7 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cleartrip.com/trains");
		
		WebElement txtfrom = driver.findElement(By.xpath("//input[@title='From station']"));
		txtfrom.sendKeys("kumbakonam");
		WebElement txtto = driver.findElement(By.xpath("//input[@title='To station']"));
		txtto.sendKeys("tambaram");
		
		WebElement clksrch = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		clksrch.click();
		
	}

}

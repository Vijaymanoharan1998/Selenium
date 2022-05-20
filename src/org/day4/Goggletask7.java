package org.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goggletask7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com/");
		
		WebElement srch = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		srch.sendKeys("greens velmurugan");
		WebElement srch1 = driver.findElement(By.xpath("//input[@class='gNO89b'][1]"));
		srch1.click();
		
		WebElement srch2 = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md'][1]"));
		srch2.click();
	}

}

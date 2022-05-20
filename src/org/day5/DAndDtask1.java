package org.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DAndDtask1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement d = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement d1 = driver.findElement(By.xpath("//ol[@id='bank']"));
		WebElement d2 = driver.findElement(By.xpath("//li[@id='fourth'][1]"));
		WebElement d3 = driver.findElement(By.xpath("//ol[@id='amt7']"));
		WebElement d4 = driver.findElement(By.xpath("//li[@id='credit1']"));
		WebElement d5 = driver.findElement(By.xpath("//ol[@id='loan']"));
		WebElement d6 = driver.findElement(By.xpath("//li[@id='fourth'][2]"));
		WebElement d7 = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(d,d1).perform();
		Actions actions1 = new Actions(driver);
		actions1.dragAndDrop(d2,d3).perform();
		Actions actions2 = new Actions(driver);
		actions2.dragAndDrop(d4,d5).perform();
		Actions actions3 = new Actions(driver);
		actions3.dragAndDrop(d6,d7).perform();
		
		
		WebElement btnclk = driver.findElement(By.xpath("//div[@id='equal'][1]"));
		btnclk.click();
		
		
		
	}

}

package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.facebook.com/");
//		Thread.sleep(2000);
		WebElement clk = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clk.click();
		Thread.sleep(2000);
		WebElement dayid = driver.findElement(By.id("day"));
		
		Select select = new Select(dayid);
		select.selectByIndex(5);
		Thread.sleep(2000);
		
		WebElement monthid = driver.findElement(By.id("month"));
		Select select1 = new Select(monthid);
		select1.selectByVisibleText("Feb");
		
		boolean multiple = select1.isMultiple();
		System.out.println(multiple);
		
		List<WebElement> ele = select1.getOptions();
		for (int i = 0; i < ele.size(); i++) {
			WebElement ele1 =ele.get(i);
			String text = ele1.getText();
			System.out.println(text);
			
			
		}
		Thread.sleep(2000);
		WebElement yearid = driver.findElement(By.id("year"));
		Select select2 = new Select(yearid);
		select2.selectByVisibleText("2015");
		List<WebElement> ele2 = select2.getOptions();
		for (int i = 0; i < ele2.size(); i++) {
			WebElement ele3 = ele2.get(i);
			String text1 = ele3.getText();
			System.out.println(text1);
			
		}
		
		
		
		
		
		
		
		
	}

}

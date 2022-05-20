package org.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https:www.facebook.com/");
		
		WebElement clk = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		clk.click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		List<WebElement> day1 = select.getOptions();
		for (int i = 0; i < day1.size(); i++) {
			if(i%2==1) {
			WebElement day2 = day1.get(i);
			String text = day2.getText();
			System.out.println(text);
			
		}
		
	}
	}
}

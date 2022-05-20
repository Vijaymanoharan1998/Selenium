package org.day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
				+ "\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		WebElement tble = driver.findElement(By.tagName("table"));
		List<WebElement> rows = tble.findElements(By.tagName("tr"));
		for (int i = 0; i < rows.size(); i++) {
			if(i==0) {
			WebElement row = rows.get(i);
			String text = row.getText();
			System.out.println(text);
			}
		}
	}
}




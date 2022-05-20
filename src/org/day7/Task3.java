package org.day7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace"
			+ "\\Selenium\\Driver\\chromedriver.exe" );
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	
	WebElement clk = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	clk.click();
	WebElement clk1 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
	clk1.click();
	
//	Thread.sleep(2000);
	Alert alert =driver.switchTo().alert();
	alert.sendKeys("vijay");
	alert.accept();
}
}

package org.day9;

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
	
	driver.get("https://netbanking.hdfcbank.com/");
	
	List<WebElement> framecount = driver.findElements(By.tagName("frame"));
	int size = framecount.size();
	System.out.println(size);
	
//	driver.switchTo().frame(0);
	
//	WebElement txtUserName = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
//	txtUserName.sendKeys("hdfc");
//	driver.switchTo().frame("login_page");
	
	WebElement frame1 = driver.findElement(By.xpath("//frame[@name='login_page']"));
	driver.switchTo().frame(frame1);

	WebElement txtUserName = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	
	txtUserName.sendKeys("hdfc");
	
	
	
	
	
	
	
	

}
}
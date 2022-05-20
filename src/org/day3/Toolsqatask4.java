package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toolsqatask4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@id='first-name']"));
		txtusername.sendKeys("vijay");
		WebElement txtlastname= driver.findElement(By.xpath("//input[@id='last-name']"));
		txtlastname.sendKeys("manoharan");
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));
		txtemail.sendKeys("vijay12@gmail.com");
		WebElement txtphno = driver.findElement(By.xpath("//input[@type='mobile']"));
		txtphno.sendKeys("5689875235");
		WebElement txtcountry= driver.findElement(By.xpath("//select[@name='country']"));
		txtcountry.sendKeys("india");
		WebElement txtcity= driver.findElement(By.xpath("//input[@id='city']"));
		txtcity.sendKeys("tamilnadu");
		WebElement txtpincode= driver.findElement(By.xpath("//input[@id='code']"));
		txtpincode.sendKeys("612558");
		
	}

}

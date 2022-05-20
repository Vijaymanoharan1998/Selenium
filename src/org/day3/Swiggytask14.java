package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggytask14 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		WebElement clklgin = driver.findElement(By.xpath("//div[@class='_2fX4J']"));
		clklgin.click();
		
		WebElement txtphno = driver.findElement(By.xpath("//input[@name='mobile']"));
		txtphno.sendKeys("5689875235");
		
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@name='name']"));
		txtfirstname.sendKeys("vijay");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@name='email']"));
		txtemail.sendKeys("mgjhv@mail.com");
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtpassword.sendKeys("hjh@123");
		
		WebElement clkbtn = driver.findElement(By.xpath("//div[@class='_25qBi _2-hTu']"));
		clkbtn.click();
		
		
	}

}

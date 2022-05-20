package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googletask11 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		txtfirstname.sendKeys("vijay");
		
		WebElement txtlastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		txtlastname.sendKeys("manoharan");
		
		WebElement txtusername = driver.findElement(By.xpath("//input[@type='email']"));
		txtusername.sendKeys("vijay123");
		
		WebElement txtpassword = driver.findElement(By.xpath("//input[@name='Passwd']"));
		txtpassword.sendKeys("hjh@123");
		
		WebElement txtcnfmpassword = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		txtcnfmpassword.sendKeys("hjh@123");
		
		WebElement clknxt = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clknxt.click();
		
		
	}

}

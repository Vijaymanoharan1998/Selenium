package org.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autotesttask3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
				+ "\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement txtfirstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		txtfirstname.sendKeys("vijay");
		
		WebElement txtlastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		txtlastname.sendKeys("manoharan");
		
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		txtaddress.sendKeys("50,east street");
		
		WebElement txtemail = driver.findElement(By.xpath("//input[@type='email']"));
		txtemail.sendKeys("mgjhv@mail.com");
		
		WebElement txtphno = driver.findElement(By.xpath("//input[@type='tel']"));
		txtphno.sendKeys("5689875235");
		
		WebElement txtbutton = driver.findElement(By.xpath("//input[@type='radio']"));
		txtbutton.click();
		
		
		
	}

}

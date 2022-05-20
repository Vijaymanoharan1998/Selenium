package org.sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TAsk {
	public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium"
			+ "\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://adactinhotelapp.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement txtuser = driver.findElement(By.id("username"));
	WebElement pass = driver.findElement(By.id("password"));
	WebElement login = driver.findElement(By.id("login"));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','vijayram000')",txtuser );
	js.executeScript("arguments[0].setAttribute('value','123456789')", pass);
	js.executeScript("arguments[0].click()",login);
	WebElement srldwn = driver.findElement(By.xpath("//*[text()='About Adactin']"));
	WebElement sclup = driver.findElement(By.id("username_show"));
	js.executeScript("arguments[0].scrollIntoView(true)",srldwn);
	js.executeScript("arguments[0].scrollIntoView(false)",sclup);
	WebElement loc = driver.findElement(By.id("location"));
	Select select = new Select(loc);
	select.selectByVisibleText("Los Angeles");
	WebElement hotl = driver.findElement(By.id("hotels"));
	Select sel1 = new Select(hotl);
	sel1.selectByIndex(2);
	WebElement room = driver.findElement(By.id("room_type"));
	Select sel2 = new Select(room);
	sel2.selectByValue("Standard");
	WebElement room_nos = driver.findElement(By.id("room_nos"));
	Select sel3 = new Select(room_nos);
	sel3.selectByValue("3");
	WebElement datepick_in = driver.findElement(By.id("datepick_in"));
	js.executeScript("arguments[0].setAttribute('value','02/05/2022')",datepick_in);
	WebElement datepick_out = driver.findElement(By.id("datepick_out"));
	js.executeScript("arguments[0].setAttribute('value','03/05/2022')", datepick_out);
	WebElement adult_room = driver.findElement(By.id("adult_room"));
	Select sel4 = new Select(adult_room);
	sel4.selectByValue("2");
	WebElement child_room = driver.findElement(By.id("child_room"));
	Select sel5 = new Select(child_room);
	sel5.selectByValue("1");
	WebElement srch = driver.findElement(By.id("Submit"));
	js.executeScript("arguments[0].click()", srch);
	WebElement clk = driver.findElement(By.id("radiobutton_0"));
	js.executeScript("arguments[0].click()",clk );
	WebElement cont = driver.findElement(By.id("continue"));
	js.executeScript("arguments[0].click()",cont );
	WebElement frstname = driver.findElement(By.id("first_name"));
	js.executeScript("arguments[0].setAttribute('value','vijay')", frstname);
	WebElement lstname = driver.findElement(By.id("last_name"));
	js.executeScript("arguments[0].setAttribute('value','manoharan')", lstname);
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("40,eaststreet,darasuram");
	WebElement cc = driver.findElement(By.id("cc_num"));
	js.executeScript("arguments[0].setAttribute('value','1234567890123456')", cc);
	WebElement cc1 = driver.findElement(By.id("cc_type"));
	Select sel = new Select(cc1);
	sel.selectByValue("AMEX");
	WebElement mnth = driver.findElement(By.id("cc_exp_month"));
	Select sel6 = new Select(mnth);
	sel6.selectByValue("3");
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	Select sel7 = new Select(year);
	sel7.selectByValue("2012");
	WebElement ccv = driver.findElement(By.id("cc_cvv"));
	js.executeScript("arguments[0].setAttribute('value','123')", ccv);
	WebElement bk = driver.findElement(By.id("book_now"));
	js.executeScript("arguments[0].click()", bk);
	WebElement order = driver.findElement(By.id("order_no"));
	String text = order.getAttribute("value");
	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

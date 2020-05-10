package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.class23.webDriver;

public class CssSelectorDemo {

	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";

	public static void main(String[] args) throws InterruptedException {
        
		/*CSS Selector (Cascading Sheet Style)
		 * 
		 * ^ represents start-with function. input[name^='first']
		 * 
		 * $ represents ends-with input[name$='astname']
		 * 
		 * represents contains input[id*='date']
		 */

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);

		driver.findElement(By.cssSelector("input[id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name*='txtPass']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input[id^='btn']")).click();

		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class$='Trigger']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

		// How to copy xpath and Css using developer too.
		// select and Right click on the desired tag, go to copy and select Copy
		// Xpath/Selector.

		// Xpath copied using developer tool.
		// *[@id="txtUsername"]
		// *[@id="divPassword"]/span

		// CSS copied using developer tool.
		// #txtUsername
		// #divPassword > span
		// Not recommanded to use.
		// *[@id="login_form"]/table/tbody/tr[3]/td[2]/div/a

	}

}
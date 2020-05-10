package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCss {
	public static String url = "http://166.62.36.207/humanresources/symfony/web/index.php/dashboard";
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[name^='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name$='Password']")).sendKeys("Hum@nhrm123");
		driver.findElement(By.cssSelector("input[id^='btn']")).click();
		

	}

}

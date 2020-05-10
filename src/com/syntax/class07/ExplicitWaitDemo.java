package com.syntax.class07;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		/*
		 * Explicit wait/WEbdriver wait
		 * Explicit wait--> make webdriver wait for certain amount of time until expected condition are met
		 * if the element is found the remaining time will be ignored.
		 */
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/dynamic-data-loading-demo.html");
		
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@id='save']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[contains(text(),'First Name :')]")));
		
		boolean isDisplayed = driver.findElement(By.xpath("//p[contains(text(),'First Name :')]")).isDisplayed();
		System.out.println("Is First name is displayed ? "+isDisplayed);
		
		
		driver.quit();
		
		
		
		
	}

}

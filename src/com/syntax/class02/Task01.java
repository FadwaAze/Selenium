package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.class23.webDriver;



public class Task01 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 2: Mercury Tours Registration: Open chrome browser Go to
		 * “http://newtours.demoaut.com/” Click on Register Link Fill out all required
		 * info Click Submit User successfully registered (Create 2 scripts using
		 * different locators)
		 * 
		 */
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		//String url="http://newtours.demoaut.com";

		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.name("firstName")).sendKeys("Fadwa");
		driver.findElement(By.name("lastName")).sendKeys("Azeroual");
		driver.findElement(By.name("phone")).sendKeys("02456744");
		driver.findElement(By.name("address1")).sendKeys("1888 Morris Rd.");
		driver.findElement(By.name("address2")).sendKeys("");
		driver.findElement(By.name("city")).sendKeys("High Lands");
		driver.findElement(By.name("state")).sendKeys("TX");
		driver.findElement(By.name("postalCode")).sendKeys("75000");
		driver.findElement(By.id("email")).sendKeys("fadwaAzer@gmail.com");
		driver.findElement(By.name("password")).sendKeys("aloa34545");
		driver.findElement(By.name("confirmPassword")).sendKeys("aloa12345");
		driver.findElement(By.name("register")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}

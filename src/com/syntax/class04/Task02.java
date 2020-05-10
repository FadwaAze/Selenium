package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {

	public static void main(String[] args) {
		// TC 1: HRMS Application Login: 
		//Open chrome browser
		//Go to “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login”
		//Enter valid username and password
		//Click on login button
		//Then verify Syntax Logo is displayed.
		
		
		String url="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.className("button")).click();
		boolean logoIsDisplay=driver.findElement(By.xpath("//div[@id='branding']//a//img")).isDisplayed();
		
		if(logoIsDisplay) {
			System.out.println("Logo is dislayed, test case passed ");
			
		}else {
			System.out.println("Logo is not displayed, test case failed");
		}
		
		

		
		
		
		
		
		
	}

}

package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {

	public static void main(String[] args) {
		/*
		 * TC 2: HRMS Application Negative Login: Open chrome browser Go to
		 * “http://166.62.36.207/humanresources/symfony/web/index.php/auth/login” Enter
		 * valid username Leave password field empty Verify error message with text
		 * “Password cannot be empty” is displayed./
		 */
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("");
		driver.findElement(By.className("button")).click();
		
		WebElement spanMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
		String text=spanMessage.getText();
		
		boolean isDisplayed=spanMessage.isDisplayed();
		
		if(isDisplayed) {
			System.out.println(text+" is displayed");
		}else {
			System.out.println(text+" is not displayed");
		}
		
		driver.quit();

	}

}

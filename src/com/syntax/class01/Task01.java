package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

	public static void main(String[] args) throws InterruptedException {
		// open amazon and get the title
		// 1.get the path
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
		// 2. create the webdriver variable
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.amazon.com";
		Thread.sleep(2000);
		

		if (currentUrl.equalsIgnoreCase(expectedUrl)) {
			String title = driver.getTitle();// Return the current title of web application
			System.out.println(title);
		} else {
			System.out.println("Wrong Url is returned");
		}

		driver.quit();

	}

}

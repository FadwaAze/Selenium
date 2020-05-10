package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

	public static void main(String[] args) {
		/*
		 * TC 1: Amazon link count: 
		 * Open Chrome browser 
		 * Go to “https://www.amazon.com/”
		 * Get all links Get number of links that has text 
		 * Print to console only the links that has text
		 */
		
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			
			ChromeDriver driver = new ChromeDriver();// open chrome

			driver.get("https://www.amazon.com");
			
			List<WebElement> allLinks= driver.findElements(By.tagName("a"));//find elements using tagName(a)
			
			System.out.println(allLinks.size());//print list of WebElement
			
			int count=0;
			
			for(WebElement link:allLinks) {//checking if the check-box is enabled
				String text=link.getText();//get value of value attribute and returns string objects
				if(!text.isEmpty()) {
					System.out.println(text);
					count++;
				}
			}
			System.out.println("Total number of link with text is ::"+ count);
			
			driver.quit();
		
		
		
		
		
	}

}

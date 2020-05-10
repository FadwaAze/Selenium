package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class getAllLinks extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// 
		setUp();
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		int numOfLinks=allLinks.size();
		System.out.println(numOfLinks);
		
		// get all links 
		for (WebElement link : allLinks) {
			String text=link.getText();
			String links=link.getAttribute("href");
			System.out.println(text+"     "+links);
		}
		
		Thread.sleep(3000);
		
		
		
		
		driver.quit();

	}

}

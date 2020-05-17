package com.syntax.class08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class Task01 extends BaseClass{

	public static void main(String[] args) {
		/*
		 * Table headers and rows verification 
		 * Open Chrome browser Go to “http://166.62.36.207/syntaxpractice/” 
		 * Click on “Table” link Click on “ITable Data Search” link Verify second table consist of 5 rows and 4 columns 
		 * Print name of all column headers Print data of all rows Quit Browser
		 */
		setUp();
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://166.62.36.207/syntaxpractice/");
		
		
		
		
	}

}

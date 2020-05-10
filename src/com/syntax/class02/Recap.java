package com.syntax.class02;

import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.class23.webDriver;

public class Recap {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * page related attributes: 
		 * getTitle(); 
		 * getCurrentUrl();
		 * 
		 */
		String fdUrl="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(fdUrl);
		System.out.println("The page URL is ::: "+fdUrl);
		//String currentUrl=driver.getCurrentUrl();//since it has return type i can store it in variabale
		//System.out.println(currentUrl);
		
		String  title=driver.getTitle();
		System.out.println("Title of the page is :: "+title);
		
		Thread.sleep(4000);
		driver.close();
		
		

	}

}

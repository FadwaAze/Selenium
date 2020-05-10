package com.syntax.class02;

import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.class23.webDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// 
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		// will not store the history
		driver.get("https://www.facebook.com");
		driver.manage().window().fullscreen();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		//store the history -->  it will not wait for 
		driver.navigate().to("https://www.google.com");//store the history
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		
		
		//driver.navigate().to("https://ww.amazon.com");
		//driver.navigate().forward();
		//driver.close();
		
//		driver.get () will wait for the page fully load
//		driver.get() will not keep the history of the browser
//		driver.navigate() will keep the history
//		driver.navigate() will not wait for page fully load
		
		

	}

}

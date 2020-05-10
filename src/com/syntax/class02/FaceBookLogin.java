package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.class23.webDriver;

public class FaceBookLogin {

	public static void main(String[] args) throws InterruptedException {
		//
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		/*to locate an element we need to use 8 locators on web page.
		 * ID; Name; LinkText; partialLinkText; className; tagName; XPath; CSS Selector.
		 */
		driver.findElement(By.id("email")).sendKeys("syntaxtest@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("syntax123");
		driver.findElement(By.id("u_0_4")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		
		
		//driver.findElement(By.tagName("input")); --> tagName will not work because input is not unique name for tagName
		
		///driver.findElement(By.id("u_0_4")).click(); --> different characters change every time we refresh/ not stable
	
		// if an ID has only one type of character is 100 stable--> safe to use 
		// but if it's mix it will not be stable--> if it's changeable must be not use
	}

}

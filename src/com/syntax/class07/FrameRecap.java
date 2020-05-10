package com.syntax.class07;

import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class FrameRecap extends BaseClass{

	public static void main(String[] args) {
		// 
		setUp();
		boolean isHomeDisplayed=driver.findElement(By.xpath("//a[text()='Home' and @href='./index.html']")).isDisplayed();
		System.out.println("Is Home Link Displayed? "+isHomeDisplayed);
		
		
		driver.switchTo().frame("FrameOne");
		String welcomeMsge=driver.findElement(By.xpath("//h3=[text()='Welcome to Selenium Easy ']")).getText();
		System.out.println(welcomeMsge);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("FrameTwo");
		boolean buttonEnabled=driver.findElement(By.xpath("//a[class='enroll-btn']")).isEnabled();
		System.out.println("Is enroll btn enabled? "+buttonEnabled);
		
		tearDown();
		

	}

}

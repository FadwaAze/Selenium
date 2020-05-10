package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.syntax.utils.BaseClass;

public class SyntaxPracticeSiteFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		// url=http://166.62.36.207/syntaxpractice/bootstrap-iframe.html
		
		WebDriver driver=BaseClass.setUp();
		//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, true);
		driver.switchTo().frame("FrameOne");
		boolean logoIsDi=driver.findElement(By.id("hide")).isDisplayed();				
		System.out.println("Logo inside frame is displayed "+logoIsDi);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		
		
		driver.switchTo().frame("FrameTwo");
		boolean enrolBtnIsEnebled=driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("enroll button inside frame two is enbled :: "+enrolBtnIsEnebled);
		
		
		BaseClass.tearDown();

	}

}

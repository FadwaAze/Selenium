package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		
		String singUpTitle=driver.getTitle();
		System.out.println("Main page title is ::"+singUpTitle);
		
		driver.findElement(By.linkText("Help")).click();
		/*
		 * Two way to retrieve window handle:
		 * getwindowHandle();
		 * getwindowHandles();--> does not allow any duplicate
		 */ 
		
		Set<String> allWindwhandles=driver.getWindowHandles();// return set of String IDs of all windows currently opened by the current instance.
		System.out.println("Number of windows opened are :: "+allWindwhandles.size());
		
		Iterator<String> it=allWindwhandles.iterator();
		String mainWindowHandle= it.next();//return the ID of Main Window
		System.out.println("Id of Main Window :: "+mainWindowHandle);
		
		String childWindowHandle=it.next();//Return the ID of Child Window
		System.out.println("Id of Child Window :: "+childWindowHandle);
		
		driver.switchTo().window(childWindowHandle);// take focus from main window to child window
		String childWindowTitle=driver.getTitle();//if the focus change it will return the title of the child window
		System.out.println("Child page title is ::"+childWindowTitle);
		
		Thread.sleep(3000);
		driver.quit();

	}

}

package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.CommonMethods;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		String url="https://jqueryui.com/droppable/";
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		//first we need to switch to inside the frame
		driver.switchTo().frame(0);
	
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		
		
		Actions action=new Actions(driver);
		//longer way: drag file and drop it in the source . 
		//action.clickAndHold(drag).moveToElement(drop).release().perform();
		
		
		//short way to drag and drop
		action.dragAndDrop(drag, drop).perform();
	
		
		Thread.sleep(3000);
		driver.quit();

	}

}

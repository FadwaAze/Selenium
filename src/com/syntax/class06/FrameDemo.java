package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Frame --> iframe like image will have <img> , links <a>
		 * buttons/radiobuttons/checkboxes <input>/
		 */
		
		
		/* Scenario 1: two independent frames : switch to frame 1 --> perform action 
		 * --> switch to default content --> switch to frame 2 --> perform action 
		 * --> switch to default content
		 * 
		 * 
		 * Scenario 2: two frames (one inside another, nested frames): 
		 * switch to parent frame  --> perform action --> switch to child frame 
		 * --> perform action --> switch to parent--> switch to default content
		 */

		setUp();//http://uitestpractice.com/Students/Switchto
		String text = driver.findElement(By.xpath("//h3[text()='click on the below link: ']")).getText();
		/*
		 * we can switch frame using 3 different methods
		 * 1- index
		 * 2- by name or ID
		 * 3- by WebElement
		 */
		
		//1- by index
		driver.switchTo().frame(0);
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("vital ");
		driver.switchTo().defaultContent();// switch back to main windows
		Thread.sleep(2000);
		//2-by name or ID
		
		driver.switchTo().frame("iframe_a");
		name.clear();
		name.sendKeys("Fadwa ");
		driver.switchTo().defaultContent();// always switch to frame--> you need to switch to default before you can go to new frame
		
		//3- by WebElement
		WebElement firstFrame=driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
		driver.switchTo().frame(firstFrame);
		name.clear();
		name.sendKeys("Asel");
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(3000);
		tearDown();
		
		
		

	}

}

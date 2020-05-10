package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PracticingWithDropDowns extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		setUp();
		List<WebElement> allDD=driver.findElements(By.tagName("a"));
		//go through each dropDown
		for (WebElement oneDD : allDD) {
			String dd=oneDD.getText();
			System.out.println(dd);
			if(dd.equals("List Box")) {
				oneDD.click();
			}	
		}
		Thread.sleep(3000);
		
		List<WebElement> ListofDD=driver.findElements(By.tagName("li"));
		for (WebElement oneItem : ListofDD) {
			String item=oneItem.getText();
			System.out.println(item);
			if(item.equals("Bootstrap List Box")) {
				oneItem.click();
				break;
			}
			if(item.equals("Morbi leo rius"));
			oneItem.click();
			
		}
		
		
		Thread.sleep(1000);
		driver.quit();

	}

}

package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		//
		setUp();//open chrome browser and lunch Syntax 
		// identify dropdown element
		WebElement weekDD = driver.findElement(By.id("select-demo"));
		Select select = new Select(weekDD);
		/*
		 * Selenium provides three different ways to select a value from a DD
		 */
		// 1 way: select by index
		select.selectByIndex(3);
		List<WebElement> options = select.getOptions();
		System.out.println("Unmber of options in the DD :: " + options.size());

		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
			Thread.sleep(1000);
		}
		//2 way by visible text
		select.deselectByVisibleText("Friday");
		
		Thread.sleep(3000);
		tearDown();

	}

}

package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * 3 way: use value to select dropDown
		 */
		setUp();
		
		WebElement continent = driver.findElement(By.id("continents"));
		Select select = new Select(continent);
		List<WebElement> oprtions = select.getOptions();// it will return list of all options in the DD
		//retrieve all elements from dropdown button using getOptions()
		for (WebElement option : oprtions) {
			String text=option.getText();
			
			System.out.println(text);
			
			if(text.contentEquals("Africa")) {//Condition to select the option
				option.click();
				String ddText=option.getText();
				if(ddText.equals("Africa")) {
					System.out.println("Africa is selected :: "+option.isSelected());
					
				}else {
					System.err.println("Africa is NOT selected");//print in red color
				}
				Thread.sleep(2000);
				
			}
			//select.selectByVisibleText("Asia");// you can select by Visible test
		}
		
		boolean isMultiple=select.isMultiple();
		System.out.println("The continent DD is Multiple :: "+isMultiple);
		
		
		
		
		tearDown();

	}

}

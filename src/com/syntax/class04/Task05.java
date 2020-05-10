package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Task05 extends BaseClass {
	
	public static WebElement web;

	public static void main(String[] args) {
		/*
		 * Radio Buttons Practice Open chrome browser Go to
		 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
		 * Forms” links Click on “Radio Buttons Demo” links Click on any radio button in
		 * “Radio Button Demo” section. Verify correct radio is clicked Click on any
		 * radio button in “Group Radio Buttons Demo” section. Verify correct checkbox
		 * is clicked Quit browser
		 */
		
		setUp();
		
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		web=driver.findElement(By.xpath("//input[@value='Male']"));
		web.click();
		
		if(web.isSelected()) {
			System.out.println("correct button is selected");
		}else {
			System.out.println("Wrong button, please try again");
		}
		
		
	}

	

}

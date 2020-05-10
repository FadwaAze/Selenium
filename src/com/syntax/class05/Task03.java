package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task03 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * C 2: Select and Deselect values 
		 * Open chrome browser 
		 * Go to “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” 
		 * Click on “Input Forms” links 
		 * Click on “Select Dropdown List” links 
		 * Select value from “Select List Demo” section 
		 * Verify value has been selected 
		 * Select 4 options from “Multi Select List Demo” Deselect 1 of the option from the dd 
		 * Quit browser
		 */
		setUp();
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Select Dropdown List')]")).click();
		
		WebElement dropDown=driver.findElement(By.id("select-demo"));
		Select option=new Select(dropDown);
		List<WebElement> ddList=option.getOptions();
		for (WebElement dd : ddList) {
			String text=dd.getText();
			if(text.equals("Monday")) {
				dd.click();
				if(text.equals("Monday")) {
				System.out.println("Monaday is selected "+dd.isSelected());
			}else {
				System.out.println("Monday is not selected");
			}
		}
		}
			Thread.sleep(3000);
			
			WebElement multyList=driver.findElement(By.id("select-demo"));
			Select select1=new Select(multyList);
			
			select1.selectByVisibleText("California");
			
			select1.selectByVisibleText("Florida");
			
			select1.selectByVisibleText("Texas");
			
			select1.selectByVisibleText("New York");
			Thread.sleep(2000);
			boolean isMulySelect=select1.isMultiple();
			if(isMulySelect) {
				select1.deselectByValue("Texas");
			}
			
			driver.quit();
			
		

	}

}

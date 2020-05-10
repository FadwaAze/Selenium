package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task02 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * TC 1: Amazon Department List Verification Open chrome browser Go to
		 * “http://amazon.com/” Verify how many department options available. Print each
		 * department Select Computers Quit browser
		 */

		setUp();
		WebElement amazonDepart=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select=new Select(amazonDepart);
		List<WebElement> option=select.getOptions();
		
		String str=null;
		for (WebElement Depr : option) {
			String text=Depr.getText();
			System.out.println(text);
			
		}
		select.selectByValue("search-alias=computers");
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}

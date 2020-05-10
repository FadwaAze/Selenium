package com.syntax.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class FaceBookTest extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		WebElement firstname=driver.findElement(By.name("firstname"));
		sendText(firstname,ConfigsReader.getProperty("firstname"));
		
		WebElement lastname=driver.findElement(By.name("lastname"));
		sendText(lastname,ConfigsReader.getProperty("lastname"));
		
		WebElement phoneOremail=driver.findElement(By.xpath("//div[text()='Mobile number or email']"));
		sendText(phoneOremail,ConfigsReader.getProperty("phoneOremail"));
		
		WebElement newPassword=driver.findElement(By.xpath("//div[text()='New password']"));
		sendText(newPassword,ConfigsReader.getProperty("newPassword"));
		
		List<WebElement> checkBox= driver.findElements(By.xpath("//input[@name='sex']"));
		String actualValue="1";
		clickRadioOrCheckbox(checkBox,"1" );
		Thread.sleep(3000);
		
		WebElement month=driver.findElement(By.id("month"));
		selectDdValue(month,"Jun");
		
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.id("day"));
		selectDdValue(day,5);
		Thread.sleep(2000);
		
		WebElement year=driver.findElement(By.id("year"));
		selectDdValue(year,"1992");
		Thread.sleep(4000);
		
		tearDown();
		

	}

}

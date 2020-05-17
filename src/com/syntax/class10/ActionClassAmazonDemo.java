package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionClassAmazonDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.setUp();//http://amazon.com/

		WebElement account = driver.findElement(By.xpath("//a[@id='nav-link-accountList'] "));

		Actions action=new Actions(driver);
		action.moveToElement(account).build().perform();
		
		// hover the mouse over menu
		WebElement element=driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']"));
		
		if(element.getText().contains("Start")){
			System.out.println("menu displayed");
		}else {
			System.out.println("menu did NOT displayed");
		}
		
		//how to right click on element 
		action.contextClick(element).perform();
		
		WebElement searchBox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//hoe to double click on element 
		action.moveToElement(searchBox).click().sendKeys("Movies").doubleClick().perform();
		//action.moveToElement(searchBox).click().keyUp(Keys.SHIFT).sendKeys("movies").perform();// other way to send keys on capital letter
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();

	}

}

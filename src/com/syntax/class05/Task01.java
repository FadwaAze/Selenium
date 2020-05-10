package com.syntax.class05;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task01 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Open chrome browser Go to “https://www.facebook.com” 
		 * Verify: month dd has 12 month options 
		 * day dd has 31 day options 
		 * year dd has 115 year options 
		 * Select your date of birth Quit browser
		 */
		setUp();
		WebElement montth=driver.findElement(By.id("month"));
		Select selectM=new Select(montth);
		selectM.selectByIndex(12);
		
		//Verify: month dd has 12 month options
		List<WebElement> monthList=selectM.getOptions();
		String sMonth=null;
		for (WebElement m : monthList) {
			String mm=m.getText();
			if(mm.equals("May")) {
				selectM.selectByVisibleText("May");
				sMonth=mm;
			}
			
		}
		
//		for (int i=0; i<month.size();i++) { //check all months if it's selctable
//			select.selectByIndex(i);
//			Thread.sleep(2000);
//			
//		}
		
		
		//day dd has 31 day options
		
		WebElement day=driver.findElement(By.id("day"));
		Select selectD=new Select(day);
		List<WebElement> dayList=selectD.getOptions();
		String sDay=null;
		for (WebElement d: dayList) {
			String dd=d.getText();
			if(dd.equals("20")) {
				selectD.selectByIndex(20);
				sDay=dd;
			}
		}
		//year dd has 115 year options
		
		WebElement year=driver.findElement(By.id("year"));
		Select selectY=new Select(year);
		List<WebElement> yearList=selectY.getOptions();
		String sYear=null;
		for (WebElement y : yearList) {
			String yy=y.getText();
			if(yy.equals("1987")) {
				selectY.selectByVisibleText("1987");
				sYear=yy;
			}
			
		}
		
				System.out.printf("Date of Birth: "+ sMonth+" "+sDay+" "+sYear); 
				Thread.sleep(3000);
				driver.quit();

	}

}

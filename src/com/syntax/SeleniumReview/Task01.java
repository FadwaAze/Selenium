package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class Task01 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Go to amazon.com select books from the search dropdown type Harry potter and
		 * click on Search check Unofficial CookBook checkbox on the left under Book
		 * Series
		 */
		setUp();
		WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
		Select selectDD = new Select(searchDropDown);

		List<WebElement> ddOption = selectDD.getOptions();
		for (WebElement option : ddOption) {
			String optionText= option.getText();
			System.out.println(optionText);
			
		}
		Thread.sleep(2000);
		selectDD.selectByVisibleText("Books");
		WebElement searchTextBox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		searchTextBox.sendKeys("Harry Potter");
		WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit'][@class='nav-input']"));
		searchButton.click();
		
		List<WebElement> bookSeriesCheckBoxes=driver.findElements(By.className("a-spacing-micro"));
		for (WebElement bookseriesCheckBox : bookSeriesCheckBoxes) {
			String checkBoxText=bookseriesCheckBox.getText();
			if(checkBoxText.equals("Unofficial Cookbook")&& checkBoxText.equals("Unofficial Cookbook")) {
				bookseriesCheckBox.click();
				break;
			}
			
		}	
		Thread.sleep(4000);

		driver.quit();

	}
}

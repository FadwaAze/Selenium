package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task04 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Syntax Demo input boxes count: Open chrome browser Go to
		 * “http://jiravm.centralus.cloudapp.azure.com:8081/index.html” Click on “Input
		 * Forms” links Click on “Simple Form Demo” links Get all input boxes from the
		 * page Enter “Hello” to each text box Close browser
		 */
		String url = "http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Simple Form Demo")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("Hello");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
//		//List<WebElement> allLink=driver.findElements(By.xpath("//input[@type='text']"));
//		
//		for (WebElement link : allLink) {
			
			
		//}
		
		
		
}

}

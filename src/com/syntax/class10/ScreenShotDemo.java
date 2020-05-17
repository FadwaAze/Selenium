package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.utils.BaseClass;
import com.syntax.utils.ConfigsReader;

public class ScreenShotDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		setUp();//166.62.36.207/humanresources/symfony/web/index.php/auth/login
		
		// login to HRMS application
		driver.findElement(By.name("txtUsername")).sendKeys(ConfigsReader.getProperty("username"));

		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getProperty("password"));

		driver.findElement(By.className("button")).click();
		
		Thread.sleep(2000);
		
		// create an object of TakesScreenshot interface and cast the Wedriver with it
		TakesScreenshot ts=(TakesScreenshot)driver;//downcasting
		
		//Use getScreenshotAs() method to take the screenshot (int the constructor pass Type.File)
		File sourceFile=ts.getScreenshotAs(OutputType.FILE);
		
		                                      // file name + new file created+ name the screen shot 
		FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/dashboard.png"));
		
		
		
		//Copy the file from source to a another destination 
//				try {
//					FileUtils.copyFile(sourceFile, new File("screenshots/HRMS/pics.png"));
//				} catch (IOException e) {
//					e.printStackTrace();
//					System.out.println("Screenshot was not taken");
//				}
		tearDown();

	}

}

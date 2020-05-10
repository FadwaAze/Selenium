package com.syntax.class02;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task02WebConfigure {
	// public static WebDriver driver;//instant variable lives outside the main
	// method and can be accessed from main method

	public static void main(String[] args) throws IOException, InterruptedException {
		/*
		 * CREATE A PROPERTY FILE TO STORE following configurations: browser= url=
		 * username= password= In your Selenum code use values from properties file to
		 * open specifified browser, navigate to specified url and enter username and
		 * password
		 */

		// avoid hardcoding by using user.dir
		String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";
		System.out.println(filePath);

		// fileinputStream used to access the properties file
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);

		// get element from properties file
		String browser = prop.getProperty("browser");

		WebDriver driver = null;// local variable need to be initialize in order to use
		// so either use static variable outside the main method or initialize local
		// variable =null

		switch (browser.toLowerCase()) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver = new FirefoxDriver();
			break;
		}
//		String url=prop.getProperty("url");
//		driver.get(url);
		driver.get(prop.getProperty("url"));
		Thread.sleep(3000);
		driver.close();

//		
//		String url = prop.getProperty("url");
//		String username = prop.getProperty("username");
//		String password = prop.getProperty("password");
//
//		driver.navigate().to(url);// navigate to facebook page
//		driver.findElement(By.id("email")).sendKeys("username");// pass username
//		driver.findElement(By.id("pass")).sendKeys("password");// pass password
//
//		Thread.sleep(5000);
//		driver.close();

	}

}

package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;


public class LoginPage extends CommonMethods{
	
	// Storing ALL the elements of login page in order to reusing them. 
	
	public WebElement username=driver.findElement(By.id("txtUsername"));
	
	public WebElement password=driver.findElement(By.id("txtPassword"));
	
	public WebElement loginBtn=driver.findElement(By.id("btnLogin"));
	
	public WebElement displayLogo=driver.findElement(By.id("divLogo"));
	
	

}
package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class LoginpageElements {
	
	
	//@FindBy ---> locate elements 
	
	@FindBy(id="txtUsername")
	public WebElement username;
	
	@FindBy(name="txtPassword")
	public WebElement password;
	
	
	@FindBy(css="input#btnLogin")
	public WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	public WebElement logo;
	
	
	public LoginpageElements() {
		//page Factory (class) --> to initialize all elements at once using initElements() Methods
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
	
	
	
	
	

}

package com.syntax.test;

import com.syntax.pages.LoginPage;
import com.syntax.utils.CommonMethods;

public class TC1 extends CommonMethods{

	public static void main(String[] args) {
		// 
		
		setUp();
		
		LoginPage logo=new LoginPage();
		if(logo.displayLogo.isDisplayed()) {
			System.out.println("Logo is displayed");
		}else {
			System.out.println("logo is not displayed");
		}
		
		tearDown();
		
		

	}

}

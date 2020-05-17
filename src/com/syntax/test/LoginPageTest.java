package com.syntax.test;

import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginpageElements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends CommonMethods{

	public static void main(String[] args) {
		setUp();
		
		LoginpageElements login =new LoginpageElements();
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		click(login.loginBtn);
		
		DashBoardPageElements dashBoard= new DashBoardPageElements();
		
		
		
		
		
		
		
		
	}

}

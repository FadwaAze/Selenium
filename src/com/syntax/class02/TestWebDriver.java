package com.syntax.class02;

public class TestWebDriver {

	public static void main(String[] args) {
		
	SWebDriver driver=new SchromeDriver();
	driver.get("https://www.google.com");
	driver.getCurrentUrl();
	driver.close();
	
	SWebDriver driver2=new SFirefoxDriver();
	driver2.get("https://www.firefox.com");
	driver2.close();

	}

}

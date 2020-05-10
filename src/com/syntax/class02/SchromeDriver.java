package com.syntax.class02;

public class SchromeDriver implements SWebDriver {
	
	public SchromeDriver() {
		System.out.println("Opening chrome Browser");
	}

	@Override
	public void get(String url) {
		System.out.println("Launching the url :: "+url);
	}

	@Override
	public void getCurrentUrl() {
		System.out.println("Retreiving current URL");
		
	}

	@Override
	public void close() {
		System.out.println("Closing the current Windows");
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}

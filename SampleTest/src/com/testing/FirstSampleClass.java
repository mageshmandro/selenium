package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSampleClass {

	public static void main(String[] args) {
		System.out.println("Testing");
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		
		// TODO Auto-generated method stub

	}

}

package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.id("Click"));
		frame1.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2=driver.findElement(By.id("Click1"));
		frame2.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> totalFrames= driver.findElements(By.tagName("iframe"));
		int size=totalFrames.size();
		System.out.println(size);
		
		
		
		


	}

}

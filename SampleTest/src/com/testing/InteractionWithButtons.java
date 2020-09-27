package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub http://www.leafground.com/pages/Button.html
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		WebElement getPosition= driver.findElement(By.id("position"));
		Point point= getPosition.getLocation();
		int xValue=point.getX();
		int yValue=point.getY();
		System.out.println("x value is: "+xValue+ "y value is :" +yValue);
		
		WebElement getColor= driver.findElement(By.id("color"));
		 String color= getColor.getCssValue("background-color");
		 System.out.println(color);
		 
		 WebElement getSizee= driver.findElement(By.id("size"));
		int height= getSizee.getSize().getHeight();
		int width=  getSizee.getSize().getWidth();
		System.out.println("height is" +height+ "width is" +width);
		
		WebElement clickButton= driver.findElement(By.id("home"));
		clickButton.click();
		 
		

	}

}

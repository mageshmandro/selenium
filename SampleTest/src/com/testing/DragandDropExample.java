package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/drop.html");
		
		WebElement from=driver.findElement(By.id("draggable"));
		WebElement to=driver.findElement(By.id("droppable"));
		
		Actions action=new Actions(driver);
		action.dragAndDrop(from, to).build().perform();
		
		


	}

}

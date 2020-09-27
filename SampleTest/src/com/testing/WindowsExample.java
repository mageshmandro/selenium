package com.testing;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		
		String oldWindow=driver.getWindowHandle();
		WebElement firstButton=driver.findElement(By.id("home"));
		firstButton.click();
		
		Set<String> allHandles=driver.getWindowHandles();
		
		for (String handles : allHandles) {
			driver.switchTo().window(handles);
			
		}
		
		WebElement editBox=driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a/h5"));
		editBox.click();
		driver.close();
		driver.switchTo().window(oldWindow);
		
		WebElement multiWindows=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multiWindows.click();
		int numberOfWindows=driver.getWindowHandles().size();
		System.out.println(numberOfWindows);
		
		WebElement closeWindow=driver.findElement(By.xpath("//*[@id=\'color\']"));
		closeWindow.click();
		Set<String> windows= driver.getWindowHandles();
		for (String windows1 : windows) {
			if(!windows1.equals(oldWindow));
			{
				driver.switchTo().window(windows1);
				driver.close();
			}
			
		}
		
		

	}

}

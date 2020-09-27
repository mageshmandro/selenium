package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub http://www.leafground.com/pages/autoComplete.html
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
			
		WebElement autoComplete=driver.findElement(By.id("tags"));
		autoComplete.sendKeys("s");
		Thread.sleep(3000);
		
		List<WebElement> options=driver.findElements(By.xpath("//*[@id=\'ui-id-1']/li"));
		for (WebElement webElement : options) {
			if (webElement.getText().equals("Selenium")) {
				webElement.click();
				break;
			}
			
		}
		
			
		

	}

}

package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		
		WebElement whereTogo=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/a"));
		String where=whereTogo.getAttribute("href");
		System.out.println(where);
		
		WebElement brokenLink=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/a"));
		brokenLink.click();
		String title=driver.getTitle();
		if (title.contains("404")) {
			System.out.println("The link is broken");
			driver.navigate().back();
			
		}
		
		List<WebElement> total=driver.findElements(By.tagName("a"));
		int count=total.size();
		System.out.println(count);
		
		
		

	}

}

package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  ("//td[normalise_space='Learn to interact with Elements']//following::td[1]")
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/table.html");
		
		List<WebElement> column =driver.findElements(By.tagName("th"));
		int count1=column.size();
		System.out.println(count1);
		
		List<WebElement> rows=driver.findElements(By.tagName("tr"));
		int count2=rows.size();
		System.out.println(count2);
		
		WebElement percentage=driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent= percentage.getText();
		System.out.println(percent);
		


	}

}

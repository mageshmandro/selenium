package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		
		WebElement radio1= driver.findElement(By.id("yes"));
		radio1.click();
		
		WebElement unchecked=driver.findElement(By.name("news"));
		WebElement checked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
		boolean value1=unchecked.isSelected();
		boolean value2=checked.isSelected();
		System.out.println(value1);
		System.out.println(value2);
		
		WebElement below20=driver.findElement(By.name("age"));
		below20.click();
		
				
		


	}

}

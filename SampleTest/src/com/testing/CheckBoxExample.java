package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement checkBox1Element=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[1]/input"));
		checkBox1Element.click();
		
		WebElement conformBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
		boolean value=conformBox.isSelected();
		System.out.println(value);
		
		WebElement notSelected=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
		
		if(notSelected.isSelected())
		{
			notSelected.click();
		}
		WebElement selected=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
		
		if(selected.isSelected())
		{
			selected.click();
		}
		
		
				
		


	}

}

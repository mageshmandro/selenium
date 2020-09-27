package com.testing;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//*[@id="contentblock"]/section/div[6]/select/option[1]
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");


		WebElement dropdown1= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/select"));
		Select select1=new Select(dropdown1);
		select1.selectByIndex(2);

		WebElement dropdown2= driver.findElement(By.name("dropdown2"));
		Select select2=new Select(dropdown2);
		select2.selectByVisibleText("Selenium");

		WebElement dropdown3= driver.findElement(By.id("dropdown3"));
		Select select3=new Select(dropdown3);
		select3.
		
		selectByValue("2");

		WebElement dropdown4= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select select4= new Select(dropdown4);
		List<WebElement> list=select4.getOptions();
		int size=list.size();
		System.out.println(size);
		
		WebElement dropdown5=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select multiSelect=new Select(dropdown5);

		multiSelect.selectByIndex(1);
		multiSelect.selectByIndex(2);
		multiSelect.selectByIndex(3);


		









	}

}

package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub//*[@id="email"]
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement emailBox= driver.findElement(By.id("email"));
		emailBox.sendKeys("mage6151@gmail.com");
		
		WebElement appendBox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendBox.sendKeys("mandro"); 
		
		WebElement getText= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
		String text= getText.getAttribute("value");
		System.out.println(text);
		
		WebElement clearText= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearText.clear();
		
		WebElement disabledBox= driver.findElement(By.xpath("//*[@id=\'contentblock']/section/div[5]/div/div/input"));
		Boolean value= disabledBox.isEnabled();
		System.out.println(value);
		
		

	}

}

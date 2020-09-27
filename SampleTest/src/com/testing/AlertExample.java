package com.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		
		WebElement alert1=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alert1.click();
		Alert alert= driver.switchTo().alert();
		alert.accept();
		
		WebElement alert2=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		alert2.click();
		Alert alertBox=driver.switchTo().alert();
		alertBox.dismiss();
		
		
		WebElement prompt=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		prompt.click();
		Alert promptBox=driver.switchTo().alert();
		promptBox.sendKeys("mandro");
		promptBox.accept();
		
		


	}

}

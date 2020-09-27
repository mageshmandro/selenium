package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Image.html");
		
		WebElement  image= driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/img"));
		if (image.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
			
		}
		else
		{
			System.out.println("The image is not broken");
		}
		


	}

}

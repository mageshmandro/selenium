package com.testing;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		
		WebElement download=driver.findElement(By.xpath("//*[@id=\'wrapper\']/div/div[3]/div[2]/a[1]"));
		download.click();
		Thread.sleep(3000);
		
		File location= new File("C:\\Users\\latha\\Downloads");
		File[] totalFiles=	location.listFiles();
		
		for (File file : totalFiles) {
			file.getName().equals("testleaf");
			System.out.println("the file is present");
			break;
			
			
			
		}
		


	}

}

package com.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\mandro\\selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> select= driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		Actions action=new Actions(driver);

		action.clickAndHold(select.get(0));
		action.clickAndHold(select.get(1));
		action.clickAndHold(select.get(2));
		action.build().perform();




	}

}

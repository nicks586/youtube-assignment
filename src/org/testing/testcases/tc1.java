package org.testing.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class tc1 {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		FirefoxDriver ref=new FirefoxDriver();
		ref.get("https://www.youtube.com");
		ref.manage().window().maximize();
		WebElement trending=ref.findElement(By.cssSelector("a[href='/feed/trending']"));
		trending.click();
		//WebElement ws=ref.findElement(By.cssSelector("a[href='/watch?v=rjgkguWuhvg']"));
		//ws.click();
		
		//WebElement Subscribe=ref.findElement(By.cssSelector("paper-button[role='button']"));
		//Subscribe.click();
		
		

	}
}

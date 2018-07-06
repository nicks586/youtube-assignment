package org.testing.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class bc {

	@BeforeMethod
	public void m1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "F:\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		FirefoxDriver ref=new FirefoxDriver();
		ref.get("https://www.youtube.com");
		ref.manage().window().maximize();
		WebElement ws=ref.findElement(By.cssSelector("paper-button[id='button']"));
		ws.click();
		WebElement gmail_id=ref.findElement(By.cssSelector("input[id='identifierId']"));
		gmail_id.sendKeys("nikhilsingh586@gmail.com");
		WebElement next=ref.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		next.click();
		WebElement gmail_ida=ref.findElement(By.cssSelector("input[id='recoveryIdentifierId']"));
		gmail_ida.sendKeys("9793466073");
		Thread.sleep(5000);
		WebElement nexta=ref.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		nexta.click();
		Thread.sleep(5000);
		WebElement first_name=ref.findElement(By.cssSelector("input[id='firstName']"));
		first_name.sendKeys("Nikhil");
		WebElement last_name=ref.findElement(By.cssSelector("input[id='lastName']"));
		last_name.sendKeys("Singh");
		Thread.sleep(5000);
		WebElement nextb=ref.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		nextb.click();
		Thread.sleep(5000);
		WebElement send=ref.findElement(By.cssSelector("content[class='CwaK9']"));
		send.click();
		Thread.sleep(40000); 
		WebElement nextc=ref.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		nextc.click();
		Thread.sleep(5000); //can we use explicit
		WebElement chooseacc=ref.findElement(By.cssSelector("p[class='wpW1cb']"));
		chooseacc.click();
		Thread.sleep(5000);
		WebElement gmail_pass=ref.findElement(By.cssSelector("input[autocomplete='current-password']"));
		gmail_pass.sendKeys("9793466073nik");
		Thread.sleep(5000);
		WebElement pass_next=ref.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		pass_next.click();
		Thread.sleep(5000);
		WebElement Sout1=ref.findElement(By.id("avatar-btn"));
		Sout1.click();
		Thread.sleep(5000);
		WebElement sout2=ref.findElement(By.id("label"));
		sout2.click();
		Thread.sleep(10000);
		ref.close();
	}
}

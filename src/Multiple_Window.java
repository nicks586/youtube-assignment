import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Window {
public static void main(String[] args) {	
	System.setProperty("webdriver.gecko.driver", "F:\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
	FirefoxDriver ref=new FirefoxDriver();
	ref.get("https://www.youtube.com");
	ref.manage().window().maximize();
	//List<WebElement> ls=ref.findElements(By.id("video-title"));
	//System.out.println(ls.size());
	//ls.get(4).click();
	WebElement ws=ref.findElement(By.cssSelector("a[title='Trending']"));
	Actions ac=new Actions(ref); 
	ac.keyDown(Keys.CONTROL).click(ws).keyUp(Keys.CONTROL).perform();
	System.out.println("url is" + ref.getCurrentUrl());	
	String current_window=ref.getWindowHandle();
	Set<String> all_window=ref.getWindowHandles();
	System.out.println("total windows" + all_window.size());
	for(String s:all_window)
	{
		ref.switchTo().window(s);
	}
	System.out.println("after switching url is" + ref.getCurrentUrl());
	
	ref.switchTo().window("current_window");
	System.out.println("again" + ref.getCurrentUrl());

}
}

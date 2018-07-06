import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailautomate {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "F:\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		FirefoxDriver ref=new FirefoxDriver();
		//ref.get("https://www.youtube.com")
		ref.get("https://www.gmail.com");
		ref.manage().window().maximize();
		//WebElement signinbutton=ref.findElement(By.cssSelector("a[data-g-label='Sign in']"));
		//signinbutton.click();
		WebElement gmail_id=ref.findElement(By.cssSelector("input[id='identifierId']"));
		gmail_id.sendKeys("nikhilsingh586@gmail.com");
		WebElement signinnextbutton=ref.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		signinnextbutton.click();
		ref.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement gmailrec_id=ref.findElement(By.cssSelector("input[id='recoveryIdentifierId']"));		
		gmailrec_id.sendKeys("9793466073");
		
		WebElement signinrecnextbutton=ref.findElement(By.cssSelector("span[class='RveJvd snByac']"));
		WebDriverWait w8=new WebDriverWait(ref, 5);
		w8.until(ExpectedConditions.elementToBeClickable(signinrecnextbutton));
		//signinrecnextbutton.click();
		//Actions ac=new Actions(ref);
		//ac.keyDown(Keys.ENTER).click(signinrecnextbutton).keyUp(Keys.ENTER).perform();
		

}}

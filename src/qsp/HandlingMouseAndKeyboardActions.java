package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAndKeyboardActions {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		//performing Mouse Hover Action
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Actions ac=new Actions(driver);
		WebElement fashion=driver.findElement(By.xpath("//div[text()='Fashion']"));
		ac.moveToElement(fashion).perform();
		Thread.sleep(3000);
		//perform double click action
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(5000);
		WebElement untb=driver.findElement(By.xpath("//input[@value='Username']"));
		untb.sendKeys("Username");
		ac.doubleClick(untb).perform();
		ac.contextClick();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		
		
		WebElement pwdtb=driver.findElement(By.xpath("//input[@type='password']"));
		ac.contextClick();
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		
		
}

}

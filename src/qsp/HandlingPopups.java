package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopups {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("file:///F:/HTML/alert.html");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		
//		Alert al = driver.switchTo().alert();
//		Thread.sleep(2000);
//		System.out.println(al.getText());
//		al.accept();
//		//al.accept();
//		//al.dismiss();
//		//al.getText();
//		//a;.sendKeys(arg0);
//		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///F:/HTML/confirm.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='I love you']")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(al.getText());
		Thread.sleep(1000);
		//To click on OK Button
		al.accept();
		//To click on Cancel Button
//		al.dismiss();
		
		
		
	}

}

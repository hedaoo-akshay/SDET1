package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeSongPlay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		
//		driver.get("https://www.youtube.com/");
		
		driver.findElement(By.id("search")).sendKeys("butta bomma");
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-searchbox']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='#AlaVaikunthapurramuloo - ButtaBomma Full Video Song (4K) | Allu Arjun | Thaman S | Armaan Malik' and @id='video-title']")).click();
		

	}

}

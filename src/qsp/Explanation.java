package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Explanation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\KCSM6\\Automation\\Drivers\\chromedriver.exe");
	    ChromeDriver ch_driver = new ChromeDriver();	
	    ch_driver.close();
	    
	    System.setProperty("webdriver.geckodriver.driver", "F:\\KCSM6\\Automation\\Drivers\\geckodriver.exe");
	    FirefoxDriver ff_driver=new FirefoxDriver();
		ff_driver.close();
	}

}

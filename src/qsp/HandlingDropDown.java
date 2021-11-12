package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("file:///F:/HTML/singledropdown.html");
//		
//		Thread.sleep(2000);
//		WebElement ddAddr = driver.findElement(By.id("AnmishaFastFoodCenter"));
//		Select sel = new Select(ddAddr);
////		sel.selectByIndex(3);
////		sel.selectByValue("friedrice");
//		sel.selectByVisibleText("Chilly Paneer");
//		ddAddr.click();
//		
//		if(sel.isMultiple()) {
//			System.out.println("It is Multiple-select DropDown");
//		}
//		else {
//			System.out.println("It is Single-select DropDown");
//		}
		
		driver.get("file:///F:/HTML/multipledropdown.html");
		Thread.sleep(2000);
		WebElement ddAddr= driver.findElement(By.id("AkhilaFastFoodCenter"));
		Select sel =  new Select(ddAddr);
		
		if(sel.isMultiple()) {
			System.out.println("It is Multiple-select DropDown");
		}
		else {
			System.out.println("It is Single-select DropDown");
		}
		
		List<WebElement> allOptions=sel.getOptions();
		for(int i=0; i<=allOptions.size()-1;i++)
		{
			System.out.println(allOptions.get(i).getText());
		}
		
		for(int i=0;i<=allOptions.size()-1;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		
		Thread.sleep(3000);
		sel.deselectByIndex(3);
		sel.deselectByValue("noodles");
		sel.deselectByVisibleText("Fried Rice");
//		for(int i=0;i<=allOptions.size()-1;i++)
//		{
//			sel.deselectByIndex(i);
//			Thread.sleep(2000);
//		}
//		sel.deselectAll();
		
		System.out.println(sel.getAllSelectedOptions().size());
		System.out.println(sel.getFirstSelectedOption().getText());
		System.out.println(sel.getWrappedElement().getText());
		
	}

}

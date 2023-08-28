package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "D:\\Java Training\\Firefox driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		String text=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div[2]")).getText();
		
		System.out.println(text);
		
		

	}

}

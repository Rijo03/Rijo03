package webDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Conditionalcommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "D:\\Java Training\\Firefox driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		WebElement Name=driver.findElement(By.name("firstName"));
		//WebElement pass=driver.findElement(By.name("pass"));
		
		if (Name.isDisplayed() && Name.isEnabled())
		{
			Name.sendKeys("Rijo");
		}
		
		/*if (pass.isDisplayed() && pass.isEnabled())
		{
			pass.sendKeys("rijor2040");
		} */
		
		
		
		WebElement R= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/main/article/div/div/div[1]/form[1]/input[1]"));
		
		
		System.out.println(R.isSelected()); //Male
		
		if (R.isSelected()==false)
		{
			
		R.click();
			
		}
		
		driver.close();
		

	}

}

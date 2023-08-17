import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckPageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver","D:\\Java Training\\Chrome\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();*/
		
		System.setProperty("webdriver.firefox.marionette", "D:\\Java Training\\Firefox driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://testsso.advantmed.com/");
		
		String exacttitle="Advantmed-Login";
		String acttitle	= driver.getTitle();
		
		if (exacttitle.equals(acttitle))
		{
			System.out.println("Title is same");
		}
		else
		{
			System.out.println("Title is not same");
		}
			
		driver.quit();
			

	}

}

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	@Test
	public void getData() {
		System.out.println("Hello");
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://divyasriacademy.azurewebsites.net/webapp/");
		String currentTitle = driver.findElement(By.cssSelector("body h1")).getText();
		System.out.println("Currenyt title is : "+currentTitle);
		Assert.assertEquals(currentTitle,"Divya Srivastava.com Learning");
		driver.close();
	}
}
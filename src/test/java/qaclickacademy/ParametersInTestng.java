package qaclickacademy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestng {

	WebDriver driver = null;
	
	@Parameters({"URL"})
	@Test
	public void testParameters(String URL) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neetu\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
	
	}
}

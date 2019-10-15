package qaclickacademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GmailLogIn {
	
	WebDriver driver = null;
	@Test(groups="Udemy testing")
	public void udemyQuestion() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Neetu\\chromedriver.exe");
		driver = new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Neetu\\Mavenjava\\userDetails.properties");
		// The above line can also be written like this: This is to make sure that the directory is picked correctly even if it is not local system
		// FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\parameterization\\object.properties");
		prop.load(fis);
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("passwordNext")).click();
		/*
		 * driver.findElement(By.xpath("//a[contains(text(),'Q&A')]")).click();
		 * driver.findElement(By.id("search-questions")).
		 * sendKeys("unable to install maven"); Thread.sleep(2000);
		 * driver.findElement(By.xpath(
		 * "//div[@class='question-list--questions--KBskR']/div[1]/div[2]/a")).click();
		 */	
	
	}

}

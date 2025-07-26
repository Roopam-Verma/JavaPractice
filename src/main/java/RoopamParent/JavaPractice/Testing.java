package RoopamParent.JavaPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	@Test
	public void quoteCreation() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		
		//Login Page
		
		driver.get("https://www.discoveryinsurance.com/disco/quoting/quoteSearch.xhtml");
		System.out.println("login started");
		driver.findElement(By.id("username")).sendKeys("511");
		driver.findElement(By.id("password")).sendKeys("Pegramis#1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("login done");
		
		//select the quote page
		
		driver.findElement(By.xpath("//a[contains(.,'Quoting')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'New Quote')]")).click();
		
		// Named insured page		
		driver.findElement(By.id("customerForm:firstName")).sendKeys("Sherrie");
		driver.findElement(By.id("customerForm:lastName")).sendKeys("Hightower");		
		driver.findElement(By.id("customerForm:house")).sendKeys("5515");
		driver.findElement(By.id("customerForm:street")).sendKeys("W Market St");
		driver.findElement(By.id("customerForm:zip")).sendKeys("27409");
		driver.findElement(By.id("customerForm:dob")).sendKeys("08/12/1975");
//		driver.findElement(By.id("customerForm:effective")).clear();
//		
//		driver.findElement(By.id("customerForm:effective")).sendKeys("06/24/2025");
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		
		
	}

}




	




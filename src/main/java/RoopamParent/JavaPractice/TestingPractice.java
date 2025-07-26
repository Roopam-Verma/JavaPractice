package RoopamParent.JavaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingPractice {
	@Test
	public void findElement() {
		WebDriver driver;
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com");
		
		String name = driver.findElement(By.cssSelector("li a[href='index.htm']")).getText();
		
		System.out.println(name);
		System.out.println("Printed");
	}

	
	
	
	
}

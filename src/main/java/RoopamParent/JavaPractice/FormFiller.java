package RoopamParent.JavaPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FormFiller {
	

	@Test
	public void findElement() throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromiumdriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		
//		driver.get("https://formy-project.herokuapp.com/");
//		
//		Thread.sleep(2000);
//		
//		WebElement completeWebForm = driver.findElement(By.xpath("//a[.='Complete Web Form']"));
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", completeWebForm);
//		System.out.println("scroll done");
//		completeWebForm.click();
		driver.get("https://formy-project.herokuapp.com/form");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10000)); 
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(.,'Complete Web Form')]"))));
		
		
		
		driver.findElement(By.id("first-name")).sendKeys("FirstName");
		driver.findElement(By.id("last-name")).sendKeys("LastName");
		driver.findElement(By.id("job-title")).sendKeys("AutomationDeveloper");
		driver.findElement(By.xpath("//div[contains(.,'Grad')]/input")).click();
		
		driver.findElement(By.xpath("//div[contains(.,'Female')]/input")).click();
		
		WebElement select_option = driver.findElement(By.id("select-menu"));
		
		Select selectEle = new Select(select_option);
		selectEle.selectByValue("1");
		
		driver.findElement(By.id("datepicker")).sendKeys("02/02/2025");
		driver.findElement(By.cssSelector("a[href='/thanks']")).click();
		
		
		Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-success")).isDisplayed(), "Order Not Submitted");
		System.out.println("OrderSubmitted");
	
	}
}
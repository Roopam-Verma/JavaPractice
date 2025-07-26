package RoopamParent.JavaPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDownloadPractice{
	WebElement element, pdf_element, main_page;
	@Test
	public void uploadDownload() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		element = driver.findElement(By.xpath("//a[contains(.,'File Download')]"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		element.click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h3[contains(.,'File Downloader')]"))));
		
		pdf_element = driver.findElement(By.cssSelector("a[href='download/Screenshot (8).png']"));
		Assert.assertTrue(pdf_element.isDisplayed(), "Element not present");
		System.out.println("PDF element Displayed");
		pdf_element.click();
		
		System.out.println("alertIsPresent");

		driver.close();	
	}
	
	
	@Test
	public void TestDownload() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));
		driver.manage().window().maximize();
		
		
		driver.get("https://the-internet.herokuapp.com/");
		main_page = driver.findElement(By.cssSelector(".heading"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(main_page));
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@href,'upload')]")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("file-upload"))));
		
		
		System.out.println("page opened up");
		String filepath = "C:\\Users\\rverm\\upload.txt";
		
		driver.findElement(By.id("file-upload")).sendKeys(filepath);
		
		System.out.println("FileUploaded");
		
		driver.findElement(By.id("file-submit")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(.,'File Uploaded!')]")).isDisplayed(), "File Not Uploaded");
		
		System.out.println("File Uploaded Successfully");
		
		driver.close();
		
		
	}
	

}

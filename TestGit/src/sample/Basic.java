package sample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Basic {

	public static void main(String[] args) throws InterruptedException {
		Basic obj = new Basic();
		obj.meth(); 
	}
		 

		private By lnkHome = By.xpath("//div[text()='Home']");
		private By lnkHomeFurnish = By.xpath("//a[@class='_6WOcW9 _2-k99T']");
		private By bedsheets = By.xpath("//a[text()='Bedsheets']");
		
		
		
		public void meth() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anil\\eclipse-workspace\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.navigate().to("https://google.com");
			Thread.sleep(3000);
			driver.navigate().to("https://www.flipkart.com");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			WebDriverWait pause = new WebDriverWait(driver, Duration.ofSeconds(0));
			pause.until(ExpectedConditions.visibilityOfElementLocated(lnkHome));
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(lnkHome)).perform();
			act.moveToElement(driver.findElement(lnkHomeFurnish)).perform();
			driver.findElement(bedsheets).click();
			Thread.sleep(7000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			WebElement xyz = driver.findElement(bedsheets);
			
			driver.wait();
			driver.wait(5000);
			
			
			
		}
		
		


	}



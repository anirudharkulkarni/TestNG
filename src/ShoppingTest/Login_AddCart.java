package ShoppingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Login_AddCart {

WebDriver driver;
	
//	ExtentReports report;
//	ExtentTest test;
//	
//	SoftAssert soft = new SoftAssert();
	
	
	@Test
	public void SignIn() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		
		driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
//		report = new ExtentReports("ExtentReport.html");
		
		WebElement UserName = driver.findElement(By.xpath("//input[@name='user-name']"));
		UserName.sendKeys("standard_user");
		
		WebElement PassWord = driver.findElement(By.xpath("//input[@name='password']"));

		PassWord.sendKeys("secret_sauce");
		
		WebElement Login = driver.findElement(By.xpath("//input[@name='login-button']"));
		Login.click();
		
	}
	@Test(dependsOnMethods= "SignIn")
	public void addcart() {
		
		WebElement AddCart = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
		AddCart .click();
		
//		WebElement AddCartLink = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//		AddCartLink .click();
	}
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
		
		
		
	}
	
	
	

}
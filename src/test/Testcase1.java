package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase1 {
	
	@BeforeTest 
	
public void BeforeTest() {
		
		System.out.println("Inside Before Test");
		
	}
	
	@BeforeMethod
	public void setup() {
		
		System.out.println("Inside Before Method");
		
	}

	@Test
	public void LoginTest() {
		
		System.out.println("Inside Login");

	}
	
	@Test(enabled=false)
	public void SignUp() {
		
		System.out.println("SignUp");
	}
	
	@AfterMethod
	public void AfterMeth() {
		System.out.println("Inside After Method");
	}
	
	@AfterTest
	
public void AfterTest() {
		
		System.out.println("Inside Test");
	}
}

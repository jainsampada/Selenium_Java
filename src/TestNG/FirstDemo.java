package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstDemo {
	//Annotations
	
		
		@BeforeClass
		public void Beforeclass1()
		{
			System.out.println("Before Class");
		}
		@BeforeSuite//it will run before all test cases run
		public void Launch()
		{
			System.out.println("Launch Browser");
		}
		@AfterClass
		public void Afterclass1()
		{
			System.out.println("After class 1");
		}
		@BeforeMethod
		public void BeforeMethod()
		{
			System.out.println("Before Method");
		}
		@AfterMethod
		public void AfterMethod()
		{
			System.out.println("After Method");
		}
		@BeforeTest
		public void Test()
		{
			System.out.println("Before Test");
		}
		@AfterTest
		public void AfterTest1()
		{
			System.out.println("After Test");
		}
		@Test()
		public void Login()
		{
			System.out.println("Login Code");
		}
		@Test()
		public void Log()
		{
			System.out.println("Logout");
		}
		@Test()
		public void input()
		{
			System.out.println("Input data");
		}
		@AfterSuite
		public void close_Browser()
		{
			System.out.println("Close Browser");
		}
}

package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverDemo {
	public static WebDriver driver;
	public static String path;
	@BeforeSuite(groups= {"Smoke","Regression"})
public void Launch()
{
	//path=System.getProperty("");
	System.setProperty("webdriver.chrome.driver", "C:\\Sel_Softwares\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	//Implicit Wait 
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
}
	@AfterSuite(groups= {"Sanity"})
	public void Close_Browser()
	{
		driver.close();
	}
}

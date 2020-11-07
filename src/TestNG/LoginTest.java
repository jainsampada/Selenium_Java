package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends DriverDemo {
@Test(groups= {"Smoke","Regression"})
public void Login()
{
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).submit();
}
@Test(groups= {"Sanity"})
public void Forget_Pass()
{
	driver.findElement(By.linkText("Forgot your password?")).click();
	//Hard Assertion
	AssertJUnit.assertEquals(driver.getTitle(), "OrangeHRM");
	System.out.println(driver.getTitle());
	driver.navigate().back();
}
}

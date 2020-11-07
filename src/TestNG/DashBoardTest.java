package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DashBoardTest extends DriverDemo {
//	@Test//(enabled=false)// (groups= {"Smoke","Regression"})
//	public void Login() {
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//		driver.findElement(By.id("btnLogin")).submit();
//	}

	@Test(groups= {"Smoke"})//(dependsOnMethods ="Login")  
	public void Logout() {
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}

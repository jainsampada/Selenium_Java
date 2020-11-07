package TestNG;

import org.testng.annotations.Test;

public class PrioritizeDemo {
@Test(priority=0)
public void Login()
{
	System.out.println("Login");
}
@Test(priority=2)
public void Logout()
{
	System.out.println("Logout");
}
@Test(priority=1)

public void Checkout()
{
	System.out.println("Checkout");
}
}


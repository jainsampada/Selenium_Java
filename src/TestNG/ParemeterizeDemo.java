package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParemeterizeDemo {
@Test
@Parameters({"username","pass"})
public void Login(String uname,String pas)
{
	System.out.println(uname);
	System.out.println(pas);
}
}

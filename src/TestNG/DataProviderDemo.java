package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
@DataProvider(name="authentication")
public Object[][] auth()
{
	Object[][] arr=new Object[3][2];
	arr[0][0]="admin";
	arr[0][1]="ad";
	
	arr[1][0]="ad123";
	arr[1][1]="123";
	
	arr[2][0]="345gd";
	arr[2][1]="sdfd";
	
	return arr;
	
}
@Test(dataProvider="authentication")
public void Login(Object uname,Object pass)
{
	System.out.println(uname);
	System.out.println(pass);
}
}

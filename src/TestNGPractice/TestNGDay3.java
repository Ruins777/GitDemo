package TestNGPractice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDay3 {
	
	@Test
	public void webLoginCarLoan()
	{
		System.out.println("WebLogincar");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Im the number 1");
	}
	
	@Test(groups= {"Smoke"})
	public void mobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarSmoke");
	}
	
	@Test(dataProvider = "getData")
	public void mobileSignInCarLoan(String username, String password)
	{
		System.out.println("MobileSignInCar");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@Test
	public void mobileSignOutCarLoan()
	{
		System.out.println("MobileSignOutCar");
	}
	
	@DataProvider
	public Object[][] getData()
	
	{
	  Object[][] data = new Object[3][2];
	  
	  data[0][0] = "FirstUserName";
	  data[0][1] = "Password";
	  
	  data[1][0] = "SecondUserName";
	  data[1][1]= "SeacondPassword";
	  
	  data[2][0] = "ThirdUserName";
	  data[2][1] = "ThirdPassword";
	  
	  return data;
	}
	
	
	@Test
	public void apiLoginCarLoan()
	{
		System.out.println("APILoginCar");
	}

}

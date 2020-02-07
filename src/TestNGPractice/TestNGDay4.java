package TestNGPractice;

import org.testng.annotations.Test;

public class TestNGDay4 {
	
	@Test
	public void webLoginHomeLoan()
	{
		System.out.println("WebLoginHome");
		System.out.println("WebLoginHouse");
		System.out.println("WebLoginVilla");
	}
	
	@Test
	public void mobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
		System.out.println("MobileLoginHouse");
		System.out.println("MobileLoginVilla");
	}
	
	@Test(groups= {"Smoke"})
	public void apiLoginHomeLoan()
	{
		System.out.println("APILoginHomeSmoke");
		System.out.println("APILoginHouse");
		System.out.println("APILoginVilla");
		
	}

}

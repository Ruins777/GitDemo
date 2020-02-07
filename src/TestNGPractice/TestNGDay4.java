package TestNGPractice;

import org.testng.annotations.Test;

public class TestNGDay4 {
	
	@Test
	public void webLoginHomeLoan()
	{
		System.out.println("WebLoginHome");
	}
	
	@Test
	public void mobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void apiLoginHomeLoan()
	{
		System.out.println("APILoginHomeSmoke");
	}

}

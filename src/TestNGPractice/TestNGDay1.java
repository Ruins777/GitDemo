package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestNGDay1 {
	
	@AfterTest
	public void afterExection()
	{
		System.out.println("This will execute after the test");
	}
	
	@Test
	public void firstTest()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Iam the last number 1");
	}
	
	@Test
	public void seecondTest()
	{
		System.out.println("Bye");
	}
	

}

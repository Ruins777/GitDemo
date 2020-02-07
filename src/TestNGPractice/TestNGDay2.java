package TestNGPractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGDay2 {
	
	@BeforeTest
	public void beforeExecution()
	{
		System.out.println("This will execute before test starts");
	}
	
	@Parameters({"URL", "APIKey/User"})
	@Test
	public void personalLoan(String urlname, String key)
	{
		System.out.println("good");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(groups= {"Smoke"})
	public void personalgoldLoan()
	{
		System.out.println("Smoke Testing");
	}
	
	
	@Test
	public void pLoan()
	{
		System.out.println("good");
		
	}

}

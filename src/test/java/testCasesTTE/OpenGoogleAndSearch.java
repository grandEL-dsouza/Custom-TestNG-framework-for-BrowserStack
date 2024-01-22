package testCasesTTE;

import java.time.Duration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.Browsers;
import pages.GooglePage;
import pages.AllVariables;

public class OpenGoogleAndSearch {
	

	AllVariables vars= new AllVariables();
	
	@Test
	 public void SpecialConsideration() throws Exception
	 {
		
		Browsers.setup("chrome");

		Browsers.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Browsers.driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		Browsers.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		Browsers.driver.get(vars.google);
		
		GooglePage google = new GooglePage();
		
		google.EnterSearchtext();
		
	 }
//	  @AfterMethod
//	  public void takeScreenShotIfFail(ITestResult Result) throws IOException{ 
//		  
//			AllVariables.takeScreenShotOnFailure(Result);
//			
//		}



///////////////////////////////////////Close browser////////////////////////////////////////
	@AfterClass
	public void closebrowser()
	{
	//Browsers.driver.close();
		Browsers.driver.quit();
	}



	}

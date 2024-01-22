package testCasesTTE;

import java.time.Duration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pages.YahooPage;
import pages.Browsers;
import pages.AllVariables;

public class OpenYahooAndSearch  {
	
	AllVariables vars= new AllVariables();
	
  @Test
  public void Withdraw() throws Exception {
		
		
		//ExtentReportListener t = new ExtentReportListener();
		
		Browsers.setup("chrome");
		
		
		Browsers.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Browsers.driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		Browsers.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		Browsers.driver.get(vars.yahoo);
		
		YahooPage yahoo = new YahooPage();
		
		yahoo.EnterSearchText();
	}
//  
//  @AfterMethod
//  public void takeScreenShotIfFail(ITestResult Result) throws IOException{ 
//	  
//		AllVariables.takeScreenShotOnFailure(Result);
//		
//	}
///////////////////////////////////////Close browser////////////////////////////////////////
@AfterClass
public void closebrowser() {
	Browsers.driver.quit();
}

	  
}



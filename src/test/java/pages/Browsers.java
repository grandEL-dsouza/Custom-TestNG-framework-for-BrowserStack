package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import java.awt.Robot;
//import java.awt.event.KeyEvent;

public class Browsers {
	public static WebDriver driver;
	
	public static WebDriver setup(String browser) throws Exception
    {
    	if(browser.equalsIgnoreCase("chrome")) 
    	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--disable notofocations");
		DesiredCapabilities cp = new DesiredCapabilities();
		cp.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cp);
		options.addArguments("incognito");
		//options.addArguments("--auto-open-devtools-for-tabs");
		//options.addArguments("headless");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //Robot robot = new Robot();
        //robot.keyPress(KeyEvent.VK_F12);

    }
    	else if(browser.equalsIgnoreCase("edge"))
    	{
    		WebDriverManager.edgedriver().avoidBrowserDetection().setup();
    		EdgeOptions options = new EdgeOptions();
    		options.addArguments("--remote-allow-origins=*");
            driver = new EdgeDriver(options);
            driver.manage().window().maximize();
    	}
    	
    	else if(browser.equalsIgnoreCase("safari"))
    	{
    		SafariOptions options = new SafariOptions();
    		options.setUseTechnologyPreview(true);
    		driver = new SafariDriver(options);
    		driver.manage().window().maximize();
    		
    	}
    	
    	else
    	{
    		 throw new Exception("Browser is not correct");
    	}
		return driver;
    }
}

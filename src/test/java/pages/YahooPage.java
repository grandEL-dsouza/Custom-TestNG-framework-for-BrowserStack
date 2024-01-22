package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class YahooPage {

	public void EnterSearchText() throws InterruptedException
	{
		WebElement searchtext = Browsers.driver.findElement(By.xpath("//*[@id='ybar-sbq']"));
		searchtext.sendKeys("Grandel Dsouza");
		searchtext.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		searchtext.sendKeys(Keys.RETURN);
	}
}

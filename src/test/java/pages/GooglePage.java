package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GooglePage {
	
	public void EnterSearchtext() throws InterruptedException
	{
		WebElement search=Browsers.driver.findElement(By.xpath("//*[@id='APjFqb']"));
		search.sendKeys("Grandel Dsouza");
		search.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		search.sendKeys(Keys.RETURN);
	}

}

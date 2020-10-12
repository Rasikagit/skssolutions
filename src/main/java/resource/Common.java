package resource;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Common {
	
	WebDriver driver;
	private By scrollingelement= By.cssSelector("iframe#datamain");
	private By pageheading= By.xpath("//div[@class='row-1']/div[1]");
	private By contact= By.cssSelector("div.fright");
	private By header= By.cssSelector("div.row-2");
	
	
	
	
	public Common(WebDriver driver) {
		this.driver= driver;
		// TODO Auto-generated constructor stub
	}
	public void commonpresent()
	{
	  Assert.assertTrue(driver.findElement(scrollingelement).isDisplayed());
	  Assert.assertTrue(driver.findElement(pageheading).isDisplayed());
	  Assert.assertTrue(driver.findElement(contact).isDisplayed());
	  Assert.assertTrue(driver.findElement(header).isDisplayed());
	 }
	

}

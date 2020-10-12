package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollingElement {
WebDriver driver;

	
private By scrollingframe=By.tagName("iframe");
private By scrollingframeid=By.id("datamain");
private By scrollingelements=By.xpath("//div[@id='datacontainer']/p/strong/font/a");
private By scrollingelementsimage=By.xpath("//div[@id='datacontainer']/p/img");
	
	
	
	public ScrollingElement(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public List<WebElement> scrollingframe()
	{
		return driver.findElements(scrollingframe);
	}
	
	public List<WebElement> scrollingelements()
	{
		return driver.findElements(scrollingelements);
	}
	
	public List<WebElement> scrollingelementsimage()
	{
		return driver.findElements(scrollingelementsimage);
	}
}

package Pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customerspage {
	
	WebDriver driver;
	
	
	private By customertitletext=By.cssSelector("[href*=Customers]");
	private By customerbannertext=By.xpath("//div[@id='header']/div[4]");
	private By customerwelcometext=By.cssSelector("div.indent1");
	private By customerslist=By.xpath("//div[@id='content']/div/div/div[1]/div/div/div");



public Customerspage(WebDriver driver) {
	
	this.driver=driver;
	// TODO Auto-generated constructor stub
}


public WebElement Customertitletext()
{
	return driver.findElement(customertitletext);
}


public WebElement Customerbannertext()
{
	return driver.findElement(customerbannertext);
}

public WebElement Customerwelcometext()
{
	return driver.findElement(customerwelcometext);
}

public List<WebElement> CustomersList()
{
	return driver.findElements(customerslist);
}
}
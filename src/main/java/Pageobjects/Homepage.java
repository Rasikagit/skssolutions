package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	
	
	private By hometitletext= By.cssSelector("[href*='home']");
	private By homebannertext=By.xpath("//div[@id='header']/div[4]");
	private By welcometext=By.xpath("//h1[contains(text(),'Welcome to SREE KRISHNA SOLUTIONS!')]");
	
	
	
	public Homepage(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	
	
	public WebElement hometitletext()
	{
		return driver.findElement(hometitletext);
	}
	
	public WebElement homebannertext()
	{
		return driver.findElement(homebannertext);
	}
	public WebElement welcometext()
	{
		return driver.findElement(welcometext);
	}
	
	
	








	








	

}

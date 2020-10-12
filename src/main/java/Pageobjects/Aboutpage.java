package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Aboutpage {
	
	WebDriver driver;
	

	private By Abouttabtext = By.xpath("//div[@class='row-2']/ul/li[2]");
	private By Aboutbannertext= By.xpath("//div[@id='header']/div[4]/div");
	private By AboutWelcometext= By.xpath("//h2[contains(text(),'Season greetings from SREE KRISHNA SOLUTIONS.')]");
	
	
	
	public Aboutpage(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement abouttabtext()
	{
		return driver.findElement(Abouttabtext);
	}

	public WebElement aboutbannertext()
	{
		return driver.findElement(Aboutbannertext);
	}
	public WebElement aboutwelcometext()
	{
		return driver.findElement(AboutWelcometext);
	}

}

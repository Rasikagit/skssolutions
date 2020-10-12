package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.Homepage;
import resource.Common;
import resource.base;

public class Homepagetest extends base {
	
	@BeforeTest
	public void initialise() throws IOException
	{
		driver= initialisebrowser();
		driver.get(prop.getProperty("url"));
		Common entity= new Common(driver);
		entity.commonpresent();
		
	}
	
	@Test
	public void validatehomepageelementspresent() throws IOException
	{
		
		Homepage home= new Homepage(driver);
		Assert.assertTrue(home.hometitletext().isDisplayed());
		Assert.assertTrue(home.homebannertext().isDisplayed());
		Assert.assertTrue(home.welcometext().isDisplayed());
	}
	
	
	@Test
	public void Validatehomepageelementtext()
	{
		Homepage home= new Homepage(driver);
		home.hometitletext().click();
		Assert.assertTrue(home.hometitletext().getText().contains("HOME"));
		Assert.assertTrue(((home.homebannertext().getText().contains("Best & Quality"))));
		Assert.assertTrue(home.welcometext().getText().contains("Welcome"));
		//h1[contains(text(),'Welcome to SREE KRISHNA SOLUTIONS!')]
		
	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	

}

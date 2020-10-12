package Academy;

import java.io.IOException;

import org.apache.logging.log4j.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.Aboutpage;
import resource.Common;
import resource.base;

public class AboutpageTest extends base {
	
	private static Logger log= LogManager.getLogger(AboutpageTest.class.getName());
	
	@BeforeTest
	public void initialise() throws IOException
	{
		driver= initialisebrowser();
		driver.get(prop.getProperty("url"));
		Common entity= new Common(driver);
		entity.commonpresent();
		log.info("Common elements validated!!");
		
	}
	
	
	@Test
	public void Validateaboutpageelementpresent()
	{
		Aboutpage about= new Aboutpage(driver);
		about.abouttabtext().click();
		Assert.assertTrue(about.abouttabtext().isDisplayed());
		Assert.assertTrue(about.aboutbannertext().isDisplayed());
		Assert.assertTrue(about.aboutwelcometext().isDisplayed());
		log.info("aboutpage elements validated!!!");
	}
	
	
	@Test
	public void Validateaboutpageelementtext()
	{
		Aboutpage about= new Aboutpage(driver);
		about.abouttabtext().click();
		Assert.assertTrue(about.abouttabtext().getText().contains("ABOUT"));
		Assert.assertTrue(about.aboutbannertext().getText().contains("We Assure You"));
		Assert.assertTrue(about.aboutwelcometext().getText().contains("Season greetings from SREE KRISHNA SOLUTIONS."));
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	


}

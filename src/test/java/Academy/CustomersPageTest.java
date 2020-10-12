package Academy;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.Customerspage;
import resource.Common;
import resource.base;

public class CustomersPageTest extends base {
	
	
	
	
	@BeforeTest
	public void initialise() throws IOException
	{
		driver= initialisebrowser();
		driver.get(prop.getProperty("url"));
		Common entity= new Common(driver);
		entity.commonpresent();
		
	}
	
	
	@Test
	public void Validatecustomerspageelementspresent()
	{
		Customerspage customers=new Customerspage(driver);
		customers.Customertitletext().click();
		Assert.assertTrue(customers.Customertitletext().isDisplayed());
		Assert.assertTrue(customers.Customerbannertext().isDisplayed());
		Assert.assertTrue(customers.Customerwelcometext().isDisplayed());
	}
	
	@Test
	public void Validatecustomerspageelementtext()
	{
		Customerspage customers=new Customerspage(driver);
		customers.Customertitletext().click();
		Assert.assertTrue(customers.Customertitletext().getText().contains("CUSTOMERS"));
		Assert.assertTrue(customers.Customerbannertext().getText().contains("We Assure You"));
		Assert.assertTrue(customers.Customerwelcometext().getText().contains("Our customers are"));
	}
	
	
	@Test
	
	public void ValidateListofcustomers()
	{
		ArrayList<String> al= new ArrayList<String>();
		Customerspage customers=new Customerspage(driver);
		customers.Customertitletext().click();
		int numberofcustomers=customers.CustomersList().size();
		System.out.println(numberofcustomers);
		
		for(int i=0;i<numberofcustomers;i++)
		{
			String Customernames=customers.CustomersList().get(i).getText();
			al.add(Customernames);
			
			
		}
		System.out.println(al);
	}
	
	

		
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}

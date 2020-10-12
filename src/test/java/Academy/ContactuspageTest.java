package Academy;

import java.io.IOException;
import java.util.ArrayList;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.ContactusPage;

import resource.Common;
import resource.Exceldrivendata;
import resource.base;

public class ContactuspageTest extends base{
	
	@BeforeTest
	public void initialise() throws IOException
	{
		driver= initialisebrowser();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		Common entity= new Common(driver);
		entity.commonpresent();
		
	}
	
	@Test
	public void Validatecontactuspageelementstext() throws InterruptedException
	{
		ContactusPage contact= new ContactusPage(driver);
		contact.contacttitletext().click();
		Thread.sleep(3000);
		Assert.assertTrue(contact.contacttitletext().getText().contains("CONTACT US"));
		Assert.assertTrue(contact.contactbannertext().getText().contains("assistance"));
		//String contactformtitle= contact.contactformtitletext1().getText().concat(contact.contactformtitletext2().getText());
		//Assert.assertTrue(contact.contactformtitletext1().getText().concat(contact.contactformtitletext2().getText()).equalsIgnoreCase("ContactUs"));
		//Assert.assertEquals(contactformtitle, "ContactUs");
		Assert.assertTrue(contact.contactformtitletext1().isDisplayed());
		Assert.assertTrue(contact.contactformtitletext2().isDisplayed());
	}
	
	@Test
	public void Validatesendyourmessagewithoutdata()
	{
		ContactusPage contact= new ContactusPage(driver);
		contact.contacttitletext().click();
		contact.sendyourmessagetext().click();
		Assert.assertTrue(contact.errormessage().isDisplayed());
		String textcolor= contact.errormessage().getCssValue("color");
		Assert.assertEquals(textcolor,"rgba(204, 0, 0, 1)" );
		Assert.assertTrue(contact.errormessage().getText().equals("Enter Message"));
		Assert.assertTrue(contact.namefielderror().isDisplayed());
		Assert.assertTrue(contact.companyfielderror().isDisplayed());
		Assert.assertTrue(contact.designationfielderror().isDisplayed());
		Assert.assertTrue(contact.phonefielderror().isDisplayed());
		Assert.assertTrue(contact.mailfielderror().isDisplayed());
		
	}
	
	@Test
	public void Validatedataentrycontactform() throws IOException
	{
		Exceldrivendata exceldata= new Exceldrivendata(driver);
		ArrayList<String> data=exceldata.getdata("Contact2");
		System.out.println(data);
		System.out.println(data.get(1));
		ContactusPage contact= new ContactusPage(driver);
		contact.contacttitletext().click();
		Assert.assertTrue(contact.namefieldlabel().getText().equalsIgnoreCase("Name:"));
		contact.namefieldtextbox().sendKeys(data.get(0));
		Assert.assertTrue(contact.companyfieldlabel().getText().equalsIgnoreCase("Company:"));
		contact.companyfieldtextbox().sendKeys(data.get(1));
		Assert.assertTrue(contact.designationfieldlabel().getText().equalsIgnoreCase("Designation:"));
		contact.designationfieldtextbox().sendKeys(data.get(2));
		Assert.assertTrue(contact.phonefieldlabel().getText().equalsIgnoreCase("Phone:"));
		contact.phonefieldtextbox().sendKeys(data.get(3));
		Assert.assertTrue(contact.mailfieldlabel().getText().equalsIgnoreCase("Mail:"));
		contact.mailfieldtextbox().sendKeys(data.get(4));
		Assert.assertTrue(contact.enquiryfieldlabel().getText().equalsIgnoreCase("Message:"));
		contact.enquiryfieldtextbox().sendKeys(data.get(5));
		
		contact.sendyourmessagetext().click();
		
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

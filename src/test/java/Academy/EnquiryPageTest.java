package Academy;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pageobjects.EnquiryPage;
import resource.Common;
import resource.base;

public class EnquiryPageTest extends base{
	
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
	public void Validateenquirypageelementstext() throws InterruptedException
	{
		EnquiryPage enquiry= new EnquiryPage(driver);
		enquiry.enquirytitletext().click();
		Thread.sleep(3000);
		Assert.assertTrue(enquiry.enquirytitletext().getText().contains("ENQUIRY"));
		Assert.assertTrue(enquiry.enquirybannertext().getText().contains("product requirement"));
		//String enquiryformtext=enquiry.enquiryformheadertext().getText();
		//Assert.assertEquals(enquiryformtext,"Enquiry");
		Assert.assertTrue(enquiry.enquiryformheadertext().isDisplayed());
	}
	
	@Test(dataProvider="getData")
	public void ValidateEnquirysend(String Name,String Company,String Designation, String Phone, String Mail, String Enquiry)
	{
		EnquiryPage enquiry= new EnquiryPage(driver);
		enquiry.enquirytitletext().click();
		Assert.assertTrue(enquiry.namefieldlabel().getText().equalsIgnoreCase("Name:"));
		enquiry.namefieldtextbox().sendKeys(Name);
		Assert.assertTrue(enquiry.companyfieldlabel().getText().equalsIgnoreCase("Company:"));
		enquiry.companyfieldtextbox().sendKeys(Company);
		Assert.assertTrue(enquiry.designationfieldlabel().getText().equalsIgnoreCase("Designation:"));
		enquiry.designationfieldtextbox().sendKeys(Designation);
		Assert.assertTrue(enquiry.phonefieldlabel().getText().equalsIgnoreCase("Phone:"));
		enquiry.phonefieldtextbox().sendKeys(Phone);
		Assert.assertTrue(enquiry.mailfieldlabel().getText().equalsIgnoreCase("Mail:"));
		enquiry.mailfieldtextbox().sendKeys(Mail);
		Assert.assertTrue(enquiry.enquiryfieldlabel().getText().equalsIgnoreCase("Enquiry:"));
		enquiry.enquiryfieldtextbox().sendKeys(Enquiry);
		
		enquiry.sendyourenquirytext().click();
		
		
	}
	
	@Test
	public void Validatesendyourquirywithoutdata()
	{
		EnquiryPage enquiry= new EnquiryPage(driver);
		enquiry.enquirytitletext().click();
		enquiry.sendyourenquirytext().click();
		Assert.assertTrue(enquiry.errormessage().isDisplayed());
		String textcolor= enquiry.errormessage().getCssValue("color");
		Assert.assertEquals(textcolor,"rgba(204, 0, 0, 1)" );
		Assert.assertTrue(enquiry.errormessage().getText().equals("Enter Message"));
		Assert.assertTrue(enquiry.namefielderror().isDisplayed());
		Assert.assertTrue(enquiry.companyfielderror().isDisplayed());
		Assert.assertTrue(enquiry.designationfielderror().isDisplayed());
		Assert.assertTrue(enquiry.phonefielderror().isDisplayed());
		Assert.assertTrue(enquiry.mailfielderror().isDisplayed());
		
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= new Object[2][6];
		data[0][0]="Test1";
		data[0][1]="company1";
		data[0][2]="Test Manager1";
		data[0][3]="13456789";
		data[0][4]="Test1@test.com";
		data[0][5]="Regarding enquiry of test1";

		data[1][0]="Test2";
		data[1][1]="company2";
		data[1][2]="Test Manager2";
		data[1][3]="98765431";
		data[1][4]="Test2@test.com";
		data[1][5]="Regarding enquiry of test2";
		
		return data;
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	

}

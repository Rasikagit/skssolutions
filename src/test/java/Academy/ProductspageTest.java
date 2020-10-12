package Academy;

import java.io.IOException;
import java.util.ArrayList;

//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.NoSuchElementException;

import Pageobjects.ProductsPage;
import resource.Common;
import resource.base;

public class ProductspageTest extends base{
	//int productsize=0;
	//ArrayList<String> c;
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
	public void Validateproductspageelementspresent()
	{
		ProductsPage products= new ProductsPage(driver);
		products.producttitletext().click();
		Assert.assertTrue(products.producttitletext().isDisplayed());
		Assert.assertTrue(products.productbannertext().isDisplayed());
		Assert.assertTrue(products.productslisttext().isDisplayed());
		
	}
	
	@Test
	public void Validateproductspageelementstext()
	{
		ProductsPage products= new ProductsPage(driver);
		products.producttitletext().click();
		Assert.assertTrue(products.producttitletext().getText().contains("PRODUCTS"));
		Assert.assertTrue(products.productbannertext().getText().contains("We always support"));
		Assert.assertTrue(products.productslisttext().getText().contains("List of Products"));
		
	}
	
	@Test
	
  public void Validatelistofproducts()
  {     ArrayList<String> productlistal= new ArrayList<String>();
		ProductsPage products= new ProductsPage(driver);
		products.producttitletext().click();	
		int productsize=products.productslist().size();
		System.out.println(productsize);
		
		for (int i=0;i<productsize;i++)
		{
			String p=products.productslist().get(i).getText();
			productlistal.add(p);
		}
		
		System.out.println(productlistal);
		
		
  }
	
/*	@Test
	public void Validateallproductsandsubproductslink() throws InterruptedException
	{
		ProductsPage products= new ProductsPage(driver);
		products.producttitletext().click();	
		int productsize=products.getproductslistbeforeclick().size();
		
		for(int i=0;i<productsize;i++)
		{
			String product=products.getproductslistbeforeclick().get(i).getText();
			System.out.println(product);
			products.getproductslistbeforeclick().get(i).click();
			Thread.sleep(5000);
			System.out.println(products.getproductslistafterclick().size()-1);
			Assert.assertEquals(products.getproductslistafterclick().size()-1, productsize-1);
			
			for(int j=0;j<productsize-1;j++)
			{
			Assert.assertFalse(products.getproductslistafterclick().get(j).getText().contains(product));
		    }
			
			Assert.assertTrue(products.subproducttitletext().getText().contains("List of"));
			
			driver.navigate().back();
		}
		
	}*/
	
	
	@Test
	public  void ValidateConsumables() throws InterruptedException
	{
		//ArrayList<String> c=new ArrayList<String>();
		ProductsPage products= new ProductsPage(driver);
		products.producttitletext().click();
		
		//Actions a= new Actions(driver);
		//a.moveToElement(products.consumables()).click().build().perform();
		String expectedconsumablestext=products.consumables().getText();
		products.consumables().click();
		Thread.sleep(5000);
		int productsize=products.getproductslistafterclick().size();
		System.out.println(productsize);
		
		
		for(int i=0;i<productsize-1;i++)
		{
			String Actualtext=products.getproductslistafterclick().get(i).getText();
			Assert.assertNotEquals(expectedconsumablestext,Actualtext);
		}
	
		
		Assert.assertTrue(products.subproducttitletext().getText().contains("Consumable"));
		
		int subproductscount=products.subproductslist().size();
		System.out.println(subproductscount);
		
		for(int i=0;i<subproductscount;i++)
		{
			String csubproducts=products.subproductslist().get(i).getText();
			//c.add(csubproducts);
			products.subproductslist().get(i).click();
			Assert.assertTrue(products.subproductscontents().get(i).isDisplayed());
		}
		
		Assert.assertTrue(products.contactus().isDisplayed());
		products.contactus().click();
		Assert.assertTrue(driver.getCurrentUrl().contains("Enquiry"));
		
		//return c;
		
	}
  
	
	@Test
	public  void ValidateGlassware() throws InterruptedException
	{
		//ArrayList<String> g= new ArrayList<String>();
		ProductsPage products= new ProductsPage(driver);
		products.producttitletext().click();
		
		//Actions a= new Actions(driver);
		//a.moveToElement(products.consumables()).click().build().perform();
		String expectedconsumablestext=products.glassware().getText();
		products.glassware().click();
		Thread.sleep(5000);
		int productsize=products.getproductslistafterclick().size();
		System.out.println(productsize);
		
		
		for(int i=0;i<productsize-1;i++)
		{
			String Actualtext=products.getproductslistafterclick().get(i).getText();
			Assert.assertNotEquals(expectedconsumablestext,Actualtext);
		}
	
		
		Assert.assertTrue(products.subproducttitletext().getText().contains("Glassware"));
		
		int subproductscount=products.subproductslist().size();
		System.out.println(subproductscount);
		
		for(int i=0;i<subproductscount;i++)
		{
			String gsubproducts=products.subproductslist().get(i).getText();
			//c.add(gsubproducts);
			products.subproductslist().get(i).click();
			Assert.assertTrue(products.subproductscontents().get(i).isDisplayed());
		}
		
		
		Assert.assertTrue(products.contactus().isDisplayed());
		products.contactus().click();
		Assert.assertTrue(driver.getCurrentUrl().contains("Enquiry"));
		
		//return g;
	}
	
	
	@Test
	public  void ValidateEquipment() throws InterruptedException
	{
		//ArrayList<String> e=new ArrayList<String>();
		ProductsPage products= new ProductsPage(driver);
		products.producttitletext().click();
		
		//Actions a= new Actions(driver);
		//a.moveToElement(products.consumables()).click().build().perform();
		String expectedconsumablestext=products.equipment().getText();
		products.equipment().click();
		Thread.sleep(5000);
		int productsize=products.getproductslistafterclick().size();
		System.out.println(productsize);
		
		
		for(int i=0;i<productsize-1;i++)
		{
			String Actualtext=products.getproductslistafterclick().get(i).getText();
			Assert.assertNotEquals(expectedconsumablestext,Actualtext);
		}
	
		
		Assert.assertTrue(products.subproducttitletext().getText().contains("Equipment"));
		
		int subproductscount=products.subproductslist().size();
		System.out.println(subproductscount);
		
		for(int i=0;i<subproductscount;i++)
		{
			String esubproducts=products.subproductslist().get(i).getText();
			//c.add(esubproducts);
			products.subproductslist().get(i).click();
			Assert.assertTrue(products.subproductscontents().get(i).isDisplayed());
		}
		
		Assert.assertTrue(products.contactus().isDisplayed());
		products.contactus().click();
		Assert.assertTrue(driver.getCurrentUrl().contains("Enquiry"));
		
		//return e;
		
	}
	
	@Test
	public  void ValidateSurgicals() throws InterruptedException
	{
		//ArrayList<String> s= new ArrayList<String>();
		ProductsPage products= new ProductsPage(driver);
		products.producttitletext().click();
		
		//Actions a= new Actions(driver);
		//a.moveToElement(products.consumables()).click().build().perform();
		String expectedconsumablestext=products.surgical().getText();
		products.surgical().click();
		Thread.sleep(5000);
		int productsize=products.getproductslistafterclick().size();
		System.out.println(productsize);
		
		
		for(int i=0;i<productsize-1;i++)
		{
			String Actualtext=products.getproductslistafterclick().get(i).getText();
			Assert.assertNotEquals(expectedconsumablestext,Actualtext);
		}
	
		
		Assert.assertTrue(products.subproducttitletext().getText().contains("Surgical"));
		
		int subproductscount=products.subproductslist().size();
		System.out.println(subproductscount);
		
		for(int i=0;i<subproductscount;i++)
		{
			String ssubproducts= products.subproductslist().get(i).getText();
			//c.add(ssubproducts);
			products.subproductslist().get(i).click();
			Assert.assertTrue(products.subproductscontents().get(i).isDisplayed());
		}
		
		Assert.assertTrue(products.contactus().isDisplayed());
		products.contactus().click();
		Assert.assertTrue(driver.getCurrentUrl().contains("Enquiry"));
		
		//return s;
		
	}
  
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
  
  

}

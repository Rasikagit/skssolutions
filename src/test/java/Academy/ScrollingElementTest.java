package Academy;

import java.io.IOException;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pageobjects.ProductsPage;
import Pageobjects.ScrollingElement;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
//import junit.framework.Assert;
import org.testng.Assert;
import resource.Common;
import resource.base;

public class ScrollingElementTest extends base {
	
	@BeforeTest
	public void initialise() throws IOException, InterruptedException
	{
		driver= initialisebrowser();
		driver.get(prop.getProperty("url"));
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.tagName("iframe"))).build().perform();
		Thread.sleep(10000);
		
		//driver.manage().window().maximize();
		Common entity= new Common(driver);
		entity.commonpresent();
		
		
	}
	
	@Test
	public void ValidateScrollingElement() throws InterruptedException
	{
		List<String> expectedPList= new ArrayList<String>();
		ProductsPage products= new ProductsPage(driver);
		expectedPList=products.expectedproductslist();
		int size=expectedPList.size();
		System.out.println(size);
		/*for(int i=0;i<size;i++)
		{
			String eproducts=products.expectedproductslist().get(i);
			expectedPList.add(eproducts);
		}*/
		System.out.println(expectedPList);
		List<String> finallist= new ArrayList<String>();
		ScrollingElement scroll=new ScrollingElement(driver);
		int framescount=scroll.scrollingframe().size();
		System.out.println(framescount);
		driver.switchTo().frame("datamain");
		int Scrollelementssize=scroll.scrollingelements().size();
		System.out.println(Scrollelementssize);
		for (int i=0;i<Scrollelementssize;i++)
		{
			
			String scrollelementtext=scroll.scrollingelements().get(i).getText();
			scrollelementtext.trim();
			System.out.println(scrollelementtext);
			//Assert.assertTrue((scroll.scrollingelementsimage().get(i).isDisplayed()));
			if(scrollelementtext!=null)
			{
				finallist.add(scrollelementtext);
			}
			
			
			
		}
		System.out.println(finallist);
		System.out.println(expectedPList);
		
		if(finallist.size()==expectedPList.size())
		{
		if(finallist.containsAll(expectedPList))
		{
			System.out.println("scrolling element validated!!");
		}
		else
		{
			finallist.removeAll(expectedPList);
			System.out.println(finallist);
			Assert.assertTrue(false);
		}
		
		
		}
		
		
		
		
	}
	
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}

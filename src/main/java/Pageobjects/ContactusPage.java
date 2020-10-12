package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactusPage {
	
	WebDriver driver;
	
	private By contacttitletext=By.xpath("//div[@class='row-2']/ul/li[6]");
	private By contactbannertext= By.xpath("//div[@id='header']/div[4]");
	private By contactformtitletext1=By.xpath("//div[@class='indent']/h3/cufon[1]");
	private By contactformtitletext2=By.xpath("//div[@class='indent']/h3/cufon[2]");
	private By namefieldtextbox=By.id("txtName");
	private By namefieldlabel=By.xpath("//div[@class='indent']/form/fieldset/div[1]");
	private By namefielderror=By.id("RequiredFieldValidator1");
	private By companyfieldtextbox=By.cssSelector("#txtCompany");
	private By companyfieldlabel=By.xpath("//div[@class='indent']/form/fieldset/div[2]");
	private By companyfielderror=By.id("RequiredFieldValidator2");
	private By designationfieldtextbox=By.id("txtDesignation");
	private By designationfieldlabel=By.xpath("//div[@class='indent']/form/fieldset/div[3]");
	private By designationfielderror=By.id("RequiredFieldValidator3");
	private By phonefieldtextbox=By.id("txtPhone");
	private By phonefieldlabel= By.xpath("//div[@class='indent']/form/fieldset/div[4]");
	private By phonefielderror=By.id("RequiredFieldValidator4");
	private By mailfieldtextbox=By.id("txtMail");
	private By mailfieldlabel= By.xpath("//div[@class='indent']/form/fieldset/div[5]");
	private By mailfielderror=By.id("RequiredFieldValidator5");
	private By enquiryfieldtextbox=By.id("txtMessage");
	private By enquiryfieldlabel=By.xpath("//div[@class='indent']/form/fieldset/div[6]");
	private By enquiryfielderror=By.id("RequiredFieldValidator6");
	private By errormessage=By.id("RequiredFieldValidator6");
	private By sendyourmessagetext=By.xpath("//a[@id='btnSend']");

	
	public ContactusPage(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement contacttitletext()
	{
		return driver.findElement(contacttitletext);
	}
	
	public WebElement contactbannertext()
	{
		return driver.findElement(contactbannertext);
	}
	public WebElement contactformtitletext1()
	{
		return driver.findElement(contactformtitletext1);
	}
	public WebElement contactformtitletext2()
	{
		return driver.findElement(contactformtitletext2);
	}
	public WebElement sendyourmessagetext()
	{
		return driver.findElement(sendyourmessagetext);
	}
	
	public WebElement namefieldtextbox()
	{
		return driver.findElement(namefieldtextbox);
	}
	
	public WebElement namefieldlabel()
	{
		return driver.findElement(namefieldlabel);
	}
	
	public WebElement namefielderror()
	{
		return driver.findElement(namefielderror);
	}
	
	public WebElement companyfieldtextbox()
	{
		return driver.findElement(companyfieldtextbox);
	}
	
	public WebElement companyfieldlabel()
	{
		return driver.findElement(companyfieldlabel);
	}
	
	public WebElement companyfielderror()
	{
		return driver.findElement(companyfielderror);
	}
	public WebElement designationfieldtextbox()
	{
		return driver.findElement(designationfieldtextbox);
	}
	
	public WebElement designationfieldlabel()
	{
		return driver.findElement(designationfieldlabel);
	}
	
	public WebElement designationfielderror()
	{
		return driver.findElement(designationfielderror);
	}
	
	public WebElement phonefieldtextbox()
	{
		return driver.findElement(phonefieldtextbox);
	}
	
	public WebElement phonefieldlabel()
	{
		return driver.findElement(phonefieldlabel);
	}
	
	public WebElement phonefielderror()
	{
		return driver.findElement(phonefielderror);
	}
	
	public WebElement mailfieldtextbox()
	{
		return driver.findElement(mailfieldtextbox);
	}
	
	public WebElement mailfieldlabel()
	{
		return driver.findElement(mailfieldlabel);
	}
	
	public WebElement mailfielderror()
	{
		return driver.findElement(mailfielderror);
	}
	
	public WebElement enquiryfieldtextbox()
	{
		return driver.findElement(enquiryfieldtextbox);
	}
	
	public WebElement enquiryfieldlabel()
	{
		return driver.findElement(enquiryfieldlabel);
	}
	public WebElement enquiryfielderror()
	{
		return driver.findElement(enquiryfielderror);
	}
	
	public WebElement errormessage()
	{
		return driver.findElement(errormessage);
	}
	
}

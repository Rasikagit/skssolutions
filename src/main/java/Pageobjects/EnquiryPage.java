package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnquiryPage {
	
	WebDriver driver;
	
	private By enquirytitletext=By.xpath("//div[@class='row-2']/ul/li[5]");
	private By enquirybannertext=By.xpath("//div[@id='header']/div[4]");
	//By enquiryformheadertext=By.xpath("//cufontext[contains(text(),'Enquiry')]");
	private By enquiryformheadertext=By.xpath("//div[@class='indent']/h3/cufon");
	private By sendyourenquirytext=By.xpath("//a[@id='btnSend']");
	private By namefieldtextbox=By.id("txtName");
	private By namefieldlabel=By.xpath("//fieldset[@id='Fieldset1']/div[1]/label");
	private By namefielderror=By.id("RequiredFieldValidator1");
	private By companyfieldtextbox=By.cssSelector("#txtCompany");
	private By companyfieldlabel=By.xpath("//fieldset[@id='Fieldset1']/div[2]/label");
	private By companyfielderror=By.id("RequiredFieldValidator2");
	private By designationfieldtextbox=By.id("txtDesignation");
	private By designationfieldlabel=By.xpath("//fieldset[@id='Fieldset1']/div[3]/label");
	private By designationfielderror=By.id("RequiredFieldValidator3");
	private By phonefieldtextbox=By.id("txtPhone");
	private By phonefieldlabel= By.xpath("//fieldset[@id='Fieldset1']/div[4]/label");
	private By phonefielderror=By.id("RequiredFieldValidator4");
	private By mailfieldtextbox=By.id("txtMail");
	private By mailfieldlabel= By.xpath("//fieldset[@id='Fieldset1']/div[5]/label");
	private By mailfielderror=By.id("RequiredFieldValidator5");
	private By enquiryfieldtextbox=By.id("txtMessage");
	private By enquiryfieldlabel=By.xpath("//fieldset[@id='Fieldset1']/div[6]/label");
	By enquiryfielderror=By.id("RequiredFieldValidator6");
	By errormessage=By.id("RequiredFieldValidator6");
	
	
	public EnquiryPage(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement enquirytitletext()
	{
		return driver.findElement(enquirytitletext);
	}
	
	public WebElement enquirybannertext()
	{
		return driver.findElement(enquirybannertext);
	}
	
	public WebElement enquiryformheadertext()
	{
		return driver.findElement(enquiryformheadertext);
	}
	
	public WebElement sendyourenquirytext()
	{
		return driver.findElement(sendyourenquirytext);
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
	

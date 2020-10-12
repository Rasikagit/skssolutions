package Pageobjects;

//import java.lang.reflect.Array;
//import java.util.ArrayList;
import java.util.Arrays;

//import static org.openqa.selenium.support.locators.RelativeLocator.withTagname;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	
	
	public WebDriver driver;
	
	
//By productstitletext=By.cssSelector("[href*='services']");
//By productstitletext=By.linkText("Products");
	private By productstitletext=By.xpath("//div[@class='row-2']/ul/li[3]");
	private By productbannertext=By.xpath("//div[@id='header']/div[4]");
	private By productslisttext=By.xpath("//span[contains(text(),'List of Products:')]");
	private By productscolumn= By.className("indent");
	private By productlinks= By.tagName("a");
	private By productslist=By.xpath("//div[@id='content']/div[2]/div/div/div/div/a");
	private By productssectionbeforeclick=By.cssSelector("div.col-1");
	private By productssectionafterclick=By.xpath("//div[@class='col-1']/div");
	private By subproducts=By.xpath("//div[@id='basic-accordian']/div/div");
	private By subproducttitle=By.xpath("//div[@class='indent']/h2/span");
//By consumables=By.cssSelector("[href*='Consumables']");
//By consumables=By.linkText("Consumables");
	private By consumablesbeforeclick=By.xpath("//div[@id='content'] /div[2]/div/div/div/div[1]");
	private By consumables=By.xpath("//a[contains(text(),'Consumables')]");
	private By glassware=By.xpath("//a[contains(text(),'Glassware')]");
	private By equipment=By.xpath("//a[contains(text(),'Equipment')]");
	private By surgicals=By.xpath("//a[contains(text(),'Surgical & Safety')]");
	private By subproductscommon=By.cssSelector("div.accordion_headings");
	private By subproductcontentcommon=By.cssSelector("[id*='content']");
	private By subproductsblock=By.id("basic-accordian");
	private By contactus=By.linkText("contact us");


public ProductsPage(WebDriver driver) {
	
	this.driver=driver;
	// TODO Auto-generated constructor stub
}


public WebElement producttitletext()
{
	return driver.findElement(productstitletext);
}

public WebElement productbannertext()
{
	return driver.findElement(productbannertext);
}
public WebElement productslisttext()
{

return driver.findElement(productslisttext);
}

public List<WebElement> productslist()
{
	return driver.findElements(productslist);
}

public List<WebElement> getproductslistbeforeclick()
{
	WebElement psection=driver.findElement(productssectionbeforeclick);
	List<WebElement>plinks= psection.findElements(productlinks);
	return plinks;
	
}

public List<WebElement> getproductslistafterclick()
{
	return driver.findElements(productssectionafterclick);
}



public List<WebElement> getsubproductslist()
{
	return driver.findElements(subproducts);
}

public WebElement subproducttitletext()
{
	return driver.findElement(subproducttitle);
}

public WebElement consumablesbeforeclick()
{
	return driver.findElement(consumablesbeforeclick);
}
public WebElement glassware()
{
	return driver.findElement(glassware);
}

public WebElement equipment()
{
	return driver.findElement(equipment);
}

public WebElement surgical()
{
	return driver.findElement(surgicals);
}

public List<WebElement> subproductslist()
{
	return driver.findElements(subproductscommon);
}

public WebElement subproductscontent()
{
	return driver.findElement(subproductcontentcommon);
}

public List<WebElement> subproductscontents()
{
	WebElement subpsection=driver.findElement(subproductsblock);
	List<WebElement>subpcontents= subpsection.findElements(subproductcontentcommon);
	return subpcontents;
	
}

public WebElement consumables()
{
	return driver.findElement(consumables);
}

public WebElement contactus()
{
	return driver.findElement(contactus);
}

public List<String> expectedproductslist()
{
	 // String[] expectedProductsList1 = {"HPLC crimp cap & septa","HPLC Crimp top vials"," HPLC Screw top vials"," GC aluminum cap & Silicone/PTFE septa"," 20ml GC Crimp top vial"," HPLC Columns"," GC Columns"," Membrane filters"," Syringe filters"," SCDA readymade media plates"," Micro pipettes"," Multi channel pipettes"," Pipette tips"," Micro tps"," Glass inserts"," FB & Conical"," Centrifuge tubes"," PCR tubes"," Transport swab"," Pipette tips (Pyrogen free)"," Cryo vials"," 22mm cap & septa"," 40 & 60ml screw vials/containers"," TOC consumables (Cap, septa & vials)"," 96 well plates"," 90mm petri dish plates"," sterile"," Serological pipettes"," Magnetic Filter funnels"," 100ml micro filter funnel","Cotton swabs","sterile","Aluminum foil rols","Glass rods","PP vials","PP beakers","Test tubes - glass & PP","Test tubes with screw cap closed neck","Glass inserts","FB & Conical","Micro slides", "Schott type-1 clear glass vials. 5ml", "10ml & 20ml (Sample vials)", "Petri dish plates", "sterile (Glass)", "Glass Filter funnels", "Amber glass bottles", "Glass rods", ">Mortar & pestles", "Fisher scientific glassware products", "Conical flasks", "Volumetric flasks", "Glass bottles (100, 200, 250, 500ml, 1ltr, 5ltr, 10ltr & 20ltr)", "Crimpers", "De-crimpers", "Weighing balances"," Manifolds (SS)", "Vacuum pump", "Spun filter cartridges", "Surgical gloves (Sterile/non sterile, powder/powder free)", "Nitrile gloves (Non sterile, powder/powder free)", "Safety products (Face, nose mask, head cap, shoe covers & ear plugs)", "Acid", "cut", "chemical resistant & electric proof gloves"};
	//String[] expectedProductsList1 ={"HPLC crimp cap & septa", "HPLC Crimp top vials", "HPLC Screw top vials", "GC aluminum cap & Silicone/PTFE septa", "20ml GC Crimp top vial", "HPLC Columns", "GC Columns", "Membrane filters", "Syringe filters", "SCDA readymade media plates", "Micro pipettes", "Multi channel pipettes", "Pipette tips", "Micro tps", "Glass inserts", "FB & Conical", "Centrifuge tubes", "PCR tubes", "Transport swab", "Pipette tips (Pyrogen free)", "Cryo vials", "22mm cap & septa", "40 & 60ml screw vials/containers", "TOC consumables (Cap, septa & vials)", "96 well plates", "90mm petri dish plates", "sterile", "Serological pipettes", "Magnetic Filter funnels", "100ml micro filter funnel", "Cotton swabs", "sterile", "Aluminum foil rols", "Glass rods", "PP vials", "PP beakers", "Test tubes - glass & PP", "Test tubes with screw cap closed neck", "Glass inserts", "FB & Conical", "Micro slides", "Schott type-1 clear glass vials. 5ml", "10ml & 20ml (Sample vials)", "Petri dish plates", "sterile (Glass)", "Glass Filter funnels", "Amber glass bottles", "Glass rods", ">Mortar & pestles", "Fisher scientific glassware products", "Conical flasks", "Volumetric flasks", "Glass bottles (100, 200, 250, 500ml, 1ltr, 5ltr, 10ltr & 20ltr)", "Crimpers", "De-crimpers", "Weighing balances", "Manifolds (SS)", "Vacuum pump", "Spun filter cartridges", "Surgical gloves (Sterile/non sterile, powder/powder free)", "Nitrile gloves (Non sterile, powder/powder free)", "Safety products (Face, nose mask, head cap, shoe covers & ear plugs)", "Acid", "cut", "chemical resistant & electric proof gloves"};   
	String[] expectedProductsList1={"HPLC cap & septa", "HPLC crimp cap & septa", "HPLC Crimp top vials", "HPLC Screw top vials", "GC aluminum cap & Silicone/PTFE septa", "20ml GC Crimp top vial", "HPLC Columns", "GC Columns", "Membrane filters", "Syringe filters", "SCDA readymade media plates", "Micro pipettes", "Multi channel pipettes", "Pipette tips", "Micro tps", "Glass inserts, FB & Conical", "Centrifuge tubes", "PCR tubes", "Transport swab", "Pipette tips (Pyrogen free)", "Cryo vials", "22mm cap & septa", "40 & 60ml screw vials/containers", "TOC consumables (Cap, septa & vials)", "96 well plates", "90mm petri dish plates, sterile", "Serological pipettes", "Magnetic Filter funnels", "100ml micro filter funnel", "Cotton swabs, sterile", "Aluminum foil rols", "Glass rods", "PP vials", "PP beakers", "Test tubes - glass & PP", "Test tubes with screw cap closed neck", "Glass inserts, FB & Conical", "Micro slides", "Schott type-1 clear glass vials. 5ml, 10ml & 20ml (Sample vials)", "Petri dish plates, sterile (Glass)", "Glass Filter funnels", "Amber glass bottles", "Glass rods", ">Mortar & pestles", "Fisher scientific glassware products", "Conical flasks", "Volumetric flasks", "Glass bottles (100, 200, 250, 500ml, 1ltr, 5ltr, 10ltr & 20ltr)", "Crimpers", "De-crimpers", "Weighing balances", "Manifolds (SS)", "Vacuum pump", "Spun filter cartridges", "Surgical gloves (Sterile/non sterile, powder/powder free)", "Nitrile gloves (Non sterile, powder/powder free)", "Safety products (Face, nose mask, head cap, shoe covers & ear plugs)", "Acid, cut, chemical resistant & electric proof gloves"};
	List<String> expectedProductsList2 =  Arrays.asList(expectedProductsList1);
	return expectedProductsList2;
}


}

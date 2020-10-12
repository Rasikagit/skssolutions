package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.google.j2objc.annotations.Property;

public class base {
	
	
public static WebDriver driver;
public Properties prop;
public String projectpath;
	public WebDriver initialisebrowser() throws IOException
	{
		 prop = new Properties();
		 projectpath= System.getProperty("user.dir");
		FileInputStream fis= new FileInputStream(projectpath+"\\src\\main\\java\\resource\\data.properties");
		prop.load(fis);
		//String browsername=prop.getProperty("Browser");
		String browsername=System.getProperty("browser");
		//prop.getProperty("url");
		
		if (browsername.contains("chrome"))
		{
			//String projectPath = System.getProperty("user.dir");	
			ChromeOptions options= new ChromeOptions();
			if(browsername.contains("headless"))
			{
			options.addArguments("browser");
			}
			System.setProperty("webdriver.chrome.driver",projectpath+"/src/main/java/Drivers/chromedriver.exe");
			 driver=new ChromeDriver(options);
			
		}
		
		else if (browsername.equals("firefox"))
		{
			//String projectPath = System.getProperty("user.dir");	
			System.setProperty("webdriver.gecko.driver",projectpath+"/src/main/java/Drivers/geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		
		else if (browsername.equals("IE"))
		{
			/*String projectPath = System.getProperty("user.dir");	
			System.setProperty("webdriver.chrome.driver",projectPath+"/src/Drivers/chromedriver.exe");
			 driver=new InternetExplorerDriver();*/
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
				
	}
	
	public String getscreenshotPath(String testcasename, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationfile= System.getProperty("user.dir"+"\\reports\\"+testcasename+ ".png");
		FileUtils.copyFile(source, new File(destinationfile));
		return destinationfile;
	}

}

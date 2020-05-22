package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//THIS IS THE MAIN BASE CREATED THAT DID NOT WORKED DUE TO DRIVER SCOPE ISSUE
public class base {
	
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException, InterruptedException
	{
		WebDriver driver;
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Shivanshu\\eclipse-workspace\\QAclick\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(prop.getProperty("browser"));
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\New files\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			Thread.sleep(2000);
			
		}
	/*
		else(browserName=="firefox")
		{
			//code for firefox browser
		}
		elseif
		{
			//code for IE browser
		}
	*/
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return null;
	
	
	
	}

}

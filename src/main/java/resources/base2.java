package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base2 {
	
	public Properties prop;
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException, InterruptedException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Shivanshu\\eclipse-workspace\\QAclick\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println("Browser is :" +prop.getProperty("browser"));
		
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\New files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			Thread.sleep(1000);
			return driver;
			
		}
	
/*	public void getscreenshot(WebDriver driver) throws IOException 
	{
		TakesScreenshot ts= (TakesScreenshot) driver;
		//File source is virtual location of screenshot in system
		//
		File source=ts.getScreenshotAs(OutputType.FILE);
		//
		//String desFile=System.getProperty("user.dir"+"\\reports\\"+tcname+".png");
		FileUtils.copyFile(source, new File("E:\\Screenshots\\screen.png"));
	}*/
	}


package QAClick;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base2;

public class ValidateTitle extends base2{
	public static Logger log=LogManager.getFormatterLogger(base2.class.getName());
@Test
	public void TittleCheck() throws IOException, InterruptedException
	{
		WebDriver driver = initializeDriver();
		log.info("Driver is initialised");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to URL");
		Thread.sleep(10000);
		//	LandingPage lp2=new LandingPage(driver);
		LandingPage vnb=new LandingPage(driver);
		System.out.println(vnb.Checktitle().getText());
		Assert.assertEquals(vnb.Checktitle().getText(), "FEATURED COURSES");
		log.info("Successfully Validated: FEATURED COURSES link ");
		log.error("FEATURED COURSES link not present");
		driver.close();
		
		
}}

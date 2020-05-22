package QAClick;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base2;

public class ValidateNavigationBar extends base2{
	public static Logger log=LogManager.getFormatterLogger(base2.class.getName());

	
	@Test
	public void NavigationToContact() throws IOException, InterruptedException
	{
		WebDriver driver = initializeDriver();
		log.info("Driver is initialised");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to URL");
		Thread.sleep(10000);
		LandingPage vnb=new LandingPage(driver);
		Assert.assertTrue(vnb.Contacttag().isDisplayed());
		//Assert.assertFalse(object); this is used for false cases
		//below step to check assertion boolean value in console
		System.out.println(vnb.Contacttag().isDisplayed());
		log.info("Successfully Validated Contact link");
		log.error(" Not Validated Contact link");
		driver.close();
		
	}

}

package QAClick;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base2;

public class LoginFunctionality extends base2{
public static Logger log=LogManager.getFormatterLogger(base2.class.getName());

	@Test(dataProvider="getdata")
	public void LoginToPage(String Username, String Password, String text) throws IOException, InterruptedException
	{
		WebDriver driver = initializeDriver();
		log.info("Driver is initialised");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to URL");
		Thread.sleep(10000);
		LandingPage lp =new LandingPage(driver);
		lp.dologin().click();
		log.info("Clicked in login link");
		LoginPage lgp=new LoginPage(driver);
		lgp.inputEmailID().sendKeys(Username);
		log.info("Email ID input Succesfully");
		
		lgp.inputPassword().sendKeys(Password);
		log.info("Password input Succesfully");
		
		System.out.println(text);
		lgp.ButtonSubmit().click();
		log.info("User Succesfully logged in");
		
		driver.close();
		
	
	}
@DataProvider
//Used to provide data in Test Cases in form of array
// object[x][y] ---> object[2][3] >>>>> x means rows, y means colunm HENCE [2][3] = 2 rows and 3 colunm data  
	public Object[][] getdata() 
	{
	Object[][] data=new Object[2][3];
	// First row data
	data[0][0]="user1@test.com";
	data[0][1]="12345";
	data[0][2]="valid user";
	// Second row data
	data[1][0]="user2@test.com";
	data[1][1]="6789";
	data[1][2]="Invalid user";

	return data;
	}
	
//Hinder twice chrome open and two TC will be counted
}

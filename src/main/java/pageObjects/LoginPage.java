package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}	
	public WebDriver driver;
	
	By emailinput=By.id("user_email");
	By passwordinput=By.id("user_password");
	By submitbutton=By.cssSelector("input[value='Log In']");

public WebElement inputEmailID()
{
	return driver.findElement(emailinput);
}
public WebElement inputPassword()
{
	return driver.findElement(passwordinput);
}
public WebElement ButtonSubmit()
{
	return driver.findElement(submitbutton);
}
}
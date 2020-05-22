package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}	
	public WebDriver driver;
	
	By signin=By.cssSelector("a[href='http://qaclickacademy.usefedora.com/sign_in']");
	By coursetitle=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By contactLink=By.xpath("//a[contains(text(),'Contact')]");

public WebElement dologin()
{
	return driver.findElement(signin);
}
public WebElement Checktitle()
{
	return driver.findElement(coursetitle);
}
public WebElement Contacttag()
{
	return driver.findElement(contactLink);
}

}
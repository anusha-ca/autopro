
package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"login2\"]")
	WebElement login;
	
	@FindBy(id="loginusername")
	WebElement Username;
	
	@FindBy(xpath="//*[@id=\"loginpassword\"]")
	WebElement Password;
	
	@FindBy(xpath="//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")
	WebElement Sumbit;
	public Loginpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	public void Signin()
	{ 
		login.click();
	}
	public void setValues (String name , String Pass) throws Exception
	{
		System.out.println("setvalues");
		Thread.sleep(500);
		Username.clear();
		Username.sendKeys(name);
		Password.clear();
		Password.sendKeys(Pass);
		
	}
  public void loginbutton()
   {
	  Sumbit.click();
   }
}

package pagepkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")
	WebElement phone;
	
	@FindBy(xpath="//*[@id=\"tbodyid\"]/div[2]/div/a")
	WebElement addtocart;
	
	public Addtocart (WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	   
	public void phoneclick() throws Exception
	{
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		phone.click();
	}
	public void addtocart() 
	{
        
		addtocart.click();	
		driver.navigate().back();
	
		 
	}
	public void alerthandle() 
	{
		
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("Alerttext="+alerttext);
		a.accept();
	}

	
	}
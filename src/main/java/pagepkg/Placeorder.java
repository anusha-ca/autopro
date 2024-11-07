
package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Placeorder {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"cartur\"]")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div/div[2]/button")
	WebElement placeorder;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/input")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"country\"]")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	
	@FindBy(xpath="//*[@id=\"card\"]")
	WebElement creditcard;
	
	@FindBy(xpath=("//*[@id=\"month\"]"))
	WebElement month;
	
	@FindBy(xpath="//*[@id=\"year\"]")
	WebElement year;
	
	@FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
    WebElement purchase;
		
	@FindBy(xpath="/html/body/div[10]/div[7]/div/button")
	WebElement okaybutton;
	
	public Placeorder (WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	public void cartclick() 
	{
		
		cart.click();
	}
    public void placeorderclick() throws Exception
    
    {
    	Thread.sleep(2000);
    	placeorder.click();
    }
    public void setValues(String Name ,String Country ,String City , String Creditcard ,String Month ,String Year)
    {
    	name.sendKeys(Name);
    	country.sendKeys(Country);
    	city.sendKeys(City);
    	creditcard.sendKeys(Creditcard);
    	month.sendKeys(Month);
    	year.sendKeys(Year);
    }
    public void purchaseclick()
    {
    	purchase.click();
    }
    public void okayclick()
    {
    	okaybutton.click();
    }
    }
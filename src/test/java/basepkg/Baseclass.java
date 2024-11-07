package basepkg;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Baseclass {
	 
		public static WebDriver driver;
		@BeforeTest
		public void setUp()
		{
			driver=new ChromeDriver();
		}
		@Test
		public void test()
		{
			driver.get("https://parabank.parasoft.com/parabank/index.htm");
			driver.manage().window().maximize();	
		}
		
	}



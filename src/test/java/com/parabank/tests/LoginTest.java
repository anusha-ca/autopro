package com.parabank.tests;
import com.parabank.pages.LoginPage;
//import com.parabank.pages.AccountPage;
//import com.parabank.utils.ExcelUtil;
//import com.parabank.utils.ScreenshotUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class LoginTest {
	 WebDriver driver;
	    LoginPage loginPage;
	    AccountPage accountPage;

	    @BeforeClass
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://parabank.parasoft.com/parabank/index.htm");
	        loginPage = new LoginPage(driver);
	        accountPage = new AccountPage(driver);
	    }

	    @Test(dataProvider = "loginData")
	    public void testLogin(String username, String password) {
	        loginPage.login(username, password);
	        String welcomeText = accountPage.getWelcomeMessage();
	        Assert.assertEquals(welcomeText, "Welcome Test User!");
	    }

	    @DataProvider(name = "loginData")
	    public Object[][] getLoginData() throws IOException {
	        return ExcelUtil.getTestData("LoginData");
	    }

	    @AfterMethod
	    public void captureScreenshotOnFailure(ITestResult result) {
	        if (!result.isSuccess()) {
	            ScreenshotUtil.captureScreenshot(driver, result.getName());
	        }
	    }

	    @AfterClass
	    public void teardown() {
	        driver.quit();
	    }
	}


}

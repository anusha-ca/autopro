package com.parabank.pages;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
public class ScreenshotUtil {
	 public static void captureScreenshot(WebDriver driver, String screenshotName) {
	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        try {
	            FileUtils.copyFile(srcFile, new File("screenshots/" + screenshotName + ".png"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}



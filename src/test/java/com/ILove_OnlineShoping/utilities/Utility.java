package com.ILove_OnlineShoping.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
public static void takes_Screenshot(WebDriver driver,String screenshot_Name) {
	try {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshots"+screenshot_Name+".png");
        FileUtils.copyFile(source, destination);
        System.out.println("screenshot taken:");
	} catch (Exception e) {
		System.out.println("exception while taking screenshot:"+e.getMessage());
	}
}
}

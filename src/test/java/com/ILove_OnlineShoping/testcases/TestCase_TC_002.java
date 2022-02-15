package com.ILove_OnlineShoping.testcases;

import java.io.File;
import java.io.IOException;

import javax.swing.text.Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ILove_OnlineShoping.pageobjectmodel.Add_To_Cart;
import com.ILove_OnlineShoping.pageobjectmodel.Login;
import com.ILove_OnlineShoping.utilities.Utility;



public class TestCase_TC_002 extends BaseClass {
	@Test
	public void Test_Run() throws InterruptedException, IOException
	{
		Login l= new Login(driver);
		l.setUserName(userName);
		Thread.sleep(2000);
		l.setPassword(Password);
		Thread.sleep(2000);
		l.submit_Login();
		Thread.sleep(3000);
		Add_To_Cart a = new Add_To_Cart(driver);
		a.MouseOver_OnFashion();
		Thread.sleep(2000);
		a.clickOn_MenFootWear();
		Thread.sleep(2000);
		a.clickon_LikedProduct();
		Thread.sleep(2000);
		a.clickOn_AddToCart();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("./Screenshots/screenshot.png");
		FileUtils.copyFile(source, destination);
	}
	@AfterMethod
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.takes_Screenshot(driver, result.getName());
		}

		driver.close();
	}
}

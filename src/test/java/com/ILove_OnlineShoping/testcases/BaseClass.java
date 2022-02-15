package com.ILove_OnlineShoping.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseURL="https://www.flipkart.com/";
	public String userName="6302707546";
	public String Password="Flipkart@1234";
	public static WebDriver driver;



	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{		

		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equals("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		driver.get(baseURL);
	}

	@AfterClass
	public void tearDown()
	{
	//	driver.quit();
	}
}

package com.ILove_OnlineShoping.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver idriver;
	public  Login(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement txtuserName;

	@FindBy(xpath = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")
	WebElement txtPassword;

	@FindBy(xpath = "(//span[text()='Login'])[2]")
	WebElement click_Login;

	public void setUserName(String username)
	{
		txtuserName.sendKeys(username);
	}
	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	public void submit_Login()
	{
		click_Login.click();
	}
}

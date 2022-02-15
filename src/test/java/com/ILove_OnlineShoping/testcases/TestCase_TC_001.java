package com.ILove_OnlineShoping.testcases;

import org.testng.annotations.Test;

import com.ILove_OnlineShoping.pageobjectmodel.Login;

public class TestCase_TC_001 extends BaseClass{
	@Test

	public void test_Login() throws InterruptedException
	{
		Login l= new Login(driver);
		l.setUserName(userName);
		Thread.sleep(3000);
		l.setPassword(Password);
		Thread.sleep(3000);
		l.submit_Login();
	}
}

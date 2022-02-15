package com.ILove_OnlineShoping.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_To_Cart {
	WebDriver idriver;
	public static WebDriver driver;
	public Add_To_Cart(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath = "//img[@alt='Fashion']")
	WebElement MouseOverOnFashion;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a/div[2]/div[2]/div[2]/div/div/div[1]/a[5]")
	WebElement ClickOnMenFootWear;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[6]/div/div[3]/div/div/a[1]")
	WebElement clickOnLikedProduct;

	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
	WebElement clickOnAddToCart;

	public void MouseOver_OnFashion()
	{
		WebElement Fashion = driver.findElement(By.xpath("//img[@alt='Fashion']"));
		Actions a = new Actions(driver);
		a.moveToElement(Fashion).perform();
	}
	public void clickOn_MenFootWear()
	{
		ClickOnMenFootWear.click();
	}
	public void clickon_LikedProduct()
	{
		clickOnLikedProduct.click();
	}
	public void clickOn_AddToCart() {
		clickOnAddToCart.click();
	}
}

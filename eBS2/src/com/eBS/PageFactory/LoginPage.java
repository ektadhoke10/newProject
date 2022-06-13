package com.eBS.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import generics.BaseTest;

public class LoginPage extends BaseTest{
	By inpUserName=By.xpath("//input[@id='UserName']");
	By inpPassword=By.xpath("//input[@id='Password']");
	By drpStartIN =By.xpath("//select[@id='StartIN']");
	By btnGetstarted =By.xpath("//button[text()='Get Started']");
	
	public void setUserName(String strUserName) {
		driver.findElement(inpUserName).sendKeys(strUserName);
		}
	
	public void setPassword(String strPassword) {
		driver.findElement(inpPassword).sendKeys(strPassword);
		}
	
	public void selectDropDown() {
		System.out.println("----------------------------------------------");
		Select select = new Select(driver.findElement(drpStartIN));
		select.selectByVisibleText("Dashboard");
	}
	
	public void clickGetStarted() {
		driver.findElement(btnGetstarted).click();
		}
	
	
}

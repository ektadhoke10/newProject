package com.pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.generic.Pojo;

public class LoginPage {
	
	private Pojo objPojo;

	public LoginPage(Pojo pojo) {
		this.objPojo=pojo;
	}
	By loc_inpUserName=By.xpath("//input[@id='UserName']");
	By loc_inpPassword=By.xpath("//input[@id='Password']");
	By loc_drpStartIN =By.xpath("//select[@id='StartIN']");
	By loc_btnGetstarted =By.xpath("//button[text()='Get Started']");

	public void setUserName(String strUserName) {
		objPojo.getDriver().findElement(loc_inpUserName).sendKeys(strUserName);
		
	}

	public void setPassword(String strPassword) {
		objPojo.getDriver().findElement(loc_inpPassword).sendKeys(strPassword);
	}

	public void selectDropDown() {
		System.out.println("----------------------------------------------");
		Select select = new Select(objPojo.getDriver().findElement(loc_drpStartIN));
		select.selectByVisibleText("Dashboard");
	}

	public void clickGetStarted() {
		objPojo.getDriver().findElement(loc_btnGetstarted).click();
	}


}

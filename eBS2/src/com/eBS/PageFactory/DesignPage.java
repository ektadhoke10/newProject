package com.eBS.PageFactory;

import org.openqa.selenium.By;


import generics.BaseTest;

public class DesignPage extends BaseTest{
	//By drpStartIN =By.xpath("//select[@id='documentDesignTypeDDL']");
	By btnFolder =By.xpath("//a[text()='Folder']");
	
	
	public void clickFolder() {
		driver.findElement(btnFolder);
	}
	
//	public void selectDropDown() {
//		System.out.println("----------------------------------------------");
//		Select select = new Select(driver.findElement(drpStartIN));
//		select.selectByVisibleText("MasterList");
//	}
}

package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class PortfolioPage {
	private Pojo objPojo;
	public PortfolioPage(Pojo pojo) {
		this.objPojo = pojo;
	}
	By loc_btnPortfolioProduct= By.xpath("//div[@id=\"recentActivitiesSlider\"]/following::div[@class='pull-left cardtitle'][1]");
	By loc_txtPortfolio= By.xpath("//div[text()='Portfolio']");

	
	public void clickPortfolioProduct() {
		objPojo.getDriver().findElement(loc_btnPortfolioProduct).click();
	}
		
	public String getPortfolioTextOnPortfolioPage() {
		String strReturnValue = objPojo.getDriver().findElement(loc_txtPortfolio).getText().trim();
		return strReturnValue;
	}

	public void verifyPortfolioTextIsDisplayedOnPortfolioPage() {
		if (this.getPortfolioTextOnPortfolioPage().equals("Portfolio")) {
			System.out.println("Test Passed: Portfolio Page Displayed");
		} else {
			System.out.println("Test Failed");
		}
	}
	
}

package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class QuotesPage {
	private Pojo objPojo;
	public QuotesPage(Pojo pojo) {
		this.objPojo = pojo;
	}
	By loc_btnQuotes= By.xpath("//div[@id=\"recentActivitiesSlider\"]/following::div[text()='Portfolio Products']");
	By loc_txtQuotes= By.xpath("//div[text()='Quotes']");

	
	public void clickOnQuotes() {
		objPojo.getDriver().findElement(loc_btnQuotes).click();
	}
		
	public String getQuotesTextOnQuotesPage() {
		String strReturnValue = objPojo.getDriver().findElement(loc_txtQuotes).getText().trim();
		return strReturnValue;
	}

	public void verifyQuotesTextIsDisplayedOnQuotesPage() {
		if (this.getQuotesTextOnQuotesPage().equals("Quotes")) {
			System.out.println("Test Passed: Quotes Page Displayed ");
		} else {
			System.out.println("Test Failed");
		}
	}
	
}

package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.Pojo;

public class HomePage {
	private Pojo objPojo;
	public HomePage(Pojo pojo) {
		this.objPojo = pojo;
	}
	By loc_txtHome= By.xpath("//div[text()='Home']");
	By loc_btnRulesManager = By.xpath("//a[@id='rulesmanager']");
	By loc_btnDashboardReport =By.xpath("//a[@id='executivedashBoard']");
	By loc_btnDesign =By.xpath("//a[@id='design']");
	By loc_btnMasterList =By.xpath("//a[@id='masterList']");
	By loc_btnProductSearch = By.xpath("//span[@class='icon-search font-weight-bold']");
	By loc_btnQuickEdit = By.xpath("//a[@id='quickEdit']");
	By loc_btnFoundationTemplate =By.xpath("//a[@id='FoundationTemplate']");
	By loc_btnPortfolio =By.xpath("//a[@id='PortfolioSearch']/parent::li[@class='sidenav-list-item']");
	By loc_btnQuote= By.xpath("//a[@id='quotes']");
	By loc_btnAccount = By.xpath("//a[@id='account']");

	public String getHomeTextOnHomePage() {
		String strReturnValue = objPojo.getDriver().findElement(loc_txtHome).getText().trim();
		return strReturnValue;
	}

	public void verifyHomeTextIsDisplayedOnHomePage() {
		if (this.getHomeTextOnHomePage().equals("Home")) {
			System.out.println("Test Passed: Home Page Displayed");
		} else {
			System.out.println("Test Failed");
		}
	}
	
	public void clickRulesManager() {
		objPojo.getDriver().findElement(loc_btnRulesManager).click();
	}
	public void clickDashboardReport() {
		objPojo.getDriver().findElement(loc_btnDashboardReport).click();
	}

	public void clickDesign() {
		objPojo.getDriver().findElement(loc_btnDesign).click();
	}
	
	public void clickMasterList() {
		objPojo.getDriver().findElement(loc_btnMasterList).click();
	}
	
	public void clickProductSearch() {
		objPojo.getDriver().findElement(loc_btnProductSearch).click();
	}

	public void clickQuickEdit() {
		objPojo.getDriver().findElement(loc_btnQuickEdit).click();
	}
	
	public void clickFoundationTemplate() {
		objPojo.getDriver().findElement(loc_btnFoundationTemplate).click();
	}
	
	public void clickPortfolio() {
		objPojo.getDriver().findElement(loc_btnPortfolio).click();
	}
	
	public void clickQuote() {
		objPojo.getDriver().findElement(loc_btnQuote).click();
	}
	
	public void clickAccount() {
		objPojo.getDriver().findElement(loc_btnAccount).click();
	}

	
}

package com.eBS.PageFactory;

import org.openqa.selenium.By;

import generics.BaseTest;

public class HomePage extends BaseTest{
//	By btnPortfolioProduct= By.xpath("//div[@id=\"recentActivitiesSlider\"]/following::div[@class='pull-left cardtitle'][1]");
//	By btnQuotes =By.xpath(" //div[@id=\"recentActivitiesSlider\"]/following::div[@class='pull-left cardtitle'][2]");
	By btnRulesManager = By.xpath(" //a[@id='rulesmanager']");
	By btnDashboardReport =By.xpath(" //a[@id='executivedashBoard']");
	By btnDesign =By.xpath(" //a[@id='design']");
	By btnMasterList =By.xpath(" //a[@id='masterList']");
	By btnProductSearch = By.xpath(" //span[@class='icon-search font-weight-bold']");
	By btnQuickEdidt = By.xpath(" //a[@id='quickEdit']");
	By btnFoundationTemplate =By.xpath(" //a[@id='FoundationTemplate']");
	By btnPortfolioIcon =By.xpath(" //a[@id='PortfolioSearch']/parent::li[@class='sidenav-list-item']");
	By btnQuoteIcon= By.xpath("//a[@id='quotes']");
	By btnAccount = By.xpath(" //a[@id='account']");
	
	
	
//	public void clickPortfolioProduct() {
//		driver.findElement(btnPortfolioProduct).click();
//	}

//	public void clickQuotes() {
//		driver.findElement(btnQuotes).click();
//	}

	public void clickRulesManager() {
		driver.findElement(btnRulesManager);
	}

	public void clickDashboardReport() {
		driver.findElement(btnDashboardReport);
	}

	public void clickDesign() {
		driver.findElement(btnDesign);
	}
	
	public void clickMasterList() {
		driver.findElement(btnMasterList);
	}
	
	public void clickProductSearch() {
		driver.findElement(btnProductSearch);
	}

	public void clickQuickEdidt() {
		driver.findElement(btnQuickEdidt);
	}
	
	public void clickFoundationTemplate() {
		driver.findElement(btnFoundationTemplate);
	}
	
	public void clickPortfolioIcon() {
		driver.findElement(btnPortfolioIcon);
	}
	
	public void clickQuoteIcon() {
		driver.findElement(btnQuoteIcon);
	}
	
	public void clickAccount() {
		driver.findElement(btnAccount);
	}



}

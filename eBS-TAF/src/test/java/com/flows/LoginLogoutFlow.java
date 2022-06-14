package com.flows;

import com.generic.Pojo;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;
import com.pageFactory.PortfolioPage;
import com.pageFactory.QuotesPage;

public class LoginLogoutFlow {
	
	private Pojo objPojo;
	private LoginPage objLoginPage;
	private HomePage objHomePage;
	private PortfolioPage objPortfolioPage;
	private QuotesPage objQuotesPage;
	
	public LoginLogoutFlow(Pojo pojo) {
		this.objPojo=pojo;
		objLoginPage = new LoginPage(objPojo);
		objHomePage = new HomePage(objPojo);
		objPortfolioPage = new PortfolioPage(objPojo);	
		objQuotesPage = new QuotesPage(objPojo);
	}
	
	public void doLogin() {
		objLoginPage.setUserName("v-khushbut");
		objLoginPage.setPassword("Summer@2018#");
		objLoginPage.selectDropDown();
		objLoginPage.clickGetStarted();
	}
	
	public void clickPortfolio() {
		objPortfolioPage.clickPortfolioProduct();
	}
	
	public void clickQuotes() {
		objQuotesPage.clickOnQuotes();
	}
}

package com.eBS.scricpts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.eBS.PageFactory.HomePage;
import com.eBS.PageFactory.LoginPage;

import generics.BaseTest;

public class TestHomePage {
	private LoginPage objLoginPage;
	private HomePage objHomePage;
	public void initilizeWebPages(){
		objLoginPage = new LoginPage();
		objHomePage = new HomePage();
	}

	@BeforeClass
	public void initilizeWebEnvironment() {
		BaseTest.initializeWebdriver("https://ebs4-qa2.simplifyhealthcare.com/");
		this.initilizeWebPages();
	}

	@AfterClass
	public void tearDownEnv() {
		BaseTest.tearDown();
	}

	@Test
	public void TCID_101_VerifyHomePageDisplayed() {
		objLoginPage.setUserName("v-khushbut");
		objLoginPage.setPassword("Summer@2018#");
		objLoginPage.selectDropDown();
		objLoginPage.clickGetStarted();
	}

	//		@Test
	//		public void TCID_102_VerifyPortfolioProductPageDisplayed() {
	//			objHomePage.clickPortfolioProduct();
	//			}
	//		@Test
	//		public void TCID_103_VerifyQuotesPageDisplayed() {
	//			objHomePage.clickQuotes();
	//		}

	@Test
	public void TCID_104_VerifyRulesManagerPageDisplayed() {
		objHomePage.clickRulesManager();
	}
	@Test
	public void TCID_105_VerifyDesignPageDisplayed() {
		objHomePage.clickDesign();
	}
	@Test
	public void TCID_106_VerifyMasterListPageDisplayed() {
		objHomePage.clickMasterList();
	}
	@Test
	public void TCID_107_VerifyProductSearchPageDisplayed() {
		objHomePage.clickProductSearch();
	}
	@Test
	public void TCID_108_VerifyQuickEdidtPageDisplayed() {
		objHomePage.clickQuickEdidt();
	}
	@Test
	public void TCID_109_VerifyFoundationTemplatePageDisplayed() {
		objHomePage.clickFoundationTemplate();
	}
	@Test
	public void TCID_110_VerifyPortfolioIconPageDisplayed() {
		objHomePage.clickPortfolioIcon();
	}
	@Test
	public void TCID_111_VerifyQuoteIconPageDisplayed() {
		objHomePage.clickQuoteIcon();
	}
	@Test
	public void TCID_112_VerifyAccountPageDisplayed() {
		objHomePage.clickAccount();
	}
}

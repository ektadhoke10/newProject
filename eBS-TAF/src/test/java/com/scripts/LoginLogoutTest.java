package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.flows.LoginLogoutFlow;
import com.generic.BaseTest;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;
import com.pageFactory.PortfolioPage;
import com.pageFactory.QuotesPage;

public class LoginLogoutTest extends BaseTest {
	
	private LoginPage objLoginPage;
	private LoginLogoutFlow objLoginLogoutFlow;
	private HomePage objHomePage;
	private PortfolioPage objPortfolioPage;
	private QuotesPage objQuotesPage;

	public void initilizeWebPages(){
		objLoginPage = new LoginPage(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objHomePage = new HomePage(this);
		objPortfolioPage = new PortfolioPage(this);
		objQuotesPage = new QuotesPage(this);
	}

		@BeforeClass
		public void initilizeWebEnv() {
			this.initilizeWebPages();
			this.initilizeWebEnvironment();
		}

//		@AfterClass
//		public void tearDownEnv() {
//			this.tearDown();
//		}

		@Test
		public void TCID_101_VerifyHomePageDisplayed() {
			objLoginLogoutFlow.doLogin();
			objHomePage.verifyHomeTextIsDisplayedOnHomePage();
		}
		
		@Test
		public void TCID_102_VerifyPortfolioPageDisplayed() {
			objLoginLogoutFlow.doLogin();
			objLoginLogoutFlow.clickPortfolio();
			objPortfolioPage.verifyPortfolioTextIsDisplayedOnPortfolioPage();
		}
		
		@Test
		public void TCID_103_VerifyQuotesPageDisplayed() {
			objLoginLogoutFlow.doLogin();
			objLoginLogoutFlow.clickQuotes();
			objQuotesPage.verifyQuotesTextIsDisplayedOnQuotesPage();
		}
		
	}

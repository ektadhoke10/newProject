package com.eBS.scricpts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eBS.PageFactory.DesignPage;
import com.eBS.PageFactory.HomePage;
import com.eBS.PageFactory.LoginPage;

import generics.BaseTest;

public class TestDesignPage {
	private LoginPage objLoginPage;
	private HomePage objHomePage;
	private DesignPage objDesignPage;
	
	public void initilizeWebPages(){
		objLoginPage = new LoginPage();
		objHomePage = new HomePage();
		objDesignPage = new DesignPage();
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
	@Test
	public void TCID_102_VerifyDesignPageDisplayed() {
		objHomePage.clickDesign();
	}
	@Test
	public void TCID_103_VerifyfolderTabDisplayed() {
		objDesignPage.clickFolder();
	}
}

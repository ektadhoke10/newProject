package com.scripts;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.generic.Pojo;
import com.pageFactory.LoginLogoutPage;

public class ParameterizationTest extends BaseTest {
	private Pojo objPojo;
	private LoginLogoutPage objLoginLogoutPage;

	
	public void initilizeWebPages(){
		objLoginLogoutPage = new LoginLogoutPage(this);
		}

	@BeforeClass
	public void initilizeWebEnv() {
		this.initilizeWebPages();
		this.initilizeWebEnvironment();
	}

	//	@AfterClass
	//	public void tearDownEnv() {
	//		this.tearDown();
	//	}


	@Test(dataProvider="getData")
	public void doLogin(String strUserName, String strPassword) {
		objLoginLogoutPage.setUserName(strUserName);
		objLoginLogoutPage.setPassword(strPassword);
		if (strUserName.equals("v-khushbut")&& strPassword.equals("Summer@2018#")) {
			objLoginLogoutPage.clickGetStarted();
		}
		else {
			objLoginLogoutPage.doClearUsernameAndPasswordFields();
			System.out.println("Invalid username and password"+ "\nusername: "+ strUserName +"  " +"password:" + strPassword);
		}
	}


	@DataProvider
	public Object[][] getData(){
		Object [][] data = new Object[3][2];
		data[0][0] = "ekta@gmail.com";
		data[0][1] = "ekta@123";

		data[1][0] = "vstl@gmail.com";
		data[1][1] = "vstl@123";

		data[2][0] = "v-khushbut";
		data[2][1] = "Summer@2018#";

		return data;

	}


}

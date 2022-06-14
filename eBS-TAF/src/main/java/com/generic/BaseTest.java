package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Pojo{
	
	private WebDriver driver;
	private String strBaseUrl;

	public void initilizeWebEnvironment() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		strBaseUrl= "https://ebs4-qa2.simplifyhealthcare.com/";
		this.setBaseUrl(strBaseUrl);
		driver.get(this.getBaseUrl());
		this.setDriver(driver);
		driver.manage().window().maximize();
	}
	
	
	public void tearDown() {
		driver.quit();
	}

}

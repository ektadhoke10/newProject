package com.generic;

import org.openqa.selenium.WebDriver;

public class Pojo {
	private WebDriver driver;
	private String strBaseUrl;
	private int implicitWait=6;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public String getBaseUrl() {
		return strBaseUrl;
	}
	public void setBaseUrl(String baseUrl) {
		this.strBaseUrl = baseUrl;
	}
	public int getImplicitWait() {
		return implicitWait;
	}
	public void setImplicitWait(int implicitWait) {
		this.implicitWait = implicitWait;
	}
	
	

}

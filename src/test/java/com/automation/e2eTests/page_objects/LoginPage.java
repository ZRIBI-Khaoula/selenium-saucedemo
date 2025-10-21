package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

public class LoginPage extends  BasePage{

	public LoginPage() {
		super(Setup.getDriver());
		
	}
	
	@FindBy(how= How.ID, using = "user-name")
	private static WebElement username;
	
	@FindBy(how= How.ID, using = "password")
	private static WebElement password;
	
	@FindBy(how= How.ID, using = "login-button")
	private static WebElement btnLogin;
	
	@FindBy(how= How.XPATH, using = "//span[@class='title']")
	private static WebElement productsIcon;
	
	@FindBy(how= How.ID, using = "login_credentials")
	private static WebElement loginCredentials;
	
	
	public static WebElement getUsername() {
		return username;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin(){
		return btnLogin;
	}
	
	public static WebElement getproductsIcon(){
		return productsIcon;
	}
	
	public static WebElement getLoginCredentials(){
		return loginCredentials;
	}
	
	
}

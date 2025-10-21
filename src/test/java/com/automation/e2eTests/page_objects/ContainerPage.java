package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

public class ContainerPage extends BasePage {

	
	
	public ContainerPage() {
		super(Setup.getDriver());
		
	}
	/*continue-shopping WebElement */
	
	/*checkout WebElement*/
	
	@FindBy (how = How.XPATH, using = "//button[@id='checkout']")
	private static WebElement btnCheckout;
	
	public static WebElement getBtnCheckout() {
		
		return btnCheckout;
	}
	
	
}

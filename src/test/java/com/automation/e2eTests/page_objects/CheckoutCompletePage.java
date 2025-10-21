package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

public class CheckoutCompletePage extends BasePage{

	public CheckoutCompletePage() {
		super(Setup.getDriver());
		
	}
	

	/* successMsg WebElement */
	@FindBy(how=How.XPATH, using ="//h2[normalize-space()='Thank you for your order!']")
	private static WebElement successMsg;
	
	public static WebElement getSuccessMsg() {
		return successMsg;
	}

}

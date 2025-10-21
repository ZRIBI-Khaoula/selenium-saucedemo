package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

public class OverviewPage extends BasePage {

	public OverviewPage() {
		super(Setup.getDriver());
		
	}

	/* //button[@id='cancel'] */ 
	
	/*finish WebElement*/
	@FindBy(how =How.ID, using ="finish")
	private static WebElement btnfinish;
	
	public static WebElement getBtnfinish() {
		return btnfinish;
	}
}

package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

public class InformationsPage extends BasePage{

	public InformationsPage() {
		super(Setup.getDriver());
		
	}

	/*first-name WebElement*/
	
	@FindBy(how =How.ID, using ="first-name")
	private static WebElement firstname;
	
	
	
	/*last-name  WebElement*/
	@FindBy(how =How.ID, using ="last-name")
	private static WebElement lastname;
	
	/*postal-code  WebElement*/	
	@FindBy(how =How.ID, using ="postal-code")
	private static WebElement postalCode;
	
	/*cancel  WebElement*/	
	@FindBy(how =How.ID, using ="cancel")
	private static WebElement btnCancel;
	
	/*continue  WebElement*/	
	@FindBy(how =How.ID, using ="continue")
	private static WebElement btnContinue;
	
	
	public static WebElement getFirstname() {	
		return firstname;
	}
	
	public static WebElement getLastname() {	
		return lastname;
	}
	
	public static WebElement getPostalCode() {	
		return postalCode;
	}
	
	public static WebElement getBtnCancel() {	
		return btnCancel;
	}
	
	public static WebElement getBtnContinue() {	
		return btnContinue;
	}
	
}

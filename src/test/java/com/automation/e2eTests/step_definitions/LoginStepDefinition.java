package com.automation.e2eTests.step_definitions;

import com.automation.e2eTests.page_objects.LoginPage;
import com.automation.e2eTests.page_objects.ProductPage;
import com.automation.e2eTests.utils.ConfigFileReader;
import com.automation.e2eTests.utils.SeleniumUtils;
import com.automation.e2eTests.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public LoginPage loginPage;
	public ProductPage productPage;
	
	public LoginStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();
		productPage = new ProductPage();
		
	}
	

	@Given("Je me connecte à l'interface Swag Labs")
	public void jeMeConnecteÀLInterfaceSwagLabs() {
		seleniumUtils.get(configFileReader.getProperties("base.url"));
	    
	}
	
	
	@When("Je saisis le username")
	public void jeSaisisLeUsername() {
		
		seleniumUtils.writeText(LoginPage.getUsername(), configFileReader.getProperties("admin.username"));   
	}
	@When("Je saisis le password")
	public void jeSaisisLePassword() {
		
		seleniumUtils.writeText(LoginPage.getPassword(), configFileReader.getProperties("admin.password")); 
	    
	}
	@When("Je clique sur Login")
	public void jeCliqueSurLogin() {
		
		seleniumUtils.clickOnElementUsingJs(LoginPage.getBtnLogin());
	    
	}
	@Then("Je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String string) {
		
		validations.assertEquals(LoginPage.getproductsIcon(), "Products");
	    
	}

	

	@When("Je clique sur le burgur menu")
	public void jeCliqueSurLeBurgurMenu() {
		
		seleniumUtils.clickOnElementUsingJs(ProductPage.getBtnBurger());
	   
	}
	
	@When("Je clique sur Logout")
	public void jeCliqueSurLogout() {
		
		seleniumUtils.clickOnElementUsingJs(ProductPage.getBtnLogout());		
	    
	}
	
	@Then("Je me redirige vers la page de connexion {string}")
	public void jeMeRedirigeVersLaPageDeConnexion(String string) {
		
		validations.isElementDisplayed(LoginPage.getLoginCredentials());
	    
	}





}

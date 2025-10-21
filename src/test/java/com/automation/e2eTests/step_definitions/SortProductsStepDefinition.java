package com.automation.e2eTests.step_definitions;

import com.automation.e2eTests.page_objects.ProductPage;
import com.automation.e2eTests.utils.SelectFromListUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortProductsStepDefinition {
	
	public SelectFromListUtils selectFromListUtils;
	public ProductPage productPage;
	
	public SortProductsStepDefinition() {
		
		selectFromListUtils = new SelectFromListUtils();
		productPage = new ProductPage();
		
	}
	

	@When("Je selectionne l'option {string} dans le menu de tri")
	public void jeSelectionneLOptionDansLeMenuDeTri(String string) {
		
		selectFromListUtils.selectDropDownListByVisibleText(ProductPage.getSortMenu(), "Price (low to high)");
	    
	}
	@Then("Tri par prix croissant effectué")
	public void triParPrixCroissantEffectué() {
	    
	}

	

	@When("Je choisis l'option {string} dans le menu de tri")
	public void jeChoisisLOptionDansLeMenuDeTri(String string) {
		
		selectFromListUtils.selectDropDownListByVisibleText(ProductPage.getSortMenu(), "Name (Z to A)");
	   
	}
	@Then("Tri par ordre alphabétique decroissant effectué")
	public void triParOrdreAlphabétiqueDecroissantEffectué() {

	}





}

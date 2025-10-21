package com.automation.e2eTests.step_definitions;

import com.automation.e2eTests.page_objects.CheckoutCompletePage;
import com.automation.e2eTests.page_objects.ContainerPage;
import com.automation.e2eTests.page_objects.InformationsPage;
import com.automation.e2eTests.page_objects.LoginPage;
import com.automation.e2eTests.page_objects.OverviewPage;
import com.automation.e2eTests.page_objects.ProductPage;
import com.automation.e2eTests.utils.ConfigFileReader;
import com.automation.e2eTests.utils.SeleniumUtils;
import com.automation.e2eTests.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderStepDefinition {

	public SeleniumUtils seleniumUtils;
	public ConfigFileReader configFileReader;
	public Validations validations;
	public LoginPage loginPage;
	public ProductPage productPage;
	public ContainerPage containerPage;
	public InformationsPage informationsPage;
	public OverviewPage overviewPage;
	public CheckoutCompletePage checkoutCompletePage;

	public OrderStepDefinition() {
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		configFileReader = new ConfigFileReader();
		loginPage = new LoginPage();
		productPage = new ProductPage();
		containerPage = new ContainerPage();
		informationsPage = new InformationsPage();
		overviewPage = new OverviewPage();
		checkoutCompletePage = new CheckoutCompletePage();
		
	}

	@When("J'ajoute des produits au panier")
	public void jAjouteDesProduitsAuPanier() {

		seleniumUtils.click(ProductPage.getBackpack());
		seleniumUtils.click(ProductPage.getBikeLight());
		seleniumUtils.click(ProductPage.getOnesie());

	}

	@When("Je clique sur le bouton panier")
	public void jeCliqueSurLeBoutonPanier() {

		seleniumUtils.click(ProductPage.getShoppingContainer());

	}

	@When("Je vérifie que tous les produits ajoutés sont dans le panier")
	public void jeVérifieQueTousLesProduitsAjoutésSontDansLePanier() {

	}

	@When("Je clique sur le bouton checkout")
	public void jeCliqueSurLeBoutonCheckout() {
		
		seleniumUtils.click(ContainerPage.getBtnCheckout());

	}

	@When("Je saisis toutes les informations")
	public void jeSaisisToutesLesInformations() {
		
		seleniumUtils.writeText(InformationsPage.getFirstname(),configFileReader.getProperties("client.firstname"));
		seleniumUtils.writeText(InformationsPage.getLastname(),configFileReader.getProperties("client.lastname"));
		seleniumUtils.writeText(InformationsPage.getPostalCode(),configFileReader.getProperties("client.postalcode"));

	}

	@When("Je clique sur le bouton Continuer")
	public void jeCliqueSurLeBoutonContinuer() {
		
		seleniumUtils.click(InformationsPage.getBtnContinue());

	}


	@When("Je clique sur finish")
	public void jeCliqueSurFinish() {
		
		seleniumUtils.click(OverviewPage.getBtnfinish());

	}

	@Then("Je verifie le message de réussite {string}")
	public void jeVerifieLeMessageDeRéussite(String string) {
		
		validations.assertEquals(CheckoutCompletePage.getSuccessMsg(), "Thank you for your order!");

	}

	

}

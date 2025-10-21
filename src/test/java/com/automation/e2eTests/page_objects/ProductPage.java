package com.automation.e2eTests.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.automation.e2eTests.utils.BasePage;
import com.automation.e2eTests.utils.Setup;

public class ProductPage extends BasePage{

	public ProductPage() {
		super(Setup.getDriver());
		
	}
	
	
	/*btnBurger WebElement*/
	@FindBy(how=How.ID ,using = "react-burger-menu-btn" )
	private static WebElement btnBurger;
	
	/*btnLogout WebElement*/
	@FindBy(how=How.ID ,using = "logout_sidebar_link" )
	private static WebElement btnLogout;
	
	/*sortMenu WebElement*/
	@FindBy(how=How.XPATH ,using = "//select[@class='product_sort_container']" )
	private static WebElement sortMenu;
	 
	/*backpack WebElement*/
	
	@FindBy(how=How.ID, using = "add-to-cart-sauce-labs-backpack")
	private static WebElement backpack;
	
	
	
	/*bikeLight WebElement*/
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-bike-light")
	private static WebElement bikeLight;
	
	
	
	/*boltTShirt WebElement*/
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-bolt-t-shirt")
	private static WebElement boltTShirt;
	
	
	
	/*fleeceJacket WebElement*/
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-fleece-jacket")
	private static WebElement fleeceJacket;
	
	
	
	/*onesie WebElement*/
	
	@FindBy(how = How.ID, using = "add-to-cart-sauce-labs-onesie")
	private static WebElement onesie;
	
	
	/*redTShirt WebElement*/
	
	@FindBy(how = How.ID, using = "add-to-cart-test.allthethings()-t-shirt-(red)")
	private static WebElement redTShirt;
	
	
	
	/*shoppingContainer WebElement*/
	@FindBy(how = How.ID, using = "shopping_cart_container")
	private static WebElement shoppingContainer;

	/*productSort WebElement*/
	@FindBy(how = How.XPATH, using = "//select[@class='product_sort_container']")
	private static WebElement productSort;
	
	
	public static WebElement getBtnBurger() {
		return btnBurger;
	} 
	
	public static WebElement getBtnLogout() {
		return btnLogout;
	} 
	
	public static WebElement getSortMenu() {
		return sortMenu;
	}
	
	public static WebElement getBackpack() {
		return backpack;
	}
	
	public static WebElement getBikeLight() {
		return bikeLight;
	}
	
	public static WebElement getBoltTShirt() {
		return boltTShirt;
	}
	
	public static WebElement getFleeceJacket() {
		return fleeceJacket;
	}
	
	public static WebElement getOnesie() {
		return onesie;
	}
	
	public static WebElement getRedTShirt() {
		return redTShirt;
	}
	
	public static WebElement getShoppingContainer() {
		return shoppingContainer;
	}
	
	public static WebElement getProductSort() {
		return productSort;
	}
	
	

}

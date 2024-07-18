package org.stepdefinition;

import org.mav.BaseClassIMI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOamazon extends BaseClassIMI{
	
	public POJOamazon() {
    	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Hello, sign in']")
	private WebElement signin;
	
	@FindBy(name = "email")
	private WebElement mail;
	
	@FindBy(id = "continue")
	private WebElement cont;

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getCont() {
		return cont;
	}
	
	
}

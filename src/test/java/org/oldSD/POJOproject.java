package org.oldSD;

import org.mav.BaseClassIMI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOproject extends BaseClassIMI{
	
	 public POJOproject() {
	    	PageFactory.initElements(driver, this);
		}
	 
	 @FindBy(xpath = "//a[text()='Create new account']")
	 private WebElement newacc;
	 
	 @FindBy(xpath = "(//input[@type='text'])[2]")
	 private WebElement fstname;

	@FindBy(name = "lastname")
	 private WebElement lsttname;
	 
	 @FindBy(name = "reg_email__")
	 private WebElement mail;
	 
	 @FindBy(name = "reg_passwd__")
	 private WebElement pass;
	 
	 	public WebElement getNewacc() {
			return newacc;
		}

		public WebElement getFstname() {
			return fstname;
		}

		public WebElement getLsttname() {
			return lsttname;
		}

		public WebElement getMail() {
			return mail;
		}

		public WebElement getPass() {
			return pass;
		}
	 
}

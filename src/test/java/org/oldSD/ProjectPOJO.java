package org.oldSD;

import org.mav.BaseClassIMI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPOJO extends BaseClassIMI {		
		
	    public ProjectPOJO() {
	    	PageFactory.initElements(driver, this);
		}
				
	    @FindBy(id="email")
	    private WebElement mail;
	    
	    @FindBy(xpath = "//input[@aria-label='Password']")
	    private WebElement password;
	    
	    @FindBy(name = "login")
	    private WebElement login;

		public WebElement getMail() {
			return mail;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}
	    
	    
}

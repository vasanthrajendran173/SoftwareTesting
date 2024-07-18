package org.stepdefinition;

import org.mav.BaseClassIMI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumber extends BaseClassIMI {
	
	POJOamazon p;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	     launchEdgeBrowser();
	     WindowMaximize();
	}

	@When("To launch the URL of the amazon web app")
	public void to_launch_the_URL_of_the_amazon_web_app() {
	     launchUrl("https://www.amazon.in/");
	}

	@When("To click the sign in button")
	public void to_click_the_sign_in_button() {
	     p= new POJOamazon();
	     clickBtn(p.getSignin());
	}

	@When("To enter the valid or invalid mail ID")
	public void to_enter_the_valid_or_invalid_mail_ID() {
		p= new POJOamazon();
		passText("vasanth@gmail.com", p.getMail());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		p= new POJOamazon();
		clickBtn(p.getCont());
	}

	@Then("To close the entire browser")
	public void to_close_the_entire_browser() {
	    //closeEntireBrowser();
	}
}

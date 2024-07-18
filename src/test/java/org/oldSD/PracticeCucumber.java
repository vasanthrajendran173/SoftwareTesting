package org.oldSD;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.mav.BaseClassIMI;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PracticeCucumber extends BaseClassIMI{	
	
	POJOproject p;
	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
	    launchEdgeBrowser();
	    WindowMaximize();
	}

	@When("To launch the facebook url")
	public void to_launch_the_facebook_url() {
	     launchUrl("https://www.facebook.com/");
	}

	@When("To click create new account button")
	public void to_click_create_new_account_button() {
		p = new POJOproject();
	     clickBtn(p.getNewacc());
	}

	@When("To pass the firstname in the Firstname text box")
	public void to_pass_the_firstname_in_the_Firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> map = d.asMap(String.class, String.class); 
		p = new POJOproject();
		passText(map.get("firstname2"), p.getFstname());		
	}
 
	@When("To pass the second name in the surname text box")
	public void to_pass_the_second_name_in_the_surname_text_box() {
		p = new POJOproject();
		passText("Joseph", p.getLsttname());
	}

	@When("To pass the username in mobie or email text box")
	public void to_pass_the_username_in_mobie_or_email_text_box(DataTable d) {
		List<Map<String, String>> Maps = d.asMaps();
		p = new POJOproject();
		passText("vasanth@gmail.com", p.getMail());
	}

	@When("To pass new password using new password text box")
	public void to_pass_new_password_using_new_password_text_box() {
		p = new POJOproject();
		passText("@asdfg123", p.getPass());
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}
}

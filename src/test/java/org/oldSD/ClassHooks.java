package org.oldSD;

import org.mav.BaseClassIMI;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ClassHooks extends BaseClassIMI{
	
	@Before
	private void precon() {
		launchChromeBrowser();
		WindowMaximize();
	}
	
	@After
	private void postcon() {
		closeEntireBrowser();
	}
}

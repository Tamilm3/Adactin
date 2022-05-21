package org.Step;

import org.baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Baseclass {
	@Before(order =1 )
	public void browserlaunch() {
	launchBrowser();
	}
	@Before(order =2 )
	public void maximize() {
	maxBrowser();
	}
	@Before(order = 3)
	public void url() {
	loadUrl("https://adactinhotelapp.com/");
	}
	@Before(order = 4)
	public void time() {
	Implicit();
	}
	@After(order = 5)
	public void close() {
	driver.close();
	}
}

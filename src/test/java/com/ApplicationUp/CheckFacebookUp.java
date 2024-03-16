package com.ApplicationUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class CheckFacebookUp {

	Response respobj=null;
	@Given("Open facebook")
	public void open_facebook() {
		 respobj=RestAssured.get("https://www.facebook.com/");
	}
	@Then("Check facebook up and running")
	public void check_facebook_up_and_running() {
		int statuscode=respobj.getStatusCode();
	    System.out.println("status code is="+statuscode);
	    Assert.assertTrue(statuscode==200);
	}



}

package com.ApplicationUp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class CheckAmazonUp {
	
	Response respobj=null;
	@Given("Open amazon")
	public void open_amazon() {
	    respobj=RestAssured.get("https://www.amazon.com");
	}
	@Then("Check amazon up and running")
	public void check_amazon_up_and_running() {
	    int statuscode=respobj.getStatusCode();
	    System.out.println("status code is="+statuscode);
	    Assert.assertTrue(statuscode==200);
	}



	
}

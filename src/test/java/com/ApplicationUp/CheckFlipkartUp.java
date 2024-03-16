package com.ApplicationUp;

import org.junit.Assert;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonMappingException.Reference;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CheckFlipkartUp {
	
	Response respobj=null;
	@Given("Open flipkart")
	public void open_flipkart() {
	  respobj=RestAssured.get("https://www.flipkart.com");
	}
	@Then("Check flipkart up and running")
	public void check_flipkart_up_and_running() {
	   int statuscode=respobj.getStatusCode();
	   System.out.println("status code is="+statuscode);
	    Assert.assertTrue(statuscode==200);
	}




}

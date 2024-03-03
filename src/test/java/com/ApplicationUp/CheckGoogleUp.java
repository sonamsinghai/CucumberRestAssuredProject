package com.ApplicationUp;

import org.junit.Assert;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.JsonMappingException.Reference;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class CheckGoogleUp {
	
	Response respobj=null;
	@Given("Open google")
	public void open_google() {
	   System.out.println("in open google method");
	   respobj=RestAssured.get("https://google.com");
	   System.out.println("end--open google method");
	}
	@Then("Check google up and running")
	public void check_google_up_and_running() {
	    int statuscode=respobj.getStatusCode();
	    System.out.println("status code is="+statuscode);
	    Assert.assertTrue(statuscode==200);
	}

}

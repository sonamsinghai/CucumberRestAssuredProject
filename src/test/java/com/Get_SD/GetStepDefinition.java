package com.Get_SD;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetStepDefinition {
	
	Response respobj=null;
	@Given("hit the bookstore api")
	public void hit_the_bookstore_api() {
	    System.out.println("i m in bookstore");
	    respobj=RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	    System.out.println("i m out bookstore");
	}
	@Then("validate as status code")
	public void validate_as_status_code() {
		 int statuscode=respobj.getStatusCode();
		    System.out.println("status code is="+statuscode);
		    Assert.assertTrue("status code not matching",statuscode==200);
	}
	@Then("validate Git Pocket Guide title present")
	public void validate_git_pocket_guide_title_present() {
		String jsonDataString=respobj.getBody().asString();
		System.out.println("json="+jsonDataString);
		String booktitle=respobj.getBody().jsonPath().get("books[0].title");
		Assert.assertTrue("title is not matching", booktitle.equals("Git Pocket Guide"));
	   
	}
}

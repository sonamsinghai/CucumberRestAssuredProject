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
//	@Then("validate Git Pocket Guide title present")
//	public void validate_git_pocket_guide_title_present() {
//		String jsonDataString=respobj.getBody().asString();
//		System.out.println("json="+jsonDataString);
//		String booktitle=respobj.getBody().jsonPath().get("books[0].title");
//		Assert.assertTrue("title is not matching", booktitle.equals("Git Pocket Guide"));
//	}
//	@Then("validate Learning JavaScript Design Patterns title present")
//	public void validate_learning_javaScript_design_patterns_title_present() {
//		String jsonDataString=respobj.getBody().asString();
//		System.out.println("json="+jsonDataString);
//		String booktitle=respobj.getBody().jsonPath().get("books[1].title");
//		Assert.assertTrue("title is not matching", booktitle.equals("Learning JavaScript Design Patterns"));
//	}
//	@Then("validate Designing Evolvable Web APIs with ASP.NET")
//	public void validate_designing_evolvable_web_ap_is_with_asp_net() {
//	   String jsonDataString=respobj.getBody().asString();
//	   System.out.println("json="+jsonDataString);
//	   String bookTitle=respobj.getBody().jsonPath().get("books[2].title");
//	   Assert.assertTrue("title not matching", bookTitle.equals("Designing Evolvable Web APIs with ASP.NET"));
//	}
//	
//	@Then("validate Speaking JavaScript")
//	public void validate_speaking_java_script() {
//	    String jsonDataString=respobj.getBody().asString();
//	    System.out.println("json="+jsonDataString);
//	    String bookTitle=respobj.getBody().jsonPath().get("books[3].title");
//	    Assert.assertTrue("title not matching", bookTitle.equals("Speaking JavaScript"));
//	}
//
//	@Then("validate {string} at jsonpath {string} title present")
//	public void validate_at_jsonpath_title_present(String title, String jsonPath) {
//		  String jsonDataString=respobj.getBody().asString();
//		  System.out.println("json="+jsonDataString);
//		  String bookTitle=respobj.getBody().jsonPath().get(jsonPath);
//		  Assert.assertTrue("title not matching", bookTitle.equals(title));
//	}
//	
//	@Then("validate {string} at jsonpath {string} pageNumbers present")
//	public void validate_at_jsonpath_page_numbers_present(String pageNumber, String jsonPath) {
//		 int actualpageNumber=respobj.getBody().jsonPath().getInt(jsonPath);
//		 int expectedpageNumber=Integer.parseInt(pageNumber);
//		 Assert.assertTrue("pageno not matching", actualpageNumber==expectedpageNumber);
//	}

	@Then("validate {string} at jsonpath {string} present")
		public void validate_data_at_jsonpath_present(String expValue, String jsonPath) {
			 String actualValue=respobj.getBody().jsonPath().getString(jsonPath);
			 Assert.assertTrue("data not matching", expValue.equals(actualValue));
	}
}

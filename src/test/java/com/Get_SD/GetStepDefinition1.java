package com.Get_SD;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.restassured.response.Response;

public class GetStepDefinition1 {

	Response respobj=null;
	@Then("validate Learning JavaScript Design Patterns title present")
	public void validate_learning_javaScript_design_patterns_title_present() {
		String jsonDataString=respobj.getBody().asString();
		System.out.println("json="+jsonDataString);
		String booktitle=respobj.getBody().jsonPath().get("books[1].title");
		Assert.assertTrue("title is not matching", booktitle.equals("validate Learning JavaScript Design Patterns"));
	}
}

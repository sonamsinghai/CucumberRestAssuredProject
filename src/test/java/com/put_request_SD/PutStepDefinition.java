package com.put_request_SD;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

import org.json.JSONObject;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class PutStepDefinition {
	Response response;
	@Given("Create User with data")
	public void create_user_with_data() {
	    response=RestAssured
	    				.given()
	    				.relaxedHTTPSValidation()
	    				.accept(ContentType.JSON)
	    				.body("{\r\n"
	    						+ "\"name\" : \"anilkale\",\r\n"
	    						+ "\"job\" : \"Manager\" ,\r\n"
	    						+ "\"dept\" : \"QA automation\",\r\n"
	    						+ "\"mob\" : \"111\"\r\n"
	    						+ "}")
	    				.put("https://reqres.in/api/users");
	}
	@Then("validate user created.")
	public void validate_user_created() {
	   String allresp=response.asString();
	   System.out.println("all details="+allresp);
	   int statuscode=response.getStatusCode();
	   System.out.println("status code="+statuscode);
	   Assert.assertTrue(statuscode==201);
	}
	
	@Then("validate user ID have non null value")
	public void validate_user_id_have_non_null_value() {
	   String actID=response.getBody().jsonPath().getString("id");
	   Assert.assertTrue(Integer.parseInt(actID)>0);
	   Assert.assertTrue(actID != null);
	}
	
	@Given("Create User {string} with data from file")
	public void create_user_with_data_from_file(String userName) throws IOException {
		String jsonData=new String(Files.readAllBytes(Paths.get("src/test/resources/com/post_request_FF/User.json")));
		JSONObject jsonObj=new JSONObject(jsonData);
		jsonObj.put("name", userName);
		String actJson=jsonObj.toString();
		System.out.println("actual json is="+actJson);
		response=RestAssured
				.given()
				.relaxedHTTPSValidation()
				.accept(ContentType.JSON)
				.body("actJson")
				.post("https://reqres.in/api/users");
	}

	@Then("validate all headers")
	public void validate_all_headers() {
	  Headers allHeaders=response.getHeaders();
	  List<Header> listHeaders=allHeaders.asList();
	  for (Iterator iterator = listHeaders.iterator(); iterator.hasNext();) {
		Header header=(Header) iterator.next();
		System.out.println(header.toString());
		
	}
	  
	}










}

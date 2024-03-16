package com.Get_datatable_SD;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_datatableStepDefinition {
	
	Response response  = null;
	@Given("Hit the bookstore api")
	public void hit_the_bookstore_api() {
		response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	}
	@Then("validate as status code")
	public void validate_statusCod_present() {
		int statusCode=  response.getStatusCode();
		Assert.assertTrue("Status code not matching", statusCode == 200);
	}
	
//	@Then("validate data from response")
//	public void validate_Value_present(DataTable allData) {//datatable is a class written by cucumber
//		List<List <String>> allListItemsList = allData.asLists();//list of list means in one list there are 2 items
//		for(int i = 0; i<allListItemsList.size(); i++) {
//			String expValue  = allListItemsList.get(i).get(0);
//			String actualValue = response.getBody().jsonPath().getString(allListItemsList.get(i).get(1));
//			Assert.assertTrue("Value not maching", expValue.equals(actualValue) );
//		}
//	}
	
	@Then("validate data from response")
	public void validate_Value_present(DataTable allData) {  
		 List<List<String>> mapobj = allData.asLists();
		    for (int i=0;i<mapobj.size();i++){
		    	String expValue  = mapobj.get(i).get(0);
		    	String actualValue = response.getBody().jsonPath().getString(mapobj.get(i).get(1));
				Assert.assertTrue("Value not maching", expValue.equals(actualValue) );
		    }
		}
}

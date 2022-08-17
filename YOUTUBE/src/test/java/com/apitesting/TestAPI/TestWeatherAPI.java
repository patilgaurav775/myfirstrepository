package com.apitesting.TestAPI;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

public class TestWeatherAPI {
	
	@Test
	public void getWeatherInfoOfBangloreWithValidData() {
		baseURI="http://216.10.245.166";
		String respost=given().queryParam("ID", "abc123").log().all().when().get("/Library/GetBook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(respost);
		
		Reporter.log("response is = "+respost, true);
		
		ValidatableResponse res = given().queryParam("ID", "abc123").log().all().when().get("/Library/GetBook.php")
		.then();
		
		res.statusCode(200);
		Reporter.log("verified the status code successfully ",true);
		
		res.contentType(ContentType.JSON);
		
		/*Object authorname=res.extract().response().path("author");
		System.out.println("Author name is = "+authorname);*/
		
		JsonPath js=new JsonPath(respost);
		Object authorName=js.get("author").toString();
		System.out.println("authorname is = "+authorName);
		
		
		res.body("isbn", Matchers.notNullValue());
		res.body("isbn", Matchers.equalTo("abc"));
		Reporter.log("author name is verified successfully ",true);
		
		

	}

}

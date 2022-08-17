package REST;

import static io.restassured.RestAssured.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.testng.annotations.Test;

import Package.excel;
import Package.properties;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class GET_POST_DELETE_PUT extends properties {
	
	@Test(priority = 1)
	private static void POST() throws FileNotFoundException {
		
		expected_code = property.getProperty("expected_status_code_for_POST");
		// baseURI = "https://rahulshettyacademy.com";
		PrintStream add1 = new PrintStream(new FileOutputStream(excel.getStringCellData("POST", "FILEPATH")));
		
		Response POST_response = given().spec(spec.request()).log().all().queryParam(excel.getStringCellData("POST", "QUERYPARAMKEY"), excel.getStringCellData("POST", "QUERYPARAMVALUE"))
				.body(POST_BODY.all()).filter(RequestLoggingFilter.logRequestTo(add1))
				.filter(ResponseLoggingFilter.logResponseTo(add1)).when().post(excel.getStringCellData("POST", "PATHPARAM")).then().log()
				.all().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)")
				.spec(spec.response()).extract().response();
		
		int actual_co = POST_response.getStatusCode();

		actual_code = String.valueOf(actual_co);

		 respo = POST_response.asString();

		JsonPath JS_POST = new JsonPath(respo);
		String place_id = JS_POST.get("place_id");
		System.out.println("place id is :- " + place_id);

		property.setProperty("place_id", place_id);
		
		FileOutputStream test = new FileOutputStream("src/main/resources/PROPERTIES/prop.properties");
		try {
			property.store(test, "changing_value for place_id");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		start_test("Expected and Actual status code should match as 200 FOR POST REQUEST");

		if (actual_code.equalsIgnoreCase(expected_code)) {
			PassTest(POST_response.asPrettyString());
		} else if(!actual_code.equalsIgnoreCase(expected_code)) {
			fail_test("Expected and Actual result is not matched as 200 FOR POST REQUEST");
		}
		else {
			skip_test();
		}

	}

	@Test(priority = 2)
	private static void GET() throws FileNotFoundException {
		
		expected_code = property.getProperty("expected_status_code_for_GET");

		updated_place_id = property.getProperty("place_id");
		
		PrintStream add2 = new PrintStream(new FileOutputStream("src\\main\\resources\\FILE\\GET"));
		
		Response GET_response = given().spec(spec.request()).log().all().queryParam("place_id", updated_place_id)
				.filter(RequestLoggingFilter.logRequestTo(add2)).filter(ResponseLoggingFilter.logResponseTo(add2))
				.when().get("/maps/api/place/get/json").then().log().all().spec(spec.response()).extract().response();
		
		 respo = GET_response.asString();

		 actual_code = String.valueOf(GET_response.getStatusCode());

		JsonPath JS_GET = new JsonPath(respo);
		String phone_number = JS_GET.get("phone_number");
		System.out.println("phone number is :- " + phone_number);

		start_test("Expected and Actual status code should match as 200 FOR GET REQUEST");

		if (actual_code.equalsIgnoreCase(expected_code)) {
			PassTest(respo);
		} else {
			fail_test("Expected and Actual result is not matched as 200 FOR GET REQUEST");
		}
	}
	
	@Test(priority = 3)
	private static void PUT() throws FileNotFoundException {
		
		 expected_code = property.getProperty("expected_status_code_for_PUT");
		
		PrintStream add3 = new PrintStream(new FileOutputStream("src\\main\\resources\\FILE\\PUT"));
		baseURI="https://rahulshettyacademy.com";
		Response POST_response = given().log().all().queryParam("key", "qaclick123")
				.filter(RequestLoggingFilter.logRequestTo(add3)).filter(ResponseLoggingFilter.logResponseTo(add3))
				.when().put("/maps/api/place/update/json").then().assertThat().statusCode(200).log().all().extract().response();
		
		 respo = POST_response.asString();

		 actual_code = String.valueOf(POST_response.getStatusCode());

		/*JsonPath JS_GET = new JsonPath(respo);
		String message = JS_GET.get("msg");
		System.out.println("message is :- " + message);*/

		start_test("Expected and Actual status code should match as 200 FOR PUT REQUEST");

		if (actual_code.equalsIgnoreCase(expected_code)) {
			PassTest("Expected and Actual result is matched as 200 FOR PUT REQUEST");
		} else {
			fail_test("Expected and Actual result is not matched as 200 FOR PUT REQUEST");
		}
	}
	
	@Test(priority = 4)
	private static void DELETE() throws FileNotFoundException {
		
		 expected_code = property.getProperty("expected_status_code_for_DELETE");
		 String updated_place_id = property.getProperty("place_id");
		
		PrintStream add4 = new PrintStream(new FileOutputStream("src\\main\\resources\\FILE\\DELETE"));
		baseURI="https://rahulshettyacademy.com";
		Response DELETE_response = given().log().all().queryParam("key", "qaclick123").body("{\r\n"
				+ "    \"place_id\":\""+updated_place_id+"\"\r\n"
				+ "}")
				.filter(RequestLoggingFilter.logRequestTo(add4)).filter(ResponseLoggingFilter.logResponseTo(add4))
				.when().delete("/maps/api/place/delete/json").then().assertThat().statusCode(200).log().all().extract().response();
		
		 respo = DELETE_response.asString();

		 actual_code = String.valueOf(DELETE_response.getStatusCode());

		JsonPath JS_GET = new JsonPath(respo);
		String message = JS_GET.get("status");
		System.out.println("message is :- " + message);

		start_test("Expected and Actual status code should match as 200 FOR DELETE REQUEST");

		if (actual_code.equalsIgnoreCase(expected_code)) {
			PassTest(DELETE_response.asPrettyString());
		} else {
			fail_test("Expected and Actual result is not matched as 200 FOR DELETE REQUEST");
		}
	}

}

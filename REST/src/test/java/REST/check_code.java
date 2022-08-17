package REST;

import static io.restassured.RestAssured.get;
import static org.testng.Assert.assertEquals;

import org.apache.http.client.methods.HttpPost;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class check_code {

	@Test(enabled = false)
	public static void test() {

		Response rep = get(
				"https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=8b2dc8b8afba34e13fc524616e985c14");

		// Response
		// rep1=RestAssured.get("https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=8b2dc8b8afba34e13fc524616e985c14");
		//RestAssured.baseURI="";
		int code = rep.statusCode();
		
		System.out.println("Response code is " + code);

		assertEquals(code, 200);
	}

	@Test
	public static void test1() {

		Response rep = get(
				"https://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=8b2dc8b8afba34e13fc524616e985c14");

		String data = rep.asString();

		System.out.println("Response data is " + data);

		System.out.println("response time is " + rep.getTime());
	}

}

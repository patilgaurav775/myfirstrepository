package Library_API;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import REST.POST_BODY;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class POST {
	
	@DataProvider(name="data_provider")
	public Object[][] getData(){
		Object[][] aa= {{"lmn","678"},{"opq","697"},{"rst","574"}};
		return aa;
	}
	
	@DataProvider(name="data_provider_id")
	public Object[][] DELETE_Data(){
		Object[][] aa= {{"svy99889"}};
		return aa;
	}
	
	@Ignore
	@Test(dataProvider ="data_provider" ,priority = 1)
	public static void POST(String isbn,String aisel) {                  //addbook method madhe parameter takle
		baseURI="http://216.10.245.166";
		String respost=given().body(POST_BODY.addbook(isbn,aisel)).header("Content-Type","application/json").log().all()
				.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(respost+"............................");
		
		JsonPath js=new JsonPath(respost);
		String aa=js.getString("Msg");
		System.out.println(aa+" is the id");
		
		
	}
	
	@Ignore
	@Test(dataProvider ="data_provider_id",priority = 2 )
	public static void DELETE(String ID) {
		baseURI="http://216.10.245.166";
		String respost=given().log().all().body(POST_BODY.deletebook(ID)).when().delete("/Library/DeletetBook.php")
				.then().log().all().assertThat().statusCode(200).extract().response().asString();
	}
	
	
	@Ignore
	@Test(priority = 2)
	public static void GET_DATA_FROM_FILE() throws IOException {
		baseURI="http://216.10.245.166";
		String respost=given().log().all()
				.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\PCP\\Desktop\\REST ASSURED UDEMY\\data.json"))))
				.when().get("/Library/GetBook.php")
				.then().log().all().assertThat()
				.statusCode(200).extract().response().asString();
	}
	


@Test(priority = 1)
	public static void POST1() {                  //addbook method madhe parameter takle
		baseURI="http://216.10.245.166";
		String respost=given().log().all().body("{\r\n"
				+ "\"name\":\"Learn Appium Automation with Jawa\",\r\n"
				+ "\"isbn\":\"Gaurv\",\r\n"
				+ "\"aisle\":\"777\",\r\n"
				+ "\"author\":\"John foe\"\r\n"
				+ "\r\n"
				+ "}").when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		System.out.println(respost+"............................");
		JsonPath js=new JsonPath(respost);
		String aa=js.get("Msg");
		System.out.println(aa+" is the message");
		
		
	}


@Test
public static void GET1() {
	baseURI="http://216.10.245.166";
	String respost=given().queryParam("ID", "Gaurav777").log().all().when().get("/Library/GetBook.php")
	.then().log().all().assertThat().statusCode(200).extract().response().asString();
	System.out.println(respost);
	
	JsonPath js=new JsonPath(respost);
	String aa=js.getString("author");
	System.out.println(aa+" is the authors name");
	
}

@Test(priority = 2 )
public static void DELETE1() {
	baseURI="http://216.10.245.166";
	String respost=given().log().all().body("{\r\n"
			+ "    \"ID\": \"Gaurav777\"\r\n"
			+ "}").when().delete("/Library/DeletetBook.php")
			.then().log().all().assertThat().statusCode(200).extract().response().asString();
}

}

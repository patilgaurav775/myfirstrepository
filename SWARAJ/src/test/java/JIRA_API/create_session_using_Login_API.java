package JIRA_API;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import Package.properties;
import REST.POST_BODY;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class create_session_using_Login_API extends properties {
public static String value;
	@Test
	public static void CREATE_SESSION() throws FileNotFoundException {
		
		
		        ///////////////////////////////////////CREATE SESSION////////////////////////////////////////////////////////////
		
		PrintStream add = new PrintStream(new FileOutputStream("src\\main\\resources\\FILE\\CREATE SESSION FILE"));
		
		baseURI="http://localhost:8081";
		///////////////////////////////////////////////////////////////////////////////////////////////
		SessionFilter session=new SessionFilter();
		///////////////////////////////////////////////////////////////////////////////////////////////
		
		
		String respo=given()
				
				.relaxedHTTPSValidation().  //relaxes validation in https
				
				log().all().header("Content-Type", "application/json")
				.filter(RequestLoggingFilter.logRequestTo(add)).filter(ResponseLoggingFilter.logResponseTo(add))
				.body(POST_BODY.create_session_body("patil775gaurav","Gaurav@123"))
				.filter(session)
				.when().post("/rest/auth/1/session").then()
				.assertThat().statusCode(200).log().all().extract().response().asString();
		
		JsonPath js=new JsonPath(respo);
		String Value=js.get("session.value");
		String Name=js.getString("session.name");
		String value=Name.concat("=").concat(Value);
		System.out.println("name  of HEADER VALUE is>>>>>>"+value);
		
		property.setProperty("VALUE_OF_SESSION_CREATED", value);
		FileOutputStream test=new FileOutputStream("src/main/resources/PROPERTIES/prop.properties");
		try {
			property.store(test, "updated value for session in JIRA");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 ///////////////////////////////////////ADD COMMENT////////////////////////////////////////////////////////////
		String expected_comment="HELLO LUCIFER";
		String respo1=given().pathParam("id", "10004").header("Content-Type", "application/json")
				.body(POST_BODY.add_comment(expected_comment))
				.filter(RequestLoggingFilter.logRequestTo(add)).filter(ResponseLoggingFilter.logResponseTo(add))
				.filter(session)
				.log().all().when().post("/rest/api/2/issue/{id}/comment").then().assertThat()
				.statusCode(201).log().all().extract().response().asString();
		
		JsonPath jsss=new JsonPath(respo1);
		String id=jsss.getString("id");
		
		
		
		 ///////////////////////////////////////ADD ATTATCHMENT////////////////////////////////////////////////////////////
		
		given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key", "10004")
		
 		.header("Content-Type","multipart/form-data")
		
		.multiPart("file",new File("src\\main\\resources\\FILE\\jira.txt"))
		
		.log().all().when().post("/rest/api/2/issue/{key}/attachments")
		.then().log().all().assertThat().statusCode(200).extract().response();
		
		 ///////////////////////////////////////GET LIMITED FEILDS FROM ISSUE////////////////////////////////////////////////////////////
		
		String re=given().filter(session).pathParam("key", "10004")
		.queryParam("fields","comment").log().all().when().get("/rest/api/2/issue/{key}")
		.then().log().all().extract().response().asString();
		
		JsonPath jss=new JsonPath(re);
		
		int size=jss.getInt("fields.comment.comments.size()");
		
		for(int i=0;i<size;i++) {
			String actual_id=jss.get("fields.comment.comments["+i+"].id").toString();
		
		if (id.equalsIgnoreCase(actual_id)) {
			String msg=jss.get("fields.comment.comments["+i+"].body").toString();
			System.out.println(msg);
			Assert.assertEquals(msg, expected_comment);
		}
		}
	}
	
	
	
	
	
}

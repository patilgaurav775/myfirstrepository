package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import REST.POST_BODY;
import io.restassured.path.json.JsonPath;

public class nodes_in_json {
	
	int price=0;
	int copies=0;
	
	@Test(priority = 0)
	public static void complex_json_parse() {
		
		JsonPath js=new JsonPath(POST_BODY.course_price());
		int count_cources=js.getInt("courses.size()");                //>>>>to get size of array
		System.out.println("count of total cources are >- "+count_cources);
		
		int purchase_amount=js.getInt("dashboard.purchaseAmount");
		System.out.println("purchase amount is >- "+purchase_amount);    //>>>>purchase amount
		
		String first_course=js.get("courses[0].title");
		System.out.println("first course title is >- "+first_course);     //>>>>first course title
		
		String second_course=js.get("courses[2].title");
		System.out.println("second course title is >- "+second_course);     //>>>>second course title
		
		for(int i=0;i<count_cources;i++) {
			
			String title=js.get("courses["+i+"].title");
			System.out.println(title);
			
			String price=js.get("courses["+i+"].price").toString();
			System.out.println(price);
			
			
			
		}
		
		int copies_count=js.getInt("courses[2].copies");
		System.out.println("copies count for third course is >>>--"+copies_count);
		
		
		
		
		
		
	}
	
	@Test(priority = 1)
	public static void sum_verification() {
		JsonPath js=new JsonPath(POST_BODY.course_price());
		int count_cources=js.getInt("courses.size()");                //>>>>to get size of array
		System.out.println("count of total cources are >- "+count_cources);
		
		int purchase_amount=js.getInt("dashboard.purchaseAmount");
		System.out.println("purchase amount is >- "+purchase_amount);    //>>>>purchase amount
		
		int price_total=0;
		for(int i=0;i<count_cources;i++) {
			int price=(js.getInt("courses["+i+"].price"));
			int copies=(js.getInt("courses["+i+"].copies"));
			int total=price*copies;
			System.out.println(total);
			
			price_total=price_total+total;
			
		}
		System.out.println(price_total);
		Assert.assertEquals(price_total, purchase_amount);
		if (price_total==purchase_amount) {
			System.out.println("TOTAL OF AMOUNT MATCHES");
		}
		else {
			System.out.println("TOTAL OF AMOUNT not MATCHES");
		}
	}
}

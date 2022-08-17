package REST;

public class POST_BODY {

	public static String all() {
		return "{\r\n"
				+ "\r\n"
				+ "  \"location\": {\r\n"
				+ "\r\n"
				+ "    \"lat\": -38.383494,\r\n"
				+ "\r\n"
				+ "    \"lng\": 33.427362\r\n"
				+ "\r\n"
				+ "  },\r\n"
				+ "\r\n"
				+ "  \"accuracy\": 50,\r\n"
				+ "\r\n"
				+ "  \"name\": \"Gaurav house\",\r\n"
				+ "\r\n"
				+ "  \"phone_number\": \"(+91) 932 284 7574\",\r\n"
				+ "\r\n"
				+ "  \"address\": \"953, vivekanand nagar pachora, cohen 09\",\r\n"
				+ "\r\n"
				+ "  \"types\": [\r\n"
				+ "\r\n"
				+ "    \"shoe park\",\r\n"
				+ "\r\n"
				+ "    \"shop\"\r\n"
				+ "\r\n"
				+ "  ],\r\n"
				+ "\r\n"
				+ "  \"website\": \"http://google.com\",\r\n"
				+ "\r\n"
				+ "  \"language\": \"English-IN\"\r\n"
				+ "\r\n"
				+ "}";
	}
	
	public static String course_price() {
		return "{\r\n"
				+ "  \"dashboard\":{\r\n"
				+ "    \"purchaseAmount\":1310,\r\n"
				+ "    \"website\":\"rahulshettyacademy.com\"\r\n"
				+ "  },\r\n"
				+ "  \"courses\":[\r\n"
				+ "    {\r\n"
				+ "    \"title\":\"Selenium Python\",\r\n"
				+ "    \"price\": 50,\r\n"
				+ "    \"copies\": 6\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "    \"title\":\"Cypress\",\r\n"
				+ "    \"price\":40,\r\n"
				+ "    \"copies\":4\r\n"
				+ "    },\r\n"
				+ "    {\r\n"
				+ "    \"title\":\"RPA\",\r\n"
				+ "    \"price\":45,\r\n"
				+ "    \"copies\":10\r\n"
				+ "    },\r\n"
				+ "     {\r\n"
				+ "    \"title\":\"selenium\",\r\n"
				+ "    \"price\":40,\r\n"
				+ "    \"copies\":10\r\n"
				+ "    }\r\n"
				+ "  ]\r\n"
				+ "}";
	}

	
	
	public static String addbook(String isbn, String aisel) {
		String body="{\r\n"
				+ "    \"name\":\"Learn Appium Automation with Java\",\r\n"
				+ "    \"isbn\":\""+isbn+"\",\r\n"
				+ "    \"aisel\":\""+aisel+"\",\r\n"
				+ "    \"author\":\"Gaurav Patil\"\r\n"
				+ "}";
		return body;
	}
	
	public static String deletebook(String ID) {
		String body="{\r\n"
				+ "   \"ID\":\""+ID+"\"\r\n"
				+ "}";
		return body;
	}
	
	public static String create_session_body(String USERNAME,String PASSWORD) {
		String body="{ \r\n"
				+ "    \"username\": \""+USERNAME+"\", \r\n"
				+ "    \"password\": \""+PASSWORD+"\" \r\n"
				+ "}";
		return body;
	}
	
	public static String add_comment(String COMMENT) {
		String body="{\r\n"
				+ "    \"body\": \""+COMMENT+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}";
		return body;
	}
}

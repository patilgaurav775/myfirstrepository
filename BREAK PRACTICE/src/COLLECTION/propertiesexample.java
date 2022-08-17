package COLLECTION;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;




public class propertiesexample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		
		Properties obj=new Properties();
		
		obj.load(new FileInputStream( ".\\config\\config.properties"));
		
		System.out.println(obj.get("url"));
		
		obj.setProperty("url","patilgaurav775@gmail.com");
		
		System.out.println(obj.get("url"));
		
		obj.store(new FileOutputStream(".\\config\\config.properties"), "changed");
		
		
		
		
		
		
		
	
	/*	//to read property file we need to create property class object
		Properties prop=new Properties();
		
		prop.load(new FileInputStream("./config/config.properties"));  //file madhle read karayla file input stream
			
		System.out.println(prop.getProperty("browsername"));
		
		prop.setProperty("url", "facebook.com");
		System.out.println(prop.getProperty("url"));
		
	//	FileOutputStream test =new FileOutputStream("./config/config.properties");  //file madhle read karayla file output stream
		prop.store(new FileOutputStream("./config/config.properties"), "changing value");*/
		
	}

}

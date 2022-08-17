package com.Util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class Propertiesfile {
	
	
	public static Properties loadprop(String path) throws IOException {
		FileInputStream file=new FileInputStream(path);
	   Properties prop=new Properties();
	   prop.load(file);
	   return prop;
	}
	
	public static PrintStream responcefile(String path) throws FileNotFoundException {
		
		PrintStream pr=new PrintStream(new FileOutputStream(path));
		return pr;
	}

	

}

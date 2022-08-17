package EXCEPTION;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptionwiththrows {

	public static void main(String[] args) {
		exceptionwiththrows name = new exceptionwiththrows();
		name.m1();
	}
public void m1() {
	//we are reading the file and it may throw filenotfoundexception
	//filenotfoundexception comes under check exception so compiler will force you to handle it
	try {
		FileReader test = new FileReader(new File(" "));
	} catch (FileNotFoundException e) {

		e.printStackTrace();
	}
}


}

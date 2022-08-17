package EXCEPTION;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwswithdiffertmethod {

	public static void main(String[] args) {
		throwswithdiffertmethod name = new throwswithdiffertmethod();
		name.m1();
	}
	
	public void m1() {
		try {
			m2();
		} catch (Exception  e) {
			System.out.println("this is excepion chaining");
			e.printStackTrace();
		}
	}

	public void m2() throws FileNotFoundException,NullPointerException {
		m3();
	}

	public void m3() throws FileNotFoundException{
		m4();
	}

	public void m4() throws FileNotFoundException {
		System.out.println("-----------------");
		FileReader test = new FileReader(new File(" "));
		
	}
}

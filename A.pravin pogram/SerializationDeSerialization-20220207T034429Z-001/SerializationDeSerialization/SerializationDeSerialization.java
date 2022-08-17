package SerializationDeSerialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Sample implements Serializable {
	int a = 10;
	int b = 20;
}

public class SerializationDeSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Sample s1 = new Sample();

		/*
		 * Serialization : it is a process of converting object of java supported form
		 * to either file supported form or network supported form
		 */
		FileOutputStream fos = new FileOutputStream("sample.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);

		/*
		 * De-Serialization : it is a process of converting file supported form or
		 * network supported form into a object of java supported form
		 */

		FileInputStream fis = new FileInputStream("sample.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Sample s2 = (Sample) ois.readObject();
		System.out.println(s2.a + " " + s2.b);
	}

}

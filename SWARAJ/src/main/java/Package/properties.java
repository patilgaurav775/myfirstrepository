package Package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;

public class properties extends report_extend{
	
	
	@BeforeMethod(alwaysRun = true)
	public static void prop() {
		try {
			property = new Properties();
			FileInputStream file = new FileInputStream("src/main/resources/PROPERTIES/prop.properties");
			property.load(file);
		} catch (IOException e) {
		}
	}
}

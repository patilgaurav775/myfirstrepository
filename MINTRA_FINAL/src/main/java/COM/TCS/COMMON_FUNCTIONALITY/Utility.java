package COM.TCS.COMMON_FUNCTIONALITY;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utility extends Reporter{

	public static String screen_capture() {
		Date onlydate=new Date();
		String datename=new SimpleDateFormat("dd/MM/yyyy-hh-mm-ss").format(onlydate);
		TakesScreenshot scr=(TakesScreenshot) driver;
		File file=scr.getScreenshotAs(OutputType.FILE);
		String destination=filepath+"/"+datename+".png";
		File locate=new File(destination);
		try {
			FileUtils.copyFile(file, locate);
		} catch (IOException e) {
		
		}
		
		return datename+".png";
	}
	
	
	
}

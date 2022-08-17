
package DOM.INFOSYS.COMMONFUNCTIONALITY;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UTILITY extends REPORTER {


	public static String screen_capture() {
		Date onlydate=new Date();
		String datename=new SimpleDateFormat("dd/MM/yyyy-hh-mm-ss").format(onlydate);
		TakesScreenshot scr=(TakesScreenshot) driver;
		File scrfileFile=scr.getScreenshotAs(OutputType.FILE);
		String destination=file_path+"/"+datename+".png";
		File locate=new File(destination);
		try {
		FileUtils.copyFile(scrfileFile, locate);
		
		}
		catch(IOException a){
			//a.printStackTrace();
		}
		
		return datename+".png";
		
		}
		
	}


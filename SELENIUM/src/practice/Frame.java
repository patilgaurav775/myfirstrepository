package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public  Frame() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()+"\n");
		
		String a=driver.getWindowHandle();   
		
		System.out.println(a+" is the unique id of current window"+"\n");
		
		
		//transferring coomand from window to frame1
		WebElement frame=driver.findElement(By.cssSelector("iframe[id='frame1']"));
		
		driver.switchTo().frame(frame);
		
		WebElement frame1=driver.findElement(By.id("sampleHeading"));
		
		System.out.println("frame 1 text is :- "+frame1.getText()+"\n");
		
		//transferring coomand from frame1 to window
		
		driver.switchTo().defaultContent();          //default content method use keli aahe
		
		//transferring coomand from frame1 to frame2
		
		WebElement framee=driver.findElement(By.cssSelector("iframe[id='frame2']"));
		
		driver.switchTo().frame(framee);
	
		WebElement frame2=driver.findElement(By.id("sampleHeading"));
		
		System.out.println("frame 2 text is :- "+frame2.getText()+"\n");
		
		String p="//div[@id='frame1Wrapper']//preceding-sibling::div";
		
		driver.switchTo().defaultContent();                    //default content method hi rame madhun parat vapas window var aante but this method is not for window
		
		WebElement text=driver.findElement(By.xpath(p));
		
		System.out.println(text.getText());
		
		
		
		
		
		
	}

}

package crossBrowsers;

public class dfgvrf {

	
	public void name(String browser) {
		if (browser.equalsIgnoreCase("ChromeHeadless"))

			

			ChromeDriverManager.chromedriver().setup(); 
		ChromeOptions chromeOptions = new ChromeOptions(); 
		chromeOptions.addArguments("--headless"); driver = new ChromeDriver(chromeOptions); 
		System.out.println("Chrome Headless Driver launched");

			//Many 'else' statements can be written for each browser. We will work with the PhantomJS Headless Browser.

			else if (browser.equalsIgnoreCase("PhantomJS"))

			DesiredCapabilities caps = new DesiredCapabilities();

			caps.setJavascriptEnabled(true);

			caps.setCapability(PhantomJSDriverService.PHANTOMIS EXECUTAB LE_PATH PROPERTY, "/projects/challenge/phantomjs-2.1.1-linux x86_64/bin/phantomjs");

			driver = new PhantomJSDriver(caps);

			System.out.println("PhantomJS Headless Driver launched");

			}
	}
}

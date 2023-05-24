package com.teachaway.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage extends ConfigurationReader{
	private static WebDriver driver;
	private String url;
	private ConfigurationReader configReader;

	public BasePage() {
//		prop = new Properties();
//		FileInputStream data = new FileInputStream(
//				System.getProperty("user.dir")+"\\ecommerce.config.properties");
//		prop.load(data);//load data into prop object
		
	}

	public static WebDriver getDriver(){

		if (driver == null) {
			String browserType = ConfigurationReader.getProperty("browser");
			switch (browserType) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				break;
//			case "firefox":
//				//code for firefox driver
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		return driver;
		
	}

	

	public static void takeSnapshot(WebDriver webdriver) throws IOException {
		File srcFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir")+"\\target\\screenshots\\" + timestamp() + ".png");

		FileUtils.copyFile(srcFile, destFile);
	
	}

	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	public static void quit() {
		driver.quit();
	}
}

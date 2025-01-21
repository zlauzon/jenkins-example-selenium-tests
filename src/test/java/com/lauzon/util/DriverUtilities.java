package com.lauzon.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtilities {
	private static DriverUtilities driverUtilities;
	private WebDriver driver;
	
	public DriverUtilities() {
		super();
	}
	
	public static DriverUtilities getInstance() {
		if (driverUtilities == null)
			driverUtilities = new DriverUtilities();
		return driverUtilities;
	}
	
	public WebDriver getDriver() {
		if (driver == null)
			createDriver();
		return driver;
	}
	
	public void createDriver() {
		String driverName = getDriverName();
		
		if (driverName.equals("google chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			this.driver = new ChromeDriver();
		} else if (driverName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
			this.driver = new FirefoxDriver();
		} else {
			System.out.println("Browser name is invalid");
		}
	}
	
	public String getDriverName() {
		String driverName = "";
		Properties config = new Properties();
		try {
			config.load(new FileInputStream("src/test/resources/config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(String key : config.stringPropertyNames())
			if (key.equals("browser"))
				driverName = config.getProperty(key);
		
		return driverName;
	}
}
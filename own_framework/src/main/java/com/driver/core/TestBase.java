package com.driver.core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;

	public void driverInitialization() throws Exception {
		String browserName;
		if(System.getProperty("browser")!= null)
		{
			browserName = System.getProperty("browser");
		}
		else
		{
			throw new Exception("Browser not set in pom.xml file.");
		}

		if(browserName.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
	}

	public void navigateToApplication() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(120));
		driver.get(System.getProperty("serverUrl"));
		driver.manage().window().maximize();
	}

	public void quitDriver() {
		driver.quit();
	}
}

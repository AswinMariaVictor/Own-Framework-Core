package com.driver.core;

import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.driver.core.driver_factory.ChromeDriverFactory;
import com.driver.core.driver_factory.DriverManagerFactory;
import com.driver.core.driver_factory.FireFoxDriverFactory;

public class TestBase {
	public WebDriver driver;

	public void driverInitialization() throws Exception {
		String browserName;
		if (System.getProperty("browser") != null) {
			browserName = System.getProperty("browser").toLowerCase();
		} else {
			throw new Exception("Browser not set in pom.xml file.");
		}
		Map<String, DriverManagerFactory> driverFactoryMap = Map.of("chrome", new ChromeDriverFactory(), "firefox",
				new FireFoxDriverFactory());
		driver = driverFactoryMap.get(browserName).getDriver().initializeDriver();
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
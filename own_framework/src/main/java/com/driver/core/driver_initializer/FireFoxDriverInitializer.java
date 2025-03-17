package com.driver.core.driver_initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverInitializer implements DriverInitializer {

	@Override
	public WebDriver initializeDriver() {
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}

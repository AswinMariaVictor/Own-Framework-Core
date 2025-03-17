package com.driver.core.driver_initializer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverInitializer implements DriverInitializer {

	@Override
	public WebDriver initializeDriver() {
		WebDriver driver = new ChromeDriver();
		return driver;
	}
}
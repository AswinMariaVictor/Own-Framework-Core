package com.driver.core.driver_factory;

import com.driver.core.driver_initializer.ChromeDriverInitializer;
import com.driver.core.driver_initializer.DriverInitializer;

public class ChromeDriverFactory implements DriverManagerFactory {

	@Override
	public DriverInitializer getDriver() {
		return new ChromeDriverInitializer();
	}
}
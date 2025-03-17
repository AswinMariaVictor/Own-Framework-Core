package com.driver.core.driver_factory;

import com.driver.core.driver_initializer.DriverInitializer;
import com.driver.core.driver_initializer.FireFoxDriverInitializer;

public class FireFoxDriverFactory implements DriverManagerFactory {

	@Override
	public DriverInitializer getDriver() {
		return new FireFoxDriverInitializer();
	}
}
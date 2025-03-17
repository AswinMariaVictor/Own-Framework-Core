package com.functional.pages;

import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.extensions.DriverExtensions;
import com.extensions.ElementExtensions;

import locators.Locator;

public class LoginPage {

	WebDriver _driver;

	public LoginPage(WebDriver driver) {
		this._driver = driver;
	}

	private final String emailinputFieldlocator = "//textarea[@name='q']";
	private final Supplier<WebElement> emailinputField = () -> DriverExtensions.locateElement(_driver, emailinputFieldlocator, Locator.LocatorType.Xpath);

	public void enterEmailInput(String input) {
		DriverExtensions.waitForElementVisibility(emailinputFieldlocator, _driver, Locator.LocatorType.Xpath);
		ElementExtensions.sendKeys(emailinputField, input);
	}

}

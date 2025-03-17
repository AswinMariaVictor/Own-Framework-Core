package com.extensions;

import java.util.function.Supplier;

import org.openqa.selenium.WebElement;

public class ElementExtensions {

	public static void clickOnAnElement(WebElement element) {
		element.click();
	}

	public static void sendKeys(Supplier<WebElement> element, String inputText) {
		element.get().sendKeys(inputText);
	}
	
	public static String getText(Supplier<WebElement> element)
	{
		return element.get().getText();
	}
}

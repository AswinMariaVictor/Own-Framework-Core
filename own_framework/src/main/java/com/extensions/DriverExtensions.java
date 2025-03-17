package com.extensions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.Locator;
import net.bytebuddy.matcher.EqualityMatcher;

public class DriverExtensions {

	public static WebElement locateElement(WebDriver driver, String elementLocator, Locator.LocatorType locatorType) {
		WebElement element;
		if (locatorType.equals(Locator.LocatorType.Xpath)) {
			element = driver.findElement(By.xpath(elementLocator));
		} else if (locatorType.equals(Locator.LocatorType.CssSelector)) {
			element = driver.findElement(By.cssSelector(elementLocator));
		} else if (locatorType.equals(Locator.LocatorType.Id)) {
			element = driver.findElement(By.id(elementLocator));
		} else if (locatorType.equals(Locator.LocatorType.Name)) {
			element = driver.findElement(By.name(elementLocator));
		} else if (locatorType.equals(Locator.LocatorType.ClassName)) {
			element = driver.findElement(By.className(elementLocator));
		} else if (locatorType.equals(Locator.LocatorType.TagName)) {
			element = driver.findElement(By.tagName(elementLocator));
		} else if (locatorType.equals(Locator.LocatorType.LinkText)) {
			element = driver.findElement(By.linkText(elementLocator));
		} else if (locatorType.equals(Locator.LocatorType.PartialLinkText)) {
			element = driver.findElement(By.partialLinkText(elementLocator));
		} else
			throw new NoSuchElementException();
		return element;
	}

	public static void waitForElementVisibility(String element, WebDriver driver, Locator.LocatorType locatorType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		if (locatorType.equals(Locator.LocatorType.Xpath)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
		} else if (locatorType.equals(Locator.LocatorType.CssSelector)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
		} else if (locatorType.equals(Locator.LocatorType.Id)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(element)));
		} else if (locatorType.equals(Locator.LocatorType.Name)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(element)));
		} else if (locatorType.equals(Locator.LocatorType.ClassName)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(element)));
		} else if (locatorType.equals(Locator.LocatorType.TagName)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(element)));
		} else if (locatorType.equals(Locator.LocatorType.LinkText)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(element)));
		} else if (locatorType.equals(Locator.LocatorType.PartialLinkText)) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(element)));
		} else
			throw new NoSuchElementException();
	}
	
	public static void waitForElementToBeClickable(String element, WebDriver driver, Locator.LocatorType locatorType) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		if (locatorType.equals(Locator.LocatorType.Xpath)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
		} else if (locatorType.equals(Locator.LocatorType.CssSelector)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(element)));
		} else if (locatorType.equals(Locator.LocatorType.Id)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.id(element)));
		} else if (locatorType.equals(Locator.LocatorType.Name)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.name(element)));
		} else if (locatorType.equals(Locator.LocatorType.ClassName)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.className(element)));
		} else if (locatorType.equals(Locator.LocatorType.TagName)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.tagName(element)));
		} else if (locatorType.equals(Locator.LocatorType.LinkText)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.linkText(element)));
		} else if (locatorType.equals(Locator.LocatorType.PartialLinkText)) {
			wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(element)));
		} else
			throw new NoSuchElementException();
	}
}
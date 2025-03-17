package com.functional.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.driver.core.TestBase;
import com.functional.pages.LoginPage;
import com.functional.testdata.*;

public class LoginTest extends TestBase {
	
	LoginPage loginPage;
	
	@BeforeClass 
	public void oneTimeSetUp() throws Exception
	{
		driverInitialization();
		loginPage = new LoginPage(driver);
	}
	
	@BeforeMethod
	public void setUp()
	{
		navigateToApplication();
	}
	
	@AfterMethod
	public void tearDown()
	{
		
	}
	
	@AfterClass
	public void oneTimeTearDown()
	{
		quitDriver();
	}
	
	@Test(priority = 1)
	public void testLogIn()
	{
		loginPage.enterEmailInput(ApplicationTestData.userEmail);
	}
	

}

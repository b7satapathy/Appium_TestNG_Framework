/**
 * 
 */
package com.qa.testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.screens.HomeScreen;
import com.qa.testbase.CreateSession;

/**
 * @author Biswajit Satapathy
 *
 */
public class HomeScreenTest extends CreateSession{

	public HomeScreenTest() {
		super();
	}

	HomeScreen home;

	
	@Test(alwaysRun=true)
	public void clickOnENbuttonAndDecline() {
		home = new HomeScreen(driver);
		assertEquals(home.clickOnENbuttonAndDecline(), true);
	}

	@Test(dependsOnMethods={"clickOnENbuttonAndDecline"},alwaysRun=true)
	public void clickOnRegistrationButtonAndNavigateBack() throws InterruptedException {
		home = new HomeScreen(driver);
		assertEquals(home.clickOnRegistrationButtonAndNavigateBack(), true);
	}
	
	@Test(dependsOnMethods={"clickOnRegistrationButtonAndNavigateBack"},alwaysRun=true)
	public void enterTextInTextBox() {
		home = new HomeScreen(driver);
		assertEquals(home.enterTextInTextBox(), "Appium Automation");
	}
	
	@Test(dependsOnMethods={"enterTextInTextBox"},alwaysRun=true)
	public void clickOnProgressBar() throws InterruptedException {
		home = new HomeScreen(driver);
		assertEquals(home.clickOnProgressBar(), true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

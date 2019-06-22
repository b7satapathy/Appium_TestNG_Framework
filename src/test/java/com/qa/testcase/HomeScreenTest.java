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
	
	@Test(dependsOnMethods={"clickOnProgressBar"},alwaysRun=true)
	public void checkAndUncheckIAcceptAddsButton() throws InterruptedException {
		home = new HomeScreen(driver);
		assertEquals(home.checkAndUncheckIAcceptAddsButton(), false);
	}
	
	@Test(dependsOnMethods={"checkAndUncheckIAcceptAddsButton"},alwaysRun=true)
	public void getText() throws InterruptedException {
		home = new HomeScreen(driver);
		assertEquals(home.getText(), "Text is sometimes displayed");
	}
	
	@Test(dependsOnMethods={"getText"},alwaysRun=true)
	public void clickOnGetToastButton() throws InterruptedException {
		home = new HomeScreen(driver);
		home.clickOnGetToastButton();
	}
	
	@Test(enabled=false)
	public void clickOnDisplayPopUpWindowButton() throws InterruptedException {
		home = new HomeScreen(driver);
		home.clickOnDisplayPopUpWindowButton();
	}
	
	@Test(enabled=false)
	public void touchActions() throws InterruptedException {
		home = new HomeScreen(driver);
		assertEquals(home.touchActions(), "FLICK");
	}
	
	@Test(dependsOnMethods={"clickOnGetToastButton"},alwaysRun=true)
	public void switchToCanvas() throws InterruptedException {
		home = new HomeScreen(driver);
		home.switchToCanvas();
	}
	
	
	
	
	
	
	
	
	
}

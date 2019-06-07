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
	public void isENbuttonEnabled() {
		home = new HomeScreen(driver);
		assertEquals(true, home.isENbuttonEnabled());
	}

	//@Test(dependsOnMethods={"clickOnTapToAddASaleButton"}, alwaysRun=true)
	
	
}

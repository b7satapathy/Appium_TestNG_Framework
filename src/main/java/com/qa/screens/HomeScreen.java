/**
 * 
 */
package com.qa.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.testbase.CreateSession;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * @author Biswajit Satapathy
 *
 */
public class HomeScreen extends CreateSession{

	@AndroidFindBy(id = "buttonTest")
	MobileElement ENbutton;
	
	@AndroidFindBy(id = "android:id/button1")
	MobileElement iAgreeButton;
	
	@AndroidFindBy(id = "android:id/button2")
	MobileElement declineButton;
	
	@AndroidFindBy(id = "startUserRegistration")
	MobileElement registrationButton;
	
	@AndroidFindBy(id = "my_text_field")
	MobileElement textField;
	
	@AndroidFindBy(id = "waitingButtonTest")
	MobileElement showProgressBarforAwhileButton;
	
	@AndroidFindBy(id = "input_adds_check_box")
	MobileElement checkBox;
	
	@AndroidFindBy(id = "visibleButtonTest")
	MobileElement displayTextViewButton;
	
	@AndroidFindBy(id = "showToastButton")
	MobileElement displayToastButton;
	
	@AndroidFindBy(id = "exceptionTestButton")
	MobileElement exceptionButton;
	
	@AndroidFindBy(id = "exceptionTestField")
	MobileElement exceptionTextField;
	
	@AndroidFindBy(id = "topLevelElementTest")
	MobileElement focusLayoutButton;
	
	@AndroidFindBy(id = "touchTest")
	MobileElement touchActionsButton;
	
	@AndroidFindBy(id = "inputUsername")
	MobileElement userName;
	
	
	 
	public HomeScreen(AndroidDriver<MobileElement> driver) {
		CreateSession.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	public boolean clickOnENbuttonAndDecline() {
		ENbutton.click();
		declineButton.click();
		return ENbutton.isEnabled();
	}
	
	public boolean clickOnRegistrationButtonAndNavigateBack() throws InterruptedException {
		registrationButton.click();
		driver.hideKeyboard();
		Thread.sleep(2000);
		driver.navigate().back();
		return registrationButton.isEnabled();
	}
	
	public String enterTextInTextBox() {
		textField.sendKeys("Appium Automation");
		driver.hideKeyboard();
		return textField.getText();
	}
	
	public boolean clickOnProgressBar() throws InterruptedException {
		showProgressBarforAwhileButton.click();
		Thread.sleep(15000);
		driver.navigate().back();
		driver.navigate().back();
		return showProgressBarforAwhileButton.isEnabled();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

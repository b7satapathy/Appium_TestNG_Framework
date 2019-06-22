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
import com.qa.testbase.GenericMethods;

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
	
	@AndroidFindBy(id = "visibleTextView")
	MobileElement visibleText;
	
	@AndroidFindBy(id = "showToastButton")
	MobileElement displayToastButton;
	
	@AndroidFindBy(id = "showPopupWindowButton")
	MobileElement PopupWindowButton;
	
	@AndroidFindBy(id = "exceptionTestButton")
	MobileElement exceptionButton;
	
	@AndroidFindBy(id = "exceptionTestField")
	MobileElement exceptionTextField;
	
	@AndroidFindBy(id = "topLevelElementTest")
	MobileElement focusLayoutButton;
	
	@AndroidFindBy(id = "touchTest")
	MobileElement touchActionsButton;
	
	@AndroidFindBy(id = "gesture_type_text_view")
	MobileElement gestureText;
	
	@AndroidFindBy(id = "canvas_button")
	MobileElement canvasButton;
	
	
	 
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
		Thread.sleep(2000);
		driver.navigate().back();
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
	
	public boolean checkAndUncheckIAcceptAddsButton() throws InterruptedException {
		checkBox.click();
		Thread.sleep(1000);
		checkBox.click();
		Thread.sleep(1000);
		return checkBox.isSelected();
	}
	
	public String getText() throws InterruptedException {
		displayTextViewButton.click();
		Thread.sleep(1000);
		return visibleText.getText();
	}
	
	public void clickOnGetToastButton() {
		displayToastButton.click();
	}
	
	public void clickOnDisplayPopUpWindowButton() {
		PopupWindowButton.click();
		driver.switchTo().alert().dismiss();
	}
	
	public String touchActions() {
		touchActionsButton.click();
		GenericMethods gm = new GenericMethods();
		gm.rightSwipe();
		return gestureText.getText();
	}
	
	public void switchToCanvas() {
		touchActionsButton.click();
		canvasButton.click();
		GenericMethods gm = new GenericMethods();
		gm.drawAline();
		driver.navigate().back();
		driver.navigate().back();
	}
	
	
	
	
	
	
	
	
	
}

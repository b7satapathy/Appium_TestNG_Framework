/**
 * 
 */
package com.qa.screens;

import org.openqa.selenium.support.PageFactory;

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
	
	@AndroidFindBy(id = "button1")
	MobileElement iAgreeButton;
	
	@AndroidFindBy(id = "button2")
	MobileElement noButton;
	
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
	 
	public HomeScreen(AndroidDriver<MobileElement> driver) {
		CreateSession.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public boolean isENbuttonEnabled() {
		return ENbutton.isEnabled();
	}
}

package com.qa.testbase;

import static org.testng.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class GenericMethods {

	public void rightSwipe() {
		Dimension screenSize = driver.manage().window().getSize();
		int startX = (int) (screenSize.getWidth() * 0.90);
		int startY = (int) (screenSize.getHeight() / 2);
		int endX = (int) (screenSize.getWidth() * 0.05);
		int endY = (int) (screenSize.getHeight() / 2);

		action = new TouchAction(driver);
		action.press(PointOption.point(startX, startY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
				.moveTo(PointOption.point(endX, endY)).release().perform();
	}

	public void leftSwipe() {
		Dimension screenSize = driver.manage().window().getSize();
		int startx = (int) (screenSize.getWidth() * 0.05);
		int starty = (int) (screenSize.getHeight() / 2);
		int endx = (int) (screenSize.getWidth() * 0.90);
		int endy = (int) (screenSize.getHeight() / 2);

		action = new TouchAction(driver);
		action.press(PointOption.point(startx, starty)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
				.moveTo(PointOption.point(endx, endy)).release().perform();
	}
	
	public void scrollToBottom() {
		
		AndroidElement list = (AndroidElement) driver.findElement(By.className("android.widget.ScrollView"));

		MobileElement listGroup = list
				.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().resourceId(\"enter ID here \"))"));
		assertNotNull(listGroup.getLocation());
		listGroup.isEnabled();

   }
	
	public String getTodaysDate() {
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formatter.format(date);
		return strDate;
	}
	
	
	
	
}

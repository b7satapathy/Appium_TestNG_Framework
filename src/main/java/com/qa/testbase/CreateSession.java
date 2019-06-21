package com.qa.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CreateSession {

	public static AndroidDriver<MobileElement> driver;
	public static Properties prop;
	public static FileInputStream fis;
	public TouchAction action;

	public CreateSession() {

		try {
			prop = new Properties();
			fis = new FileInputStream("src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public boolean checkIfServerIsRunnning(int port) {

		boolean isServerRunning = false;
		ServerSocket serverSocket;
		try {
			serverSocket = new ServerSocket(port);
			serverSocket.close();
		} catch (IOException e) {

			// If control comes here, then it means that the port is in use
			isServerRunning = true;

		} finally {
			serverSocket = null;
		}
		return isServerRunning;
	}

	public void startServer() {
		CommandLine cmd = new CommandLine("F:\\Z_Personal_Projects\\nodeJSPath\\node.exe");
		cmd.addArgument("C:\\Users\\ASUS\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		cmd.addArgument("--address");
		cmd.addArgument("0.0.0.0");
		cmd.addArgument("--port");
		cmd.addArgument("4723");

		DefaultExecuteResultHandler handler = new DefaultExecuteResultHandler();
		DefaultExecutor executor = new DefaultExecutor();
		executor.setExitValue(1);
		try {
			executor.execute(cmd, handler);
			Thread.sleep(10000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void stopServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("taskkill /F /IM node.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeSuite
	public void startAppiumServer() {
		if (checkIfServerIsRunnning(4723)) {
			stopServer();
		}
		startServer();

	}

	@BeforeTest
	public void launchApp() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.1");
		capabilities.setCapability(MobileCapabilityType.UDID, "a49cce0a7d24");
		capabilities.setCapability("deviceName", "Redmi 4");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		capabilities.setCapability(MobileCapabilityType.APP, prop.getProperty("app"));
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
		capabilities.setCapability("appWaitActivity", "io.selendroid.testapp.HomeScreenActivity");
		capabilities.setCapability("appWaitPackage", "io.selendroid.testapp");
		capabilities.setCapability("autoGrantPermissions", true);

		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest(alwaysRun = true)
	public void closeApp() throws Exception {
		if (driver != null) {
			driver.quit();
		}
	}

	@AfterSuite
	public void stopAppiumServer() {
		stopServer();
	}

}

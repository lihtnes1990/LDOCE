package com.openandclosetheapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class MultipleDevices {

	protected AppiumDriver driver;
	public String optVal = null;
	public String setMobileNumber = null;
	public static String FirstMobileNumber = "";
	public static String SecondMobileNumber = "";
	public static String device = "Android";
	public static String platformName = "Android";
	public static String appPackage = "com.mobifusion.android.ldoce5";
	public static String appActivity = ".Activity.WelcomeActivity";
	public static String firstDeviceName = "4d007b8a4b324193";
	public static String SecondDeviceName = "090c0e13";
	public static String ThirdDeviceName = "";

	@BeforeClass
	@Parameters({ "port", "deviceID" })
	public void startTime(String port1, String device_id) throws IOException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);

		if (device_id.equalsIgnoreCase(firstDeviceName)) {
			System.out.println(port1 + "-" + System.currentTimeMillis());
			System.out.println(device_id + "-" + System.currentTimeMillis());
			capabilities.setCapability("deviceName",firstDeviceName);
			capabilities.setCapability("udid", firstDeviceName);
			capabilities.setCapability("platformVersion", "5.0.2");

		} else if (device_id.equalsIgnoreCase(SecondDeviceName)) {
			System.out.println(port1 + "-" + System.currentTimeMillis());
			System.out.println(device_id + "-" + System.currentTimeMillis());
			capabilities.setCapability("deviceName", SecondDeviceName);
			capabilities.setCapability("udid", SecondDeviceName);
			capabilities.setCapability("platformVersion", "5.1.1");

		} /*else if (device_id.equalsIgnoreCase(ThirdDeviceName)) {
			System.out.println(port1 + "-" + System.currentTimeMillis());
			System.out.println(device_id + "-" + System.currentTimeMillis());
			capabilities.setCapability("deviceName", ThirdDeviceName);
			capabilities.setCapability("udid", ThirdDeviceName);
			capabilities.setCapability("platformVersion", "5.1");

		}*/

		driver = new AndroidDriver(new URL("http://localhost:4444/wd/hub"),
				capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	}

	@AfterClass
	public void closeTheApp() {

		driver.quit();

	}
}

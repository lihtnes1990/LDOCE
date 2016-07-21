package com.openandclosetheapp;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.awt.AWTException;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class AppOpening {
	

	protected AppiumDriver driver;

	@Parameters({ "devices" })
	@BeforeClass
	public void lanuch(String devices) throws MalformedURLException,
			InterruptedException, AWTException {

		System.out.println("Devices vale----"+devices);
		if (devices.equals("android_1")) {
			System.out.println("android 1");
			File app = new File("D://Automation//app-debug-unaligned.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "Samsung 5");

			capabilities.setCapability("platformVersion", "5.0.2");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage",
					"com.mobifusion.android.ldoce5"); // Replace
			// with
			// your
			// app's
			// package
			capabilities.setCapability("appActivity",
					".Activity.WelcomeActivity"); // Replace
													// with
													// app's
													// Activity
			capabilities.setCapability("noReset", true);
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
					capabilities);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		else if (devices.equals("android_2")) {
			System.out.println("Android 2");
			File app = new File("D://Automation//app-debug-unaligned.apk");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "Nexus 6");

			capabilities.setCapability("platformVersion", "5.1.1");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("appPackage",
					"com.mobifusion.android.ldoce5"); // Replace
			// with
			// your
			// app's
			// package
			capabilities.setCapability("appActivity",
					".Activity.WelcomeActivity"); // Replace
													// with
													// app's
													// Activity
			capabilities.setCapability("noReset", true);
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
					capabilities);

			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}


}

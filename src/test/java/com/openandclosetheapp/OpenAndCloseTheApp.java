package com.openandclosetheapp;

import java.awt.AWTException;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.modules.Appium_Config;

public class OpenAndCloseTheApp {

	protected AppiumDriver driver;
	
	AppiumDriverLocalService service;

	 @BeforeClass
	 public void openTheLongmanApp() throws Exception {
		/* Appium_Config.stopAppium();
		 Appium_Config.startAppium();*/
	 // File app = new File("D://Automation//app-debug-unaligned.apk");
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  //capabilities.setCapability("deviceName", "4d007b8a4b324193");
	  capabilities.setCapability("deviceName", "192.168.169.101:5555");
	  capabilities.setCapability("platformName", "Android");
	  capabilities.setCapability("platformVersion", "4.4.4");
	  //capabilities.setCapability("app", app.getAbsolutePath());
	  capabilities.setCapability("appPackage","com.mobifusion.android.ldoce5"); 
	  //capabilities.setCapability("appActivity","com.mobifusion.android.ldoce5.Activity.WelcomeActivity"); 
	  capabilities.setCapability("appActivity","com.mobifusion.android.ldoce5.Activity.LicenseCheck");
	  //capabilities.setCapability("noReset", false);
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	 
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	  
	 }
	 
	@AfterClass
	public void closeTheApp() {

		driver.quit();
		//Appium_Config.stopAppium();

	}
}

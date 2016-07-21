package com.modules;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

public class MobileGestures {
	
	public AppiumDriver driver;
	
	public MobileGestures(AppiumDriver driver) {
		this.driver = driver;
		
	}
	
	public void longPressOnElement(WebElement el)
	{
		TouchAction tAction=new TouchAction(driver);
		tAction.longPress(el).perform();
		
	}

	public void swipe()
	{
		
	}
}

package com.modules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;

public class CommonModules {
	
	protected AppiumDriver driver;
	
	By slideMenuIcon  =By.id("com.mobifusion.android.ldoce5:id/slideMenuButton");
		
	public CommonModules(AppiumDriver driver)
	{
		this.driver=driver;
	}
	
	
	//Navigate back to index page
	public void navigateBack()
	{
	driver.navigate().back();
	}

	
	public boolean clickOnSlideMenuButton() {
		// TODO Auto-generated method stub

		try {
			
			driver.findElement(slideMenuIcon).click();
			Thread.sleep(5000);
			return true;
		} catch (Exception e) {
			System.out.println("Driver didnt click on Slide menu icon" + " "
					+ e);
			return false;
		}

	}
	
	
	public boolean compareTwoList(List<String> expectedSublinks,List<String> actualSublinks)
	{
		return expectedSublinks.toString().contentEquals(actualSublinks.toString())?true:false;
	}
	
}

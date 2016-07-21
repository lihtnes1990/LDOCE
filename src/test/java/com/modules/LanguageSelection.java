package com.modules;

import java.util.List;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LanguageSelection {
	
	@FindBy(id="com.pearson.ldoce6:id/spinner_textview")
	WebElement tapOnLanguageDropDown;
	
	@FindBy(className="android.widget.LinearLayout")
	List<WebElement> selectLanguage;
	
	public AppiumDriver driver;
	public LanguageSelection(AppiumDriver driver)
	{
		this.driver = driver;

		PageFactory.initElements(driver, this);
		
	}

	public void clickOnLanguageDropDown()
	{
		tapOnLanguageDropDown.click();
	}
	
	
	public void selectLanguage(String language)
	{
	
		
		for(int i=0;i<selectLanguage.size();i++)
		
	if(selectLanguage.get(i).equals(language))
	{
		selectLanguage.get(i).click();
		
		System.out.println(selectLanguage.get(i));
	}
		  //  selectLanguage.get(indexRussian).click();
		
	}
	
}

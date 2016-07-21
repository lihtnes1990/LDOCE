package com.pages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoreVocabularyPageMobile {

	protected AppiumDriver driver;

	By coreVocabularyMenuLink = By.name("Core Vocabulary");

	By slideMenuIcon = By
			.id("com.mobifusion.android.ldoce5:id/slideMenuButton");
	
	By coreVocabularyFilters=By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout");
	
	By dropDown=By.id("com.mobifusion.android.ldoce5:id/spinner_textview");
	
	By selectFilterFromDropDwon=By.id("com.mobifusion.android.ldoce5:id/spinner_dropdown_textview");
    
	
	// constructor
	public CoreVocabularyPageMobile(AppiumDriver driver) {
		this.driver = driver;
	}

	
	//Tap on the slide menu icon
	public boolean tapOnMenuIcon() {

		try {
			driver.findElement(slideMenuIcon).click();
			return true;

		} catch (Exception e) {
			System.out.println("tapOnMenuIcon: Driver didnt click on the menu icon" + "" + e);
			return false;
		}

	}
	
	
	//Get the core vocabulary link text
	public String getCoreVocabularyLinkLabel()
	{
		try{
			return driver.findElement(coreVocabularyMenuLink).getText();
		}
		catch(Exception e)
		{
			System.out.println("Unable to get the core vocabulary label name"+ ""+e);
			return null;
		}
	}
	
	
	//Tap on the core vocabulary link
	public boolean tapOnCoreVocabularyLink() {
		try {
			driver.findElement(coreVocabularyMenuLink).click();
			return true;
		} catch (Exception e) {
			System.out.println("Driver didnt click on corevocabulary link" + e);
			return false;
		}
	}
	
	
	//Tap on coreVocabulary filters dropdown
	public boolean tapOnFiltersDropDown()
	{
		try{
			driver.findElement(dropDown).click();
			return true;
		}catch(Exception e)
		{
			System.out.println("tapOnFiltersDropDown() : Driver didnt tap on filter dropdown"+e);
			return false;
		}
		
		
	}

	//Get the coreVocabulary Filters count
	public int getFiltersCount() throws InterruptedException
	{
		Thread.sleep(5000);
		try{
		 return  driver.findElements(coreVocabularyFilters).size();
		}catch(Exception e)
		{
			System.out.println("getFiltersCount() : Driver dint get the size of the filters"+""+e);
			return (Integer) null;
		}
		
	}
	
	
	
	//Get the filter name from the dropDown
	public String getCoreVocabularyFilterName(int index)
	{
		try{
			 return  driver.findElements(coreVocabularyFilters).get(index).toString();
			}catch(Exception e)
			{
				System.out.println("getFiltersCount() : Driver dint get the filter name"+""+e);
				return  null;
			}
	}
	
	//Select filter from the dropdown
	public boolean selectFilterFromDropDown(String name)
	{
		try
		{
			driver.findElement(By.name(name)).click();
			return true;
			
		}catch(Exception e)
		{
			System.out.println("Filter is not selected from the dropdwon"+ e);
			return false;
		}
	}
	
	//Getting a word from core vocabulary page to confirm that filters selection is working as expected
	public String getAWordFromCvPage(String word)
	{
		try{
		
		return driver.findElementByName(word).getText();
		}
		catch(Exception e){
			System.out.println("No word fetched from core vocabulary page"+""+e);
			return null;
		}
	}
	
}
package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaces.CoreVocabularyInterface;

import io.appium.java_client.AppiumDriver;

public class CoreVocabularyPage implements CoreVocabularyInterface {

	protected AppiumDriver driver;

	@FindBy(xpath="//android.widget.TabWidget/android.widget.LinearLayout")
	List<WebElement> coreVocabulary;
	
	@FindBy(id="android:id/search_bar")
	WebElement searchBar;

	@FindBy(id="com.pearson.ldoce6:id/core_voc_title")
	WebElement coreVocabularyTitle;
	
	
	@FindBy(id="com.pearson.ldoce6:id/core_voc_filter_spinner")
	WebElement coreVocabularyFilterDropdown;
	
		
	By corevocabulary=By.name("");
	
	
	@FindBy(xpath="//android.widget.ListView/android.widget.LinearLayout/android.widget.TextView")
	List<WebElement> highFrequencyFilterWords;
	
	public CoreVocabularyPage(AppiumDriver driver)

	{
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}


	public void navigateToCoreVocabularyPage() {
		// TODO Auto-generated method stub
		
		coreVocabulary.get(2).click();
		
	}

	public void coreVocabularyTabisDisplayed() {
		// TODO Auto-generated method stub
		coreVocabulary.get(2).isDisplayed();
	}


	public void coreVocabularyTitleisDisplayed() {
		// TODO Auto-generated method stub
		coreVocabularyTitle.isDisplayed();
	}


	public void isSearchBarDisplayed() {
		// TODO Auto-generated method stub
		searchBar.isDisplayed();
	}




	public String getCoreVocabularyTitle() {
		// TODO Auto-generated method stub
		return coreVocabularyTitle.getText();
	}


	public void coreVocabularyFilterDropdownidDisplayed() {
		// TODO Auto-generated method stub
		coreVocabularyFilterDropdown.isDisplayed();
	}


	public void clickOnCoreVocabularyDropdown() {
		// TODO Auto-generated method stub
		coreVocabularyFilterDropdown.click();
	
		
	}

 public void selectFilterFromDropdown(String filter)
 {
	 
	 driver.findElement(By.name(filter)).click();
 }
	


	public int getRightSideIndexSize() {
		// TODO Auto-generated method stub
		return 0;
	}


	public int getCoreVocabularyFiltersSize() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void rightSideIndexisDisplayed() {
		// TODO Auto-generated method stub
		
	}

public int getHighFrequencyWordsCount()
{
	
  return highFrequencyFilterWords.size();
}


public String getHighFrequencyWords()
{
	
  return highFrequencyFilterWords.get(1).getText();
}


public void searchBarisDisplayed() {
	// TODO Auto-generated method stub
	
}

	

	
	
	
}

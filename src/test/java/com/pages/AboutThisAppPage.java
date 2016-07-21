package com.pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;

public class AboutThisAppPage {

	protected AppiumDriver driver;

	By aboutThisAppLabel = By.name("About this app");

	By aboutSubLinks = By.id("com.mobifusion.android.ldoce5:id/rowText");

	By WelcomeToLongman = By.name("Welcome to Longman");

	By pronunciationTable = By.name("Pronunciation Table");

	By ShortformsAndLabels = By.name("Short forms and labels");

	By GrammarCodesAndPatterns = By.name("Grammar Codes and Patterns");

	By academicWordList = By.name("Academic Word List");

	By tutorial = By.name("Tutorial");

	By emailSupport = By.name("Email Support");

	By tellAFriend = By.name("Tell a friend");

	By copyright = By.name("Copyright");

	By acknowledgements = By.name("Acknowledgements");
	
	By welcomeToLongmanSublinks=By.id("com.mobifusion.android.ldoce5:id/rowText");
	
		
	public static final String welcomeLabel="Welcome to Longman";
	
	public static final String pronunciationtable="Pronunciation table";
	
	public static final String shortforms="Short forms and labels";
		

	List<String> aboutThisAppSubLinksExpected = new ArrayList<String>();

	public AboutThisAppPage(AppiumDriver driver) {
		this.driver = driver;
	}

	/* Navigating back from current screen */
	public void navigateBack() {
		driver.navigate().back();

	}

	/* About this app link in menu */
	public boolean aboutThisAppLinkDisplayed() {
		try {
			driver.findElement(aboutThisAppLabel).isDisplayed();
			return true;
		} catch (Exception e) {
			System.out
					.println("About this app link is not present inside the menu"
							+ " " + e);
			return false;
		}

	}

	/* Navigating to About This App Page */
	public boolean navigateToAboutThisAppPage() {
		try {
			driver.findElement(aboutThisAppLabel).click();

			Thread.sleep(1000);
			return true;
		} catch (Exception e) {
			System.out.println("Driver did not click on About This App link"
					+ " " + e);
			return false;
		}

	}

	/* Get the text of About this App label */

	public String getAboutThisAppLabelText() {
		try {
			String LabelName = driver.findElement(aboutThisAppLabel).getText();
			return LabelName;
		} catch (Exception e) {
			System.out
					.println("Driver not able to get About this App label name"
							+ " " + e);
			return null;
		}
	}

	/* Actual Sublinks of About This App page */
	public List<String> getAboutThisAppActualSubLinks() {
		List<String> aboutThisAppLinks = new ArrayList<String>();
		try {
			List<WebElement> subLinks = driver.findElements(aboutSubLinks);

			for (WebElement links : subLinks) {
				aboutThisAppLinks.add((links.getText()));
			}

			return aboutThisAppLinks;
		} catch (Exception e) {
			System.out
					.println("Unable to get the sublinks of About This App menu"
							+ " " + e);
			return null;
		}
	}

	/* Expected sub links of About This App page */
	public List<String> getExpectedSublinks() {
		String[] Sublinks = { "Welcome to Longman", "Pronunciation Table",
				"Short forms and labels", "Academic Word List",
				"Grammar Codes and Patterns", "Tutorial", "Email support",
				"Tell a friend", "Copyright","Acknowledgements" };
		for (String link : Sublinks) {
			aboutThisAppSubLinksExpected.add(link);
		}

		return aboutThisAppSubLinksExpected;
	}

	/* WelcomeToLongman link clickable */
	public boolean isWelcomeToLongmanClickable() {
		try {
			driver.findElement(WelcomeToLongman).click();
			return true;
		} catch (Exception e) {
			System.out.println("Welcome Link is not clickable" + " " + e);
			return false;
		}

	}

	/* Pronunciation Table link clickable */
	public boolean isPronunciationTableClickable() {
		try {
			driver.findElement(pronunciationTable).click();
			return true;
		} catch (Exception e) {
			System.out.println("Pronunciation Table Link is not clickable"
					+ " " + e);
			return false;
		}

	}

	/* Shortforms And Labels Table link clickable */
	public boolean isShortformsAndLabelsClickable() {
		try {
			driver.findElement(ShortformsAndLabels).click();
			return true;
		} catch (Exception e) {
			System.out.println("Shortforms Link is not clickable" + " " + e);
			return false;
		}

	}

	/* Grammar Codes and Patterns link clickable */
	public boolean isGrammarCodesAndPatternsClickable() {
		try {
			driver.findElement(GrammarCodesAndPatterns).click();
			return true;
		} catch (Exception e) {
			System.out
					.println("Grammar Codes and Pattern Link is not clickable"
							+ " " + e);
			return false;
		}

	}

	/* Academic Word List link clickable */
	public boolean isAcademicWordListClickable() {
		try {
			driver.findElement(academicWordList).click();
			return true;
		} catch (Exception e) {
			System.out.println("Academic Word List Link is not clickable" + " "
					+ e);
			return false;
		}

	}

	/* Tutorial link clickable */
	public boolean isTutorialClickable() {
		try {
			driver.findElement(tutorial).click();
			return true;
		} catch (Exception e) {
			System.out.println("Tutorial Link is not clickable" + " " + e);
			return false;
		}

	}

	/* Email Support link clickable */
	public boolean isEmailSupportClickable() {
		try {
			driver.findElement(emailSupport).click();
			return true;
		} catch (Exception e) {
			System.out.println("Email Support Link is not clickable" + " " + e);
			return false;
		}

	}

	/* Tell a friend link clickable */
	public boolean isTellAFriendClickable() {
		try {
			driver.findElement(tellAFriend).click();
			return true;
		} catch (Exception e) {
			System.out.println("Tell A Friend Link is not clickable" + " " + e);
			return false;
		}

	}

	/* Copyright link clickable */
	public boolean isCopyrightClickable() {
		try {
			driver.findElement(copyright).click();
			return true;
		} catch (Exception e) {
			System.out.println("Copyright Link is not clickable" + " " + e);
			return false;
		}

	}

	/* Acknowledgements link clickable */
	public boolean isAcknowledgementsClickable() {
		try {
			driver.findElement(acknowledgements).click();
			return true;
		} catch (Exception e) {
			System.out.println("Acknowledgements Link is not clickable" + " "
					+ e);
			return false;
		}

	}

		
	public String getWelcomeToLongmanLabel()
	{
		try
		{
			return driver.findElement(WelcomeToLongman).getText();
		}catch(Exception e)
		{
			System.out.println("Welcome To Longman label is missing in Welcome to Longman Page"+" "+e);
			return null;
		}
	}
	
	public List<String> expectedWelcomeToLongmanSublinks()
	{
		String[] links={"Foreword","Introduction"};
		List<String> expectedSublinks =new ArrayList<String>();
		
		for(int i=0;i<links.length;i++)
		{
			expectedSublinks.add(links[i]);
		}
		return expectedSublinks;
	}
	
	
	
  public List<String> actualWelcomeToLongmanSublinks()
  {
	  List<String> actualSublinks =new ArrayList<String>();
	  try
		{
			List<WebElement> subLinks=driver.findElements(welcomeToLongmanSublinks);
			for(WebElement link:subLinks){
				
				actualSublinks.add(link.getText());
				
			}
			
				 return actualSublinks;
			 
		}catch(Exception e)
		{
			System.out.println("Welcome to Longman Sublinks are missing"+" "+e);
			return null;
		}
  }
	
	
	
}

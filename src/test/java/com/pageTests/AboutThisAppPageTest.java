package com.pageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.modules.CommonModules;
import com.openandclosetheapp.OpenAndCloseTheApp;
import com.pages.AboutThisAppPage;

public class AboutThisAppPageTest extends OpenAndCloseTheApp {
	
	/*
	 * Verifying the About This App link is present inside the menu panel
	 * 
	 * */
	@Test()
	public void verifyAboutThisAppLinkDisplayed()
	{
		AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
		CommonModules commonModules =new CommonModules(driver);
		Assert.assertTrue(commonModules.clickOnSlideMenuButton());
		Assert.assertTrue(aboutThisAppPage.aboutThisAppLinkDisplayed());
		commonModules.navigateBack();
	}
	
	
	//Verifying the navigation to the About this app page
	@Test()
	public void verifyNavigationToAboutThisAppPage()
	{
		AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
		CommonModules commonModules =new CommonModules(driver);
		Assert.assertTrue(commonModules.clickOnSlideMenuButton());
		Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
		commonModules.navigateBack();
		
	}
	
	//Verifying the About This App label name
	
	@Test()
	public void verifyAboutThisAppLabelName()
	{
		AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
		CommonModules commonModules =new CommonModules(driver);
		Assert.assertTrue(commonModules.clickOnSlideMenuButton());
		Assert.assertEquals(aboutThisAppPage.getAboutThisAppLabelText(),"About this app");
		commonModules.navigateBack();
	}
	
  @Test()
 public void verifyAboutThisAppSubLinksCount()
 {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertEquals(aboutThisAppPage.getAboutThisAppActualSubLinks().size(),10);
	  commonModules.navigateBack();
	  
 }
  
  
  @Test()
  public void verifyAboutThisAppSubLinksPresence()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.getExpectedSublinks().containsAll(aboutThisAppPage.getAboutThisAppActualSubLinks()),"About This App options are missing");
	  commonModules.navigateBack();
	  
  }
  
   @Test()
  public void verifyWelcomeToLongmanLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isWelcomeToLongmanClickable());
	  commonModules.navigateBack();
	  
  }
  
  @Test()
  public void verifyPronunciationTableLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isPronunciationTableClickable());
	  commonModules.navigateBack();
	  
  }
  
 @Test()
  public void verifyShortFormsAndLabelsLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isShortformsAndLabelsClickable());
	  commonModules.navigateBack();
	  
  }
  
  @Test()
  public void verifyGrammarCodesAndPatternsLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isGrammarCodesAndPatternsClickable());
	  commonModules.navigateBack();
	  
  }
  
  @Test()
  public void verifyAcademicWordListLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isAcademicWordListClickable());
	  commonModules.navigateBack();
	  
  }
  @Test()
  public void verifyTutorialLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isTutorialClickable());
	  commonModules.navigateBack();
	  
  }

  @Test()
  public void verifyEmailSupportLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isTutorialClickable());
	  commonModules.navigateBack();
	  
  }
  
  @Test()
  public void verifyTellAFriendLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isTellAFriendClickable());
	  commonModules.navigateBack();
	  
  }
  
  @Test()
  public void verifyCopyrightLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isCopyrightClickable());
	  commonModules.navigateBack();
	  
  }
  
  @Test()
  public void verifyAcknowledgementsLinkClickable()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isAcknowledgementsClickable());
	  commonModules.navigateBack();
	  
  }
  
  @Test()
  public void verifyWelcomeLongmanSubLinks()
  {
	  AboutThisAppPage aboutThisAppPage = new AboutThisAppPage(driver);
	  CommonModules commonModules =new CommonModules(driver);
	  Assert.assertTrue(commonModules.clickOnSlideMenuButton());
	  Assert.assertTrue(aboutThisAppPage.navigateToAboutThisAppPage());
	  Assert.assertTrue(aboutThisAppPage.isWelcomeToLongmanClickable());
	  Assert.assertEquals(aboutThisAppPage.getWelcomeToLongmanLabel(),"Welcome to Longman");
	  Assert.assertTrue(commonModules.compareTwoList(aboutThisAppPage.expectedWelcomeToLongmanSublinks(),aboutThisAppPage.getAboutThisAppActualSubLinks()),"Sub Links are missing");
	  commonModules.navigateBack();
	  
  }
  
  
}

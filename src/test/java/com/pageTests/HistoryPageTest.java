package com.pageTests;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.interfaces.HistoryPageInterface;
import com.modules.MobileGestures;
import com.openandclosetheapp.AppOpening;
import com.openandclosetheapp.MultipleDevices;
import com.openandclosetheapp.OpenAndCloseTheApp;
import com.pages.HistoryPage;

public class HistoryPageTest extends OpenAndCloseTheApp implements
		HistoryPageInterface {

	List<String> generatedList;
	List<String> historyPageList;

	// Clearing the previous History
	@BeforeClass
	public void clearHistoryPage() {

		HistoryPage historyPage = new HistoryPage(driver);
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());

		// Deleting all the words from history page
		try {

			driver.findElement(By.name("No History")).isDisplayed();
			driver.navigate().back();

		} catch (Exception e) {

			System.out.println("Clearing all the words from History Page" + " "
					+ e);
			historyPage.clearingHistoryPage();

		}

	}

	 @Test
	public void verifyNavigationToHistoryPage() {

		HistoryPage historyPage = new HistoryPage(driver);
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());
		Assert.assertEquals(historyPage.getHistoryPageTitle(), "History",
				"User not able to navigate to History Page from Menu Panel");
	}

	@Test
	public void verifyHistoryPageTitleLabel() {

		HistoryPage historyPage = new HistoryPage(driver);
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());
		Assert.assertEquals("History", historyPage.getHistoryPageTitle());

	}

	@Test
	public void verifyHistoryPageTitleIsDisplayed() {
		HistoryPage historyPage = new HistoryPage(driver);
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());

		// /Verifying history page title
		Assert.assertTrue(historyPage.historyPageTitleDisplayed());

	}

	/* Verify that User searched words are added into history page */
  @Test
	public void verifyWordsAddedIntoHistory() throws InterruptedException {
		// TODO Auto-generated method stub
		HistoryPage historyPage = new HistoryPage(driver);
		generatedList = historyPage.addingWordsIntoHistory();
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());
		historyPageList = historyPage.getHistoryPageWordsList();
		Assert.assertTrue(historyPageList.containsAll(generatedList));

	}

	@Test()
	public void verifyDeleteFunctionality() {
		// TODO Auto-generated method stub
		HistoryPage historyPage = new HistoryPage(driver);
		historyPage.addingWordsIntoHistory();
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());
		// Deleting single word from history
		historyPage.removeWordFromHistory();

		/*
		 * historyPageList = historyPage.getHistoryPageWordsList();
		 * Assert.assertTrue(historyPageList.size() == 9);
		 */

		// Deleting all the words from history page

	}

	@Test()
	public void verifyMultipleDeleteFunctionality() {
		HistoryPage historyPage = new HistoryPage(driver);
		historyPage.addingWordsIntoHistory();
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());
		Assert.assertTrue(historyPage.removeAllWrodsFromHistory());
	}

	@Test()
	public void verifyDeleteAllMessageText() {
		// TODO Auto-generated method stub
		HistoryPage historyPage = new HistoryPage(driver);
		Assert.assertTrue(historyPage.addWordInHistory());
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());
		Assert.assertEquals(historyPage.getDeleteAllMessageText(),
				"Are you sure you want to delete all your history?");

	}
	
	//@Test()
	public void verifyHistoryPageIsScrolable()
	{
		HistoryPage historyPage = new HistoryPage(driver);
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());
		Assert.assertEquals(historyPage.scrollHistoryPage("abdomen"),"abdomen");
		
	}
	
	
	/*Verify the navigation to detailed page from history*/
	@Test()
	public void verifyNavigationToDetailedPageFromHistory()
	{
		HistoryPage historyPage = new HistoryPage(driver);
		Assert.assertTrue(historyPage.addWordInHistory());
		Assert.assertTrue(historyPage.clickOnSlideMenuButton());
		Assert.assertTrue(historyPage.navigateToHistoryPage());
		Assert.assertTrue(historyPage.navigateToDetailedPage());
		
	}

}

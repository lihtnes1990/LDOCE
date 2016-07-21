package com.pages;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaces.HistoryPageInterface;
import com.modules.MobileGestures;

public class HistoryPage {

	List<String> HistoryPageList = new ArrayList<String>();
	List<String> SearchedWordsList = new ArrayList<String>();

	@FindBy(name = "History")
	WebElement historyPageNavigation;

	@FindBy(name = "Core Vocabulary")
	WebElement coreVocabularyLink;

	@FindBy(id = "com.mobifusion.android.ldoce5:id/slideMenuButton")
	WebElement slideMenuIcon;

	@FindBy(id = "com.mobifusion.android.ldoce5:id/history_title")
	WebElement historyTitle;

	@FindBy(id = "com.mobifusion.android.ldoce5:id/context_menu_selectAll")
	WebElement selectAllButton;

	@FindBy(id = "com.mobifusion.android.ldoce5:id/context_menu_delete")
	WebElement deleteButton;

	@FindBy(id = "android:id/button1")
	WebElement yesButton;

	@FindBy(id = "android:id/button2")
	WebElement cancelButton;

	By confirmationMessage = By.id("android:id/message");

	By naviagteToDetailedPage = By.name("abdomen");

	By addingWordsIntoHistory = By
			.xpath("//android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.TextView");

	By getHistoryPageWords = By
			.xpath("//android.widget.ListView/android.widget.LinearLayout/android.widget.TextView");

	AppiumDriver driver;

	public HistoryPage(AppiumDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean clickOnSlideMenuButton() {
		// TODO Auto-generated method stub

		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			slideMenuIcon.click();
			return true;
		} catch (Exception e) {
			System.out.println("Driver didnt click on Slide menu icon" + " "
					+ e);
			return false;
		}

	}

	/* navigating to history page */
	public boolean navigateToHistoryPage() {
		// TODO Auto-generated method stub
		try {
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			historyPageNavigation.click();

			return true;
		} catch (Exception e) {
			System.out
					.println("Driver did not click on History link in menu panel"
							+ " " + e);
			return false;
		}

	}

	/* Adding words into history page */
	public List<String> addingWordsIntoHistory() {
		List<String> SearchedWordsList = new ArrayList<String>();
		slideMenuIcon.click();
		coreVocabularyLink.click();

		try {
			List<WebElement> list = driver.findElements(addingWordsIntoHistory);

			for (int i = 0; i < list.size(); i++) {
				SearchedWordsList.add(list.get(i).getText()
						.replaceAll("\\d", ""));
				list.get(i).click();

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				navigateBack();
			}
			return SearchedWordsList;

		} catch (Exception e) {
			System.out.println("" + e);
			return null;
		}

	}

	/* Getting history page title */
	public String getHistoryPageTitle() {
		// TODO Auto-generated method stub
		return historyTitle.getText();
	}

	/* History page title is displayed */
	public boolean historyPageTitleDisplayed() {
		// TODO Auto-generated method stub
		try {
			historyTitle.isDisplayed();
			return true;
		} catch (Exception e) {
			System.out.println("History page does not have title on Top" + " "
					+ e);
			return false;
		}
	}

	public List<String> getHistoryPageWordsList() throws InterruptedException {

		try {
			List<WebElement> list = driver.findElements(getHistoryPageWords);

			for (int i = 0; i < list.size(); i++) {
				HistoryPageList.add(list.get(i).getText());
				Thread.sleep(1000);
			}

			return HistoryPageList;

		} catch (Exception e) {
			System.out.println("No words available in History Page" + "" + e);
			return null;
		}
	}

	public void removeWordFromHistory() {

		// mobileGestures.longPressOnElement(driver.findElement(By.id("com.pearson.ldoce6:id/rowText")));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		TouchAction touchAction = new TouchAction(driver);
		touchAction.longPress(
				driver.findElement(By
						.id("com.mobifusion.android.ldoce5:id/rowText")))
				.perform();

		deleteButton.click();
		// driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

	}

	public boolean removeAllWrodsFromHistory() {

		try {
			TouchAction touchAction = new TouchAction(driver);
			touchAction.longPress(
					driver.findElement(By
							.id("com.mobifusion.android.ldoce5:id/rowText")))
					.perform();
			selectAllButton.click();
			deleteButton.click();
			yesButton.click();
			return true;

		} catch (Exception e) {
			System.out
					.println("Delete All Function is not Working in History Page"
							+ " " + e);
			return false;
		}

	}

	/* Clearing all the words from history page */
	public void clearingHistoryPage() {
		TouchAction touchAction = new TouchAction(driver);
		int ElementCounts = driver.findElements(
				By.id("com.mobifusion.android.ldoce5:id/rowText")).size();

		if (ElementCounts > 1) {

			touchAction.longPress(
					driver.findElement(By
							.id("com.mobifusion.android.ldoce5:id/rowText")))
					.perform();
			selectAllButton.click();
			deleteButton.click();
			yesButton.click();
		} else {
			touchAction.longPress(
					driver.findElement(By
							.id("com.mobifusion.android.ldoce5:id/rowText")))
					.perform();

			deleteButton.click();
			yesButton.click();
		}

		navigateBack();
	}

	/* Getting the Delete ALL Message Text */
	public String getDeleteAllMessageText() {

		try {
			TouchAction touchAction = new TouchAction(driver);
			touchAction.longPress(
					driver.findElement(By
							.id("com.mobifusion.android.ldoce5:id/rowText")))
					.perform();
			deleteButton.click();

			String Message = driver.findElement(confirmationMessage).getText();
			navigateBack();
			return Message;

		} catch (Exception e) {
			System.out.println("Driver failed to get DELETE ALL MESSAGE TEXT"
					+ " " + e);
			return null;
		}

	}

	/* Adding a word into history */
	public boolean addWordInHistory() {
		try {
			slideMenuIcon.click();
			coreVocabularyLink.click();
			driver.findElement(By.name("abdomen")).click();
			navigateBack();
			return true;
		} catch (Exception e) {
			System.out.println("Not able to add a word into History Page" + " "
					+ e);
			return false;
		}

	}

	/* Navigating back from current screen */
	public void navigateBack() {
		driver.navigate().back();

	}

	/* Scroll up/down the History Page */
	public String scrollHistoryPage(String word) {
		try {
			return driver.scrollToExact(word).getText();

		} catch (Exception e) {
			System.out
					.println("User not able to scroll the HISTORY page UP and Down"
							+ " " + e);
			return null;
		}
	}

	/* Navigating to Detailed Page from history Page */

	public boolean navigateToDetailedPage() {

		try {

			driver.findElement(naviagteToDetailedPage).click();
			navigateBack();

			return true;
		} catch (Exception e) {
			System.out.println("Word abdomen is not present in history page"
					+ " " + e);

			return false;
		}

	}

}

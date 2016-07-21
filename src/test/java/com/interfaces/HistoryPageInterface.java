package com.interfaces;

public interface HistoryPageInterface {

	public void verifyNavigationToHistoryPage();

	public void verifyHistoryPageTitleLabel();

	public void verifyHistoryPageTitleIsDisplayed();

	public void verifyWordsAddedIntoHistory() throws InterruptedException;

	public void verifyDeleteFunctionality();

	public void verifyMultipleDeleteFunctionality();

	public void verifyDeleteAllMessageText();
	/*
	 * public void navigateToHistoryPage(); public void
	 * addingWordsIntoHistory(); public String getHistoryPageTitle(); public
	 * void historyPageTitleDisplayed();
	 */
}

package com.pageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.interfaces.BookmarksPageInterface;
import com.interfaces.FavoritesPageInterface;
import com.interfaces.HistoryPageInterface;
import com.openandclosetheapp.OpenAndCloseTheApp;
import com.pages.FavoritesPage;

public class FavoritesPageTest extends  OpenAndCloseTheApp implements
BookmarksPageInterface {

	
	public void verifyNavigationToFavoritesPage() throws InterruptedException {
		FavoritesPage favoritesPage=new FavoritesPage(driver);
	//	favoritesPage.tapOnMenuPanelIcon();
		favoritesPage.addingWordsIntoFavorites();
	}

	@Test(priority=0)
	public void Verify_bookmarklabel() {
		// TODO Auto-generated method stub
		FavoritesPage favoritesPage=new FavoritesPage(driver);
		Assert.assertTrue(FavoritesPage.tapOnMenuPanelIcon());
		Assert.assertEquals("Bookmarks", FavoritesPage.getBookmark_LabelName());
	}

	@Test(priority=1)
	public void Navigating_To_BookmarkPage() {
		// TODO Auto-generated method stub
		
		try {
			Thread.sleep(2000);
			FavoritesPage favoritesPage=new FavoritesPage(driver);
			//Assert.assertTrue(FavoritesPage.tapOnMenuPanelIcon());
			Thread.sleep(2000);
			Assert.assertTrue(FavoritesPage.verifyBookmarkpage_redirection());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void Verify_AddBookmark_Button() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SortbyWord_A_Z() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SortbyWord_Z_A() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SortbyDate_OldestFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SortbyDate_RecentFirst() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteAllBookmarks() {
		// TODO Auto-generated method stub
		
	}

}

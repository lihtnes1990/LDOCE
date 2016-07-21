package com.pageTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.openandclosetheapp.OpenAndCloseTheApp;
import com.pages.IndexPage;

public class IndexPageTests extends OpenAndCloseTheApp {
	
	/*@Test()
	public void testingIndex() throws InterruptedException
	{
		IndexPage indexPage=new IndexPage(driver);
		Assert.assertEquals(indexPage.getIndex(), "Z");
	}*/

	
	@Test()
	
	public void verifyIndexCount() throws InterruptedException
	{
		IndexPage indexPage=new IndexPage(driver);
		Assert.assertEquals(indexPage.getIndexLettersCount(),"13");
		
	}
	
	@Test()
	public void verifyNavigationToDetailedPage()
	{
		IndexPage indexPage=new IndexPage(driver);
		Assert.assertTrue(indexPage.navigateToDetailedPage("absence"));
	}
}

package com.pageTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.interfaces.CoreVocabularyInterface;
import com.openandclosetheapp.OpenAndCloseTheApp;
import com.pages.CoreVocabularyPage;

public class CoreVocabularyPageTest extends OpenAndCloseTheApp {

	@BeforeClass()
	public void navigateToCoreVocabularyPage() {
		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);

		coreVocabularyPage.navigateToCoreVocabularyPage();

	}

	@Test()
	public void coreVocabularyTabisDisplayed() {
		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.coreVocabularyTabisDisplayed();

	}

	@Test()
	public void sesrchBarisDisplayed() {
		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.searchBarisDisplayed();

	}

	 @Test()
	public void verifyCoreVocabularyTitle() {
		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.coreVocabularyTitleisDisplayed();
		Assert.assertEquals(coreVocabularyPage.getCoreVocabularyTitle(),
				CoreVocabularyInterface.coreVocabularyTitle);

	}

	@Test()
	public void isHighFrequencyFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.highFrequencywords);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"ability");

	}

	@Test()
	public void isMediumFrequencyFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.mediumFrequency);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"abbreviation");

	}

	
	@Test()
	public void isLowerFrequencyFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.lowerFrequency);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"abdomen");

	}
	
	
	@Test()
	public void isAllTopSpokenWordsFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.allTopSpokenWords);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"ability");

	}

	
	@Test()
	public void isTopThousandSpokenWordsFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.topThousandSpokenWords);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"able");

	}

	
	@Test()
	public void isTopTwoThousandSpokenWordsFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.topTwoThousandSpokenWords);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"above1");

	}

	@Test()
	public void isTopThreeThousandSpokenWordsFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.topThreeThousandSpokenWords);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"absence");

	}

	@Test()
	public void isAllTopWrittenWordsFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.allTopWrittenWords);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"abandon1");

	}
	
	@Test()
	public void isTopThousandWrittenWordsFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.topThousandWrittenWords);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"ability");

	}
	
	@Test()
	public void isTwoThousandWrittenWordsFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.topTwoThousandWrittenWords);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"absence");

	}
	
	@Test()
	public void isTopThreeThousandWrittenWordsFilterSelected() {

		CoreVocabularyPage coreVocabularyPage = new CoreVocabularyPage(driver);
		coreVocabularyPage.clickOnCoreVocabularyDropdown();
		coreVocabularyPage
				.selectFilterFromDropdown(CoreVocabularyInterface.topThreeThousandWrittenWords);

		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWordsCount(), 12);
		Assert.assertEquals(coreVocabularyPage.getHighFrequencyWords(),
				"above2");

	}
	
	
	// @Test()

	public void getList() {

		List<WebElement> lists = driver.findElements(By
				.cssSelector(".android.widget.ListView"));
		// List<WebElement> lists=
		// driver.findElements(By.xpath("//android.widget.ListView/android.widget.LinearLayout/android.widget.TextView"));

		System.out.println(lists.size());
		for (int i = 0; i < lists.size(); i++) {

			System.out.println(lists.get(i).getText());

		}

	}
}

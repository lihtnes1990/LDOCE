package com.pageTests;

import io.appium.java_client.TouchAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.modules.CommonModules;
import com.openandclosetheapp.OpenAndCloseTheApp;
import com.pages.CoreVocabularyPageMobile;

public class CoreVocabularyPageMobileTest extends OpenAndCloseTheApp {

	// Verify coreVocabulary Label Name
	@Test()
	public void verifyCoreVocabularyLabelName() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertEquals(
				coreVocabularyPageMobile.getCoreVocabularyLinkLabel(),
				"Core Vocabulary");
		commonModules.navigateBack();
		Thread.sleep(3000);
	}

	// Navigate to core vocabulary page
	@Test()
	public void navigateToCoreVocabularyPage() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		commonModules.navigateBack();
		Thread.sleep(3000);

	}

	// Verify core vocabulary page has Title "Core Vocabulary"
	@Test()
	public void verifyCoreVocabularyPageTitle() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertEquals(
				coreVocabularyPageMobile.getCoreVocabularyLinkLabel(),
				"Core Vocabulary");
		commonModules.navigateBack();
		Thread.sleep(3000);

	}

	// Verify the core vocabulary filters count
	//@Test()
	public void verifyCoreVocabularyFiltersCount() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertEquals(coreVocabularyPageMobile.getFiltersCount(), "12");
		Thread.sleep(3000);
		coreVocabularyPageMobile.selectFilterFromDropDown("All 9000 Words");
		commonModules.navigateBack();

	}

	// Verify that filter "All 9000 Words" is selected
	@Test()
	public void verifyAllNineThousandWordsSelected()
			throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("All 9000 Words"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("abbreviation"),
				"abbreviation");

		commonModules.navigateBack();
	}

	// Verify that filter "High frequency" is selected
	@Test()
	public void verifyHighFrequencySelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("High frequency"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("abroad"), "abroad");
		commonModules.navigateBack();
	}

	// Verify that filter "Medium frequency" is selected

	@Test()
	public void verifyMediumFrequencySelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("Medium frequency"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("absurd"), "absurd");
		commonModules.navigateBack();
	}

	// Verify that filter "Lower frequency" is selected
	@Test()
	public void verifyLowerFrequencySelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("Lower frequency"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("abrupt"), "abrupt");
		commonModules.navigateBack();
	}

	// Verify that filter "All top spoken words" is selected
	@Test()
	public void verifyAllTopSpokenWordsSelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("All top spoken words"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("absence"),
				"absence");
		commonModules.navigateBack();
	}

	// Verify that filter "Top 1000 spoken words" is selected
	@Test()
	public void verifyTop1000SpokenWordsSelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("Top 1000 spoken words"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("accept"), "accept");
		commonModules.navigateBack();
	}

	// Verify that filter "Top 2000 spoken words" is selected
	@Test()
	public void verifyTop2000SpokenWordsSelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("Top 2000 spoken words"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("accurate"),
				"accurate");
		commonModules.navigateBack();
	}

	// Verify that filter "Top 3000 spoken words" is selected
	@Test()
	public void verifyTop3000SpokenWordsSelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("Top 3000 spoken words"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("acknowledge"),
				"acknowledge");
		commonModules.navigateBack();
	}

	// Verify that filter "All Top Written words" is selected
	@Test()
	public void verifyAllTopWrittenWordsSelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("All Top Written words"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("ability"),
				"ability");
		commonModules.navigateBack();
	}

	// Verify that filter "Top 1000 written words" is selected
	@Test()
	public void verifyTop1000WrittenWordsSelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("Top 1000 written words"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("according to"),
				"according to");
		commonModules.navigateBack();
	}

	// Verify that filter "Top 2000 written words" is selected
	@Test()
	public void verifyTop2000WrittenWordsSelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("Top 2000 written words"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("accommodation"),
				"accommodation");
		commonModules.navigateBack();
	}

	// Verify that filter "Top 3000 written words" is selected
	@Test()
	public void verifyTop3000WrittenWordsSelected() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnFiltersDropDown());
		Assert.assertTrue(coreVocabularyPageMobile
				.selectFilterFromDropDown("Top 3000 written words"));
		Thread.sleep(3000);
		Assert.assertEquals(
				coreVocabularyPageMobile.getAWordFromCvPage("absorb"), "absorb");
		/*
		TouchAction touchAction = new TouchAction(driver);
		
		touchAction.press(driver.findElementByName("absorb"),1681,1050).longPress(driver.findElementByName("absorb"));
		driver.scrollToExact("zoo");
		touchAction.release();*/
		commonModules.navigateBack();
	}

	
	// @Test()
	public void scrollToBottom() throws InterruptedException {
		CoreVocabularyPageMobile coreVocabularyPageMobile = new CoreVocabularyPageMobile(
				driver);
		CommonModules commonModules = new CommonModules(driver);
		Assert.assertTrue(coreVocabularyPageMobile.tapOnMenuIcon());
		Assert.assertTrue(coreVocabularyPageMobile.tapOnCoreVocabularyLink());

		driver.findElementByName("abnormal").click();
		Thread.sleep(3000);

	}

}

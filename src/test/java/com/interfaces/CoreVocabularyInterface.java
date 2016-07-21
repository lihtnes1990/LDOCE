package com.interfaces;

public interface CoreVocabularyInterface {

	public static final String coreVocabularyTitle = "Core Vocabulary";

	public static final String allNineThousandWords = "All 9000 Words";

	public static final String highFrequencywords = "High frequency";

	public static final String mediumFrequency = "Medium frequency";

	public static final String lowerFrequency = "Lower frequency";

	public static final String allTopSpokenWords = "All top spoken words";

	public static final String topThousandSpokenWords = "Top 1000 spoken words";

	public static final String topTwoThousandSpokenWords = "Top 2000 spoken words";

	public static final String topThreeThousandSpokenWords = "Top 3000 spoken words";

	public static final String allTopWrittenWords = "All Top Written words";

	public static final String topThousandWrittenWords = "Top 1000 written words";

	public static final String topTwoThousandWrittenWords = "Top 2000 written words";

	public static final String topThreeThousandWrittenWords = "Top 3000 written words";

	public void navigateToCoreVocabularyPage();

	public void coreVocabularyTabisDisplayed();

	public void searchBarisDisplayed();

	public void coreVocabularyTitleisDisplayed();

	public String getCoreVocabularyTitle();

	public void coreVocabularyFilterDropdownidDisplayed();

	public void clickOnCoreVocabularyDropdown();

	public int getHighFrequencyWordsCount();
	
	public int getCoreVocabularyFiltersSize();

	public void rightSideIndexisDisplayed();

	public int getRightSideIndexSize();

}

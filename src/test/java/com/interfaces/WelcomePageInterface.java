package com.interfaces;

public interface WelcomePageInterface {

	public static final String weclomeLabel = "Welcome!";
	public static final String chooseYourLanguageLabel = "Choose your language";

	void weclomeLabelisDisplayed();

	String getWelcomeLabelText();

	void ChooseYourLanguageisDisplayed();

	String getChooseYourLanguageText();

	String getChangeTheseSettingsLabel();

	String getStartButtonLabel();

	void changeTheseSettingsLabelisDisplayed();

	void startButtonisDisplayed();

	void clickOnStartButton();

	void verifyLocalisation();

}

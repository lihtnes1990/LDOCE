package com.pages;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.interfaces.WelcomePageInterface;

public class WelcomePage implements WelcomePageInterface {

	protected AppiumDriver driver;

	@FindBy(id = "com.pearson.ldoce6:id/tv_welcome")
	WebElement WelcomeLabel;

	@FindBy(id = "com.pearson.ldoce6:id/tv_choose_lang")
	WebElement ChooseYourLanguage;
	
	@FindBy(id="com.pearson.ldoce6:id/tv_you_can_change")
	WebElement ChangeTheseSettings;
	
	@FindBy(id="com.pearson.ldoce6:id/Start_Button")
	WebElement StartButton;

	
	public WelcomePage(AppiumDriver driver)

	{

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	public String getChooseYourLanguageText() {

		return ChooseYourLanguage.getText();

	}

	public String getWelcomeLabelText() {

		return WelcomeLabel.getText();

	}

	public void weclomeLabelisDisplayed() {
		// TODO Auto-generated method stub
		WelcomeLabel.isDisplayed();

	}

	public void ChooseYourLanguageisDisplayed() {
		// TODO Auto-generated method stub
		ChooseYourLanguage.isDisplayed();

	}

	public void verifyLocalisation() {
		// TODO Auto-generated method stub

	}

	public String getChangeTheseSettingsLabel() {
		// TODO Auto-generated method stub
		return ChangeTheseSettings.getText();
	}

	public String getStartButtonLabel() {
		// TODO Auto-generated method stub
		return StartButton.getText();
	}

	public void changeTheseSettingsLabelisDisplayed() {
		// TODO Auto-generated method stub
		ChangeTheseSettings.isDisplayed();
	}

	public void startButtonisDisplayed() {
		// TODO Auto-generated method stub
		StartButton.isDisplayed();
	}

	public void clickOnStartButton() {
		// TODO Auto-generated method stub
		StartButton.click();

	}

}
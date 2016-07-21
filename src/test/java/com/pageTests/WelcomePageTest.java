package com.pageTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.modules.LanguageSelection;
import com.openandclosetheapp.OpenAndCloseTheApp;
import com.pages.WelcomePage;

public class WelcomePageTest extends OpenAndCloseTheApp {
		

	 @Test()
	public void verifyEnglishLanguageLabels()

	{

		WelcomePage welcomePage = new WelcomePage(driver);
		LanguageSelection languageSelection = new LanguageSelection(driver);
		languageSelection.clickOnLanguageDropDown();

		driver.findElement(By.name("English (UK)")).click();

		Assert.assertEquals(welcomePage.getWelcomeLabelText(), "Welcome!");
		Assert.assertEquals(welcomePage.getChooseYourLanguageText(),
				"Choose your language");
		Assert.assertEquals(welcomePage.getChangeTheseSettingsLabel(),
				"You can change these settings at any time");
		Assert.assertEquals(welcomePage.getStartButtonLabel(), "Start");
		System.out.println((welcomePage.getWelcomeLabelText()));

	}

	
	@Test(dependsOnMethods = { "verifyEnglishLanguageLabels" })
	public void verifyUsEnglishLanguageLabels()

	{

		WelcomePage welcomePage = new WelcomePage(driver);
		LanguageSelection languageSelection = new LanguageSelection(driver);
		languageSelection.clickOnLanguageDropDown();

		driver.findElement(By.name("English (US)")).click();
		Assert.assertEquals(welcomePage.getWelcomeLabelText(), "Welcome!");
		Assert.assertEquals(welcomePage.getChooseYourLanguageText(),
				"Choose your language");
		Assert.assertEquals(welcomePage.getChangeTheseSettingsLabel(),
				"You can change these settings at any time");
		Assert.assertEquals(welcomePage.getStartButtonLabel(), "Start");
		System.out.println((welcomePage.getWelcomeLabelText()));

	}

	@Test()
	public void verifyRussianLanguageLabels() {
		LanguageSelection languageSelection = new LanguageSelection(driver);
		WelcomePage welcomePage = new WelcomePage(driver);

		languageSelection.clickOnLanguageDropDown();
		driver.findElement(By.name("pусский")).click();

		Assert.assertEquals(welcomePage.getWelcomeLabelText(),
				"Добро пожаловать!");
		Assert.assertEquals(welcomePage.getChooseYourLanguageText(),
				"Выберите свой язык");
		Assert.assertEquals(welcomePage.getChangeTheseSettingsLabel(),
				"Вы можете изменить эти настройки в любое время");
		Assert.assertEquals(welcomePage.getStartButtonLabel(), "Начать");
		System.out.println((welcomePage.getWelcomeLabelText()));
	}

	 @Test()
	public void verifyPortugueseLanguageLabels() {
		LanguageSelection languageSelection = new LanguageSelection(driver);
		WelcomePage welcomePage = new WelcomePage(driver);

		languageSelection.clickOnLanguageDropDown();
		driver.findElement(By.name("português")).click();

		
		Assert.assertEquals(welcomePage.getWelcomeLabelText(), "Bem-vindo!");
		Assert.assertEquals(welcomePage.getChooseYourLanguageText(),
				"Escolha o seu idioma");
		Assert.assertEquals(welcomePage.getChangeTheseSettingsLabel(),
				"Você pode alterar essas configurações a qualquer momento");
		Assert.assertEquals(welcomePage.getStartButtonLabel(), "início");

	}

	 @Test()
	public void verifyChineseLanguageLabels() {
		LanguageSelection languageSelection = new LanguageSelection(driver);
		WelcomePage welcomePage = new WelcomePage(driver);

		languageSelection.clickOnLanguageDropDown();
		driver.findElement(By.name("中国（简体）")).click();

		Assert.assertEquals(welcomePage.getWelcomeLabelText(), "欢迎！");
		Assert.assertEquals(welcomePage.getChooseYourLanguageText(), "选择你的语言");
		Assert.assertEquals(welcomePage.getChangeTheseSettingsLabel(),
				"您可以随时更改这些设置");
		Assert.assertEquals(welcomePage.getStartButtonLabel(), "开始");

	}

	@Test()
	public void verifyKoreanLanguageLabels() {
		LanguageSelection languageSelection = new LanguageSelection(driver);
		WelcomePage welcomePage = new WelcomePage(driver);

		languageSelection.clickOnLanguageDropDown();
		driver.findElement(By.name("한국의")).click();

		Assert.assertEquals(welcomePage.getWelcomeLabelText(), "에 오신 것을 환영합니다!");
		Assert.assertEquals(welcomePage.getChooseYourLanguageText(),
				"언어를 선택하세요");
		Assert.assertEquals(welcomePage.getChangeTheseSettingsLabel(),
				"이 설정은 언제든지 변경할 수 있습니다");
		Assert.assertEquals(welcomePage.getStartButtonLabel(), "시작");

	}

	@Test()
	public void verifyJapaneseLanguageLabels() {
		LanguageSelection languageSelection = new LanguageSelection(driver);
		WelcomePage welcomePage = new WelcomePage(driver);

		languageSelection.clickOnLanguageDropDown();
		driver.findElement(By.name("日本の")).click();

		Assert.assertEquals(welcomePage.getWelcomeLabelText(), "ようこそ！");
		Assert.assertEquals(welcomePage.getChooseYourLanguageText(),
				"言語を選択してください");
		Assert.assertEquals(welcomePage.getChangeTheseSettingsLabel(),
				"いつでもこれらの設定を変更できます");
		Assert.assertEquals(welcomePage.getStartButtonLabel(), "スタート");

	}

	@Test()
	public void verifyClickOnStartButton()
	{
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickOnStartButton();
		
	}
	
	
	@Test()
	
	public void locateCoreVocabulary()
	{
		
		//driver.findElement(By.id("android:id/tabs")).click();
		//driver.findElements(By.xpath("//android.widget.TabWidget/android.widget.LinearLayout")).get(3).click();
	}
}